<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="Header.jsp"/>
<h3 class="center-align">All Employees</h3><br><br><br>
<div class="container">
<table class="striped">
<thead>
          <tr>
              <th>Employee ID</th>
              <th>Employee Name</th>
              <th>Date of Birth</th>
              <th>Basic Salary</th>
          </tr>
        </thead>
  <c:forEach items="${elist}" var="empl">
    <tr>
      <td><c:out value="${empl.empId}" /></td>
      <td><c:out value="${empl.empName}" /></td>
      <td><c:out value="${empl.dob}" /></td>
      <td><c:out value="${empl.basicSalary}" /></td>
    </tr>
  </c:forEach>
</table>
</div>
<a class="center-align" href="index.jsp"><h5>Home</h5></a>
<jsp:include page="Footer.jsp"/>
