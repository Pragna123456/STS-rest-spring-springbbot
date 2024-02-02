<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center>
<body bgcolor="yellow">

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
    <h1 style="color:blueviolet">DEPOSIT FORM</h1>
    <br><br>
    
<form action="/depositresult">
    <table>
        <tr>
            <td><label for="accno">Account No:</label></td>
            <td><input type="text" name="accno"></td>
        </tr>
        <tr>
            <td><label for="name">Name:</label></td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td><label for="password">Password:</label></td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><label for="Amount">Amount:</label></td>
            <td><input type="number" name="amount"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="submit"/></td>
            <td><input type="reset" value="clear"/></td>
        </tr>
        
    </table>
</form>
</center>
</body>