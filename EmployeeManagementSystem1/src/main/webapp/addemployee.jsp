<jsp:include page="Header.jsp"/>
  <h3 class="center-align"> Add Employee</h3>
	
  <div class="container" style="border:2px;padding:5%">
    <form class="col s12" action="addemployee" method="post">
      <div class="row">
        <div class="input-field col s12">
          <input placeholder="Enter your name" name="empName" type="text">
          <label>Name</label>
        </div>
       </div>
     
      <div class="row">
        <div class="input-field col s12">
          <input placeholder="DD/MM/YYYY" name="dob" type="date">
          <label>DOB</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input placeholder="Enter Basic Salary" name="basicSalary" type="text">
          <label>Salary</label>
        </div>
      </div>
      <input class="waves-effect waves-light btn" type="submit" name="ADD"></input>
    </form>
     </div>

<jsp:include page="Footer.jsp"/>