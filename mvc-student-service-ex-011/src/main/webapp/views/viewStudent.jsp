<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>View All Student Result Table</h1>
<table border="1">
<tr>
    <th>ROLL NUMBER</th>
    <th>NAME</th>
    <th>COURSE</th>
    <th>Hibernate</th>
    <th>SPRING</th>
    <th>SPRING BOOT</th>
    <th>TOTAL</th>
    <th>PERCENTAGE</th>
    <th>GRADE</th>
    <th>RESULT</th>
    <th>EDIT</th>
    <th>DELETE</th>
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
            <a href="/edit/${student.stdRollNo}">Edit</a>
        </td>
        <td>
            <a href="/delete/${student.stdRollNo}">Delete</a>
        </td>
        </td> 
         </tr>  
</c:forEach>
</table>