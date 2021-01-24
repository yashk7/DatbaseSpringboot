<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
    label {
        display: inline-block;
        width: 200px;
        margin: 5px;
        text-align: left;
    }
    input[type=text], input[type=password], select {
        width: 200px;  
    }
    input[type=radio] {
        display: inline-block;
        margin-left: 45px;
    }
    input[type=checkbox] {
        display: inline-block;
        margin-right: 190px;
    }  
     
    button {
        padding: 10px;
        margin: 10px;
        width: 200px;
        margin: 5px;
    }
</style>

</head>
<body>
<div align="center">
<form action="addUserDetails">
		<h2> User Details </h2>
		 <label>ID:</label>
		<input type="text" name="id"><br/>
		<label >Name:</label>
		<input type="text" name="name"><br/>
		<label >Tech:</label>
		<input type="text" name="tech"><br>
		<input type="submit"><br>

</form>

<form action="getUserDetails">
 		<h2> GET USER DETAILS</h2>
 		<label>ID:</label>
		<input type="text" name="id"><br>
		<input type="submit"><br>

</form>


</div>
</body>
</html>