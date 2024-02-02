<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<table border="1"> 
<tr> 
    <th>ID</th> 
    <th>NAME</th> 
    <th>PASSWORD</th> 
    <th>EMAIL</th> 
    <th>GENDER</th> 
    <th>COUNTRY</th> 
    <th>DELETE</th> 
    <th>EDIT</th> 
</tr> 
<c:forEach var="user" items="${users}"> 
    <tr>   
        <td>${user.id}</td>   
        <td>${user.name}</td>    
        <td>${user.password}</td>  
        <td>${user.email}</td>  
        <td>${user.gender}</td>  
        <td>${user.country}</td>  
        <td> 
            <a href="/delete/${user.id}">Delete</a> 
        </td> 
        <td> 
            <a href="/edit/${user.id}">Edit</a> 
        </td> 
        </td>  
         </tr>   
</c:forEach> 
</table>

7

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
  <body bgcolor="pink"> 
        <h1>Edit User Details Here</h1>   
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
          <td>Password : </td>    
          <td><form:input path="password"  /></td>   
         </tr>   
         <tr>     
          <td>Eamil :</td>     
          <td><form:input path="email" /></td>   
         </tr>  
         <tr>     
            <td>Gender :</td>     
            <td><form:input path="gender" /></td>   
           </tr>   
           <tr>     
            <td>Country :</td>     
            <td><form:input path="country" /></td>   
           </tr>    
         <tr>     
          <td> </td>     
          <td><input type="submit" value="EditSave" /></td>     
         </tr>     
        </table>     
       </form:form>   
       
       </body>