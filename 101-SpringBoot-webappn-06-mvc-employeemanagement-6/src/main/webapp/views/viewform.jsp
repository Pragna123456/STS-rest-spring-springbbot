<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<table border="1"> 
<tr> 
    <th>ID</th> 
    <th>NAME</th> 
    <th>DESTINATION</th> 
    <th>EMAIL</th>
    <th>MOBILE</th> 
    <th>GENDER</th> 
    <th>CITY</th> 
    <th>STATE</th> 
    <th>COUNTRY</th> 
    <th>ADDRESS</th> 
    <th>DELETE</th> 
    <th>EDIT</th>> 
</tr> 
<c:forEach var="employee" items="${employees}"> 
    <tr>   
        <td>${employee.id}</td>   
        <td>${employee.name}</td>    
        <td>${employee.desination}</td>  
        <td>${employee.email}</td> 
        <td>${employee.mobile}</td>  
        <td>${employee.gender}</td>  
        <td>${employee.city}</td>  
        <td>${employee.state}</td>  
        <td>${employee.country}</td> 
        <td>${employee.address}</td>   
        <td> 
            <a href="/delete/${employee.id}">Delete</a> 
        </td> 
        <td> 
            <a href="/edit/${employee.id}">Edit</a> 
        </td> 
        </td>  
         </tr>   
</c:forEach> 
</table>