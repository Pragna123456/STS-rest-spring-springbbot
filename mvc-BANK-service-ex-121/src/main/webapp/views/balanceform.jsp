<%@ page contentType="text/html" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>
<body bgcolor="pink">

        
        <h1>SDFC BANK</h1><p></p>
        <h3>EXTRAORDINARY SERVICES</h3><P></P>
        <a href="/" >Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/openAccount">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/closeaccount">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/aboutus">AboutUs</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <p></p>
<h1 style="color:blue">BALANCE FORM</h1>
<table>
<form action="/result" method="POST">
    <tr>
<td>Account Number:</td>
<td><input type="text" name="accno"/></td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" name="name"/></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password"/></td>
</tr>
<tr>
<td><input type="submit" value="Submit"/></td>&nbsp;&nbsp;&nbsp;&nbsp;
<td><input type="reset" value="clear" /></td>&nbsp;&nbsp;&nbsp;&nbsp;
</tr>
</form>


</table>
</body>
</center>