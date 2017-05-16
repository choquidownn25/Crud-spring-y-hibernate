<%-- 
    Document   : emp
    Created on : May 9, 2017, 10:54:01 PM
    Author     : choqu_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${message}</title>
    </head>
    
        <h1>${message}</h1><br>
        
          <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Job</th>
                <th>MGR</th>
                <th>HIREDATE</th>
                <th>SAL</th>
                <th>Comm</th>
                <th>Deptno</th>
                
            </tr>
            <c:forEach items="${emps}" var="emp">
            <tr>
                <td><c:out value="${emp.empno}"/></td>
                <td><c:out value="${emp.ename}"/></td>
                <td><c:out value="${emp.job}"/></td>
                <td><c:out value="${emp.hiredate}"/></td>
                <td><c:out value="${emp.sal}"/></td>
                <td><c:out value="${emp.comm}"/></td>
                <td><c:out value="${emp.deptno}"/></td>
            </tr>
            </c:forEach>
        </table>
        
         <a href="emp.htm">Click Here</a> to get all Users Details.
    

