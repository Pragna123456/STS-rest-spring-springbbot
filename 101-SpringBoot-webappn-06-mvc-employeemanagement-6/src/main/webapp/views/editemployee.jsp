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
    <th>EDIT</th> 
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



<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
  <body bgcolor="pink"> 
        <h1>Edit employee Details Here</h1>   
       <form:form method="GET" action="/editandsave">     
        <table >     
        <tr>   
        <td></td>     
        <td><form:hidden path="id" /></td>  
         </tr>   
         <tr>     
            <td>Name :</td>     
            <td><form:input path="name" /></td>   
           </tr>   
         <tr>     
          <td>desination : </td>    
          <td><form:input path="desination"  /></td>   
         </tr>   
         <tr>     
          <td>Eamil :</td>     
          <td><form:input path="email" /></td>   
         </tr>
         <tr>     
            <td>mobile :</td>     
            <td><form:input path="mobile" /></td>   
           </tr>  
         <tr>     
            <td>Gender :</td>     
            <td><form:input path="gender" /></td>   
           </tr>   
           <tr>     
            <td>city :</td>     
            <td><form:input path="city" /></td>   
           </tr>
           <tr>     
            <td>state :</td>     
            <td><form:input path="state" /></td>   
           </tr>
           <tr>     
            <td>country :</td>     
            <td><form:input path="country" /></td>   
           </tr>   
           <tr>     
            <td>address :</td>     
            <td><form:input path="address" /></td>   
           </tr> 
         <tr>     
          <td> </td>     
          <td><input type="submit" value="EditSave" /></td>     
         </tr>     
        </table>     
       </form:form>   
       
       </body>