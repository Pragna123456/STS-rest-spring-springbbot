<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center>
<body bgcolor="yellow">

    <h1>SDFC BANK</h1><p></p>
    <h3>EXTRAORDINARY SERVICES</h3><P></P>
    <a href="/home" >Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/openaccount">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/closeaccount">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/aboutus">AboutUs</a>&nbsp;&nbsp;&nbsp;&nbsp;
    
    <p></p>
    <h1 style="color:blueviolet">TRANSFER FORM</h1>
    <br><br>

<form action="/transferresult">
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
            <td><lable for="accno2">Target Account No:</lable></td>
            <td><input type="number" name="accno2"</td>
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