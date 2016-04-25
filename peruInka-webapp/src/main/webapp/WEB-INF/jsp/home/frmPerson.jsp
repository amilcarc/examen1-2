<%@ page import="org.springframework.web.util.UrlPathHelper"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

Formulario Persona
<form:form commandName="person" action="savePerson" method="post" cssClass="form-horizontal">
	ID: <form:input path="id" id="id" placeholder="CLAVE" maxlength="10"/><br>
	Nombre: <form:input path="name" id="name" placeholder="Nombre" maxlength="50"/><br>
	Apellido Paterno: <form:input path="lastNameP" id="lastNameP" placeholder="Apellido Paterno" maxlength="50"/><br>
	Apellido Materno: <form:input path="lastNameM" id="lastNameM" placeholder="Apellido Materno" maxlength="50"/><br>
	DNI: <form:input path="dni" id="dni" placeholder="DNI" maxlength="10"/><br>
	
	<input type="text" name="opc" id="opc" value="${opc}"><br>
	
	<button type="submit" class="btn btn-primary">Guardar</button>
	
	
</form:form>