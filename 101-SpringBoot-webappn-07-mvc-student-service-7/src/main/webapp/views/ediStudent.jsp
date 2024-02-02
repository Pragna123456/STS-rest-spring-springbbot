<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<table border="1"> 
<tr> 
    <th>STDROLLNO</th> 
    <th>NAME</th> 
    <th>COURSE</th> 
    <th>HIBERNATE</th> 
    <th>SPRING</th> 
    <th>SPRINGBOOT</th> 
    <th>TOTAL</th> 
    <th>PERCENTAGE</th>
    <th>GRADE</th>
    <th>RESULT</th> 
</tr> 
<c:forEach var="student" items="${students}"> 
    <tr>   
        <td>${student.stdRollNo}</td>   
        <td>${student.name}</td>    
        <td>${student.course}</td>  
        <td>${student.hibernate}</td>  
        <td>${student.spring}</td>  
        <td>${student.springboot}</td> 
        <td>${student.total}</td> 
        <td>${student.percentage}</td> 
        <td>${student.grade}</td> 
        <td>${student.result}</td>  
        <td> 
            <a href="/delete/${student.stdRollNo}">Delete</a> 
        </td> 
        <td> 
            <a href="/edit/${student.stdRollNo}">Edit</a> 
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
        <h1>Edit students Details Here</h1>   
       <form:form method="GET" action="/editandsave">     
        <table >     
        <tr>   
        <td></td>     
         <td><form:hidden path="stdRollNo" /></td>   
         </tr>   
         <tr>     
            <td>Name :</td>     
            <td><form:input path="name" /></td>   
           </tr>   
         <tr>     
          <td>course : </td>    
          <td><form:input path="course"  /></td>   
         </tr>   
         <tr>     
          <td>Hibernate :</td>     
          <td><form:input path="hibernate" /></td>   
         </tr>  
         <tr>     
            <td>Spring :</td>     
            <td><form:input path="spring" /></td>   
           </tr>   
           <tr>     
            <td>Springboot :</td>     
            <td><form:input path="springboot" /></td>   
           </tr>   
           <tr>     
                 
         <tr>     
          <td> </td>     
          <td><input type="submit" value="EditSave" /></td>     
         </tr>     
        </table>     
       </form:form>   
       
       </body>