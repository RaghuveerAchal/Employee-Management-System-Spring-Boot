<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<!--  <link rel="icon" href="favicon.ico" type="image/gif" sizes="16x16"> -->
<meta charset="ISO-8859-1">
<title>Sakha Employee Management System</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<style>
body {
     display: flex;
     min-height: 100vh;
     flex-direction: column;
 }
 main {
     flex: 1 0 auto;
 }</style>
</head>
<body>
<main>
<nav>
    <div class="nav-wrapper amber black-text">
      <a href="index.jsp" class="brand-logo" ><img src="logo.png" width=200 ></a>
      <ul id="nav-mobile" class="right hide-on-med-and-down black-text">
        <li><a href="addemployee.jsp" class="black-text">Add Employee</a></li>
		<li><a href="updateemployee.jsp" class="black-text">Update Employee</a></li>
		<li><a href="deleteemployee.jsp" class="black-text">Delete Employee</a></li>
		<li><a href="getemployee.jsp" class="black-text">Get Employee</a></li>
		<li><a href="getallemployee" class="black-text">View All Employees</a></li>
      </ul>
    </div>
  </nav>