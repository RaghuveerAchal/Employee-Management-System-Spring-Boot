<jsp:include page="Header.jsp"/>
 <h3 class="center-align"> Update Employee</h3>
	
  <div class="container" style="border:2px;padding:5%">
    <form class="col s12" action="updateemployee" method="post">
      <div class="row">
        <div class="input-field col s12">
          <input placeholder="Enter Employee ID" name="empId" type="text">
          <label>Employee ID</label>
        </div>
       </div>
       <div class="row">
        <div class="input-field col s12">
          <input placeholder="Enter updated Salary" name="basicSalary" type="text">
          <label>Basic Salary</label>
        </div>
       </div>
     
      <input class="waves-effect waves-light btn" type="submit"></input>
    </form>
  </div>
<jsp:include page="Footer.jsp"/>