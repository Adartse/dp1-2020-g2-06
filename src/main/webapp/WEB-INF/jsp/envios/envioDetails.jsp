<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="envios">

    <h2>Env�o n�mero <c:out value="${envio.id}"/></h2>
    
    <table class="table table-striped">
    	<tr>
            <th>Fecha de env�o</th>
            <td><c:out value="${envio.fecha}"/></td>
        </tr>
        <tr>
            <th>Alumno</th>
            <td><a href="/alumnos/${envio.alumno.id}">
            <c:out value="${envio.alumno.nombre}"/>&nbsp;<c:out value="${envio.alumno.apellidos}"/>
            </a></td>
        </tr>
        <tr>
            <th>Problema</th>
            <td><a href="/problemas/${envio.problema.id}">
            <c:out value="${envio.problema.name}"/>
            </a></td>
        </tr>
        <tr>
            <th>Resoluci�n</th>
            <td><c:out value="${envio.resolucion}"/></td>
        </tr>
        <tr>
            <th>C�digo</th>
            <td><c:out value="${codigo}"/></td>
        </tr>
        
    </table>

</petclinic:layout>
