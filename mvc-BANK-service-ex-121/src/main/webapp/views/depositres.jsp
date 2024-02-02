<%@ page contentType="text/html" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body bgcolor="yellow">

<center>
<h1>SDFC BANK</h1><p></p>
<h3>EXTRAORDINARY SERVICES</h3><P></P>
<a href="/home">Home</a> &nbsp;
<a href="/newaccount">New account</a>  &nbsp;
<a href="/balance">Balance</a>  &nbsp;
<a href="/deposit">Deposit</a>  &nbsp;
<a href="/withdraw">Withdraw</a>  &nbsp;
<a href="/transfer">Transfer</a>  &nbsp;
<a href="/closeaccount">Close A/C</a>  &nbsp;
<a href="/aboutus">About Us</a>  &nbsp;

<p></p>
<table>
<tr>
    <td>My account Balance:${oldamount}</td>
</tr>
<tr>
    <td>My Deposit Balance:${amount}</td>
</tr>
<tr>
    <td>After Deposit Account Balance:${newamount}</td>
</tr>

</table>

</center>
</body>