package com.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ems.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	Connection con;
	@Override
	public Connection getConnection() throws Exception {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ems","sakha-lenovo-1","welcome");
		
		return con;
	}

	@Override
	public boolean save(Employee emp)throws Exception {
		con = getConnection();
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setString(1, emp.getEmpId());
		ps.setString(2, emp.getEmpName());
		LocalDate dobRaw = emp.getDob();
//		String strDate = dobRaw.getYear()+"-"+dobRaw.getMonthValue()+"-"+dobRaw.getDayOfMonth();
//		ps.setString(3,strDate);
		ps.setFloat(4,emp.getBasicSalary());
		ps.setDate(3,new java.sql.Date(dobRaw.getYear()-1900,dobRaw.getMonthValue()-1,dobRaw.getDayOfMonth()));
		int r = ps.executeUpdate();
		
		return r>0?true:false;
	}

	@Override
	public boolean delete(String empId)throws Exception {
		con = getConnection();
		PreparedStatement ps = con.prepareStatement("Delete from employee where empid = ?");
		ps.setString(1,empId);
		
		int r = ps.executeUpdate();
		
		return r>0?true:false;
	}

	@Override
	public boolean update(Employee emp) throws Exception {
		con=getConnection();
		PreparedStatement ps = con.prepareStatement("Update employee set basicsalary=? where empid = ?");
		ps.setFloat(1,emp.getBasicSalary());
		ps.setString(2, emp.getEmpId());
		int r = ps.executeUpdate();
		
		return r>0?true:false;
	}

	@Override
	public Employee getEmployee(String empId)throws Exception
	{
		con= getConnection();
		PreparedStatement ps = con.prepareStatement("select * from employee where empid=?");
		ps.setString(1, empId);
		System.out.println(1);
		ResultSet rs=ps.executeQuery();
		System.out.println(2);
		if(rs.next())
		{
			System.out.println(3);
			java.sql.Date rowdate=rs.getDate(3);
			Employee emp=new Employee(rs.getString(1),rs.getString(2),LocalDate.of(rowdate.getYear(),rowdate.getMonth(),rowdate.getDate()),rs.getFloat(4));
			System.out.println(emp.getEmpName());
			return emp;
		}
		else {
		return null;}
	}

	@Override
	public List<Employee> getAllEmployees() throws Exception {
		
		con= getConnection();
		PreparedStatement ps = con.prepareStatement("select * from employee");
		ResultSet rs=ps.executeQuery();
		List<Employee> emplist = new ArrayList<>();
		while(rs.next())
		{
			java.sql.Date rowdate=rs.getDate(3);
			Employee emp=new Employee(rs.getString(1),rs.getString(2),LocalDate.of(rowdate.getYear(),rowdate.getMonth(),rowdate.getDate()),rs.getFloat(4));
			emplist.add(emp);
		}
		
		return emplist;
	}

}
