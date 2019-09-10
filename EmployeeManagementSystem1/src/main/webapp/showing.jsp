<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="Header.jsp"/>
<br><br><br>



  <c:if test="${not empty msg}">
   <h3 class="center-align"> ${msg}</h3>
   </c:if>
  <c:if test="${not empty emp}">
<div class="container">
<table class="striped">
<thead>
          <tr>
              <th>Employee ID</th>
              <th>Employee Name</th>
              <th>Date of Birth</th>
              <th>Basic Salary</th>
              <th>Genrated Identity</th>
          </tr>
        </thead>
  
    <tr>
      <td><c:out value="${emp.empId}" /></td>
      <td><c:out value="${emp.empName}" /></td>
      <td><c:out value="${emp.dob}" /></td>
      <td><c:out value="${emp.basicSalary}" /></td>
      <td><c:out value="${emp.empIdentity}"/></td>
    </tr>

</table>
</div>

  </c:if>
  
  <a class="center-align" href="index.jsp"><h5>Home</h5></a>





<jsp:include page="Footer.jsp"/>