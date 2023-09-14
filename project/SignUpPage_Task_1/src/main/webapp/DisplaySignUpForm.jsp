<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.xdevapi.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup", "root", "root");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from signup");
%>

<table border="2" cellpading="20px" align="center">
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Password</th>
<th>Confirm Password</th>
<thead>Action</thead>
</table>

<% while(rs.next()) {%>
<tr>
<td><% rs.getString(1); %> </td>
<td><% rs.getString(2); %> </td>
<td><% rs.getString(3); %> </td>
<td><% rs.getString(4); %> </td>
<td><% rs.getString(5); %> </td>
</tr>
<%}%>
</body>
</html>