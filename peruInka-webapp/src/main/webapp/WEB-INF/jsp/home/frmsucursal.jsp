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
<form:form commandName="sucursal" action="saveSucursal" method="post" cssClass="form-horizontal">
	ID: <form:input path="id" id="id" placeholder="CLAVE" maxlength="10"/><br>
	Razon Social: <form:input path="razonSocial" id="razonSocial" placeholder="Razon Social" maxlength="50"/><br>
	RUC: <form:input path="ruc" id="ruc" placeholder="ruc" maxlength="50"/><br>
	Direccion: <form:input path="direccion" id="direccion" placeholder="Direccion" maxlength="50"/><br>
	Numero de Telefono: <form:input path="nroTelefono" id="nroTelefono" placeholder="Numero de Telefono" maxlength="10"/><br>
	Estado: <form:input path="estado" id="estado" placeholder="Estado" maxlength="10"/><br>
	
	<input type="text" name="opc" id="opc" value="${opc}"><br>
	
	<button type="submit" class="btn btn-primary">Guardar</button>
	
	
</form:form>