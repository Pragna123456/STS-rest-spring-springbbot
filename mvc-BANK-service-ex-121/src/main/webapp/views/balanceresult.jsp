<%@ page contentType="text/html" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<center>
<h1 style="color:red">SDFC BANK</h1>
<h2 style="color:red">EXTRAORDINARY SERVICES </h2>
<a href="/home">Home</a> &nbsp;
<a href="/newaccount">New account</a>  &nbsp;
<a href="/balance">Balance</a>  &nbsp;
<a href="/deposit">Deposit</a>  &nbsp;
<a href="/withdraw">Withdraw</a>  &nbsp;
<a href="/transfer">Transfer</a>  &nbsp;
<a href="/closeaccount">Close A/C</a>  &nbsp;
<a href="/aboutus">About Us</a>  &nbsp;
    
<p></p>
Welcome ${bank.name}<p></p>
<table border="5">
<tr>
    <th>ACCOUNT NO</th>
    <th>USERNAME</th>
    <th>AMOUNT</th>
    <th>ADDRESS</th>
    <th>PHONE</th>
</tr>
<tr>
<td>${bank.accno}</td>
<td>${bank.name}</td>
<td>${bank.amount}</td>
<td>${bank.address}</td>
<td>${bank.mobile}</td>
</tr>
</table>
</center>