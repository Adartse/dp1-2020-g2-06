<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="normasWeb">
    <h2>
        <c:if test="${normas_web['new']}">Nueva </c:if> Norma Web
    </h2>
    <form:form modelAttribute="normas_web" class="form-horizontal" id="add-normaWeb-form">
        <div class="form-group has-feedback">
            <petclinic:inputField label="Nombre de la Regla" name="name"/>
            <petclinic:inputField label="Descripci�n" name="descripcion"/>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <c:choose>
                    <c:when test="${normas_web['new']}">
                        <button class="btn btn-default" type="submit">A�adir NormaWeb</button>
                    </c:when>
                    <c:otherwise>
                        <button class="btn btn-default" type="submit">Actualizar NormaWeb</button>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </form:form>
</petclinic:layout> 