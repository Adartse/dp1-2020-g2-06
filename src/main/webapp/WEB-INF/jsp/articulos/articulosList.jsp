<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

<petclinic:layout pageName="articulos">
    <h2>Articulos</h2>
   
	    
       
        <c:forEach items="${articulos}" var="articulo">
        <table id="diseasesTable" class="table table-striped">
            <tr>
                <th>
                	<a href="/articulos/${articulo.id}">                    
                    <c:out value="${articulo.name}"/>&nbsp;<c:out value="${articulo.fechaPublicacion}"/>
                	</a>
                </th>
                <th>
                	<a href="/articulos/${articulo.id}/edit">
                	<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                	</a>
                </th>
                <th>
                	<a href="/articulos/${articulo.id}/delete">
                		<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                	</a>
                </th>
            </tr>
                
            <tr>
                <td>
                    <c:out value="${articulo.texto}"/>
                </td>                

            </tr>
             </table>
        </c:forEach>
       
   

</petclinic:layout> 
