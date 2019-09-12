<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>the Employee is</h3>
<p>Emp Id<%=session.getAttribute("id") %></p>
<p>Name<%=session.getAttribute("name") %></p>
<p>Date of Birth<%=session.getAttribute("dob") %></p>
<p>Salary<%=session.getAttribute("salary") %></p>
<a href="index.jsp">home</a>

</body>
</html>