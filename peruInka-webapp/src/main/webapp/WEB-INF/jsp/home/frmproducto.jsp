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

Formulario producto
<form:form commandName="producto" action="saveProduct" method="post" cssClass="form-horizontal">
	ID: <form:input path="id" id="id" placeholder="CLAVE" maxlength="10"/><br>
	Nombre del Producto: <form:input path="nombproduct" id="nombproduct" placeholder="Nombre del Producto" maxlength="50"/><br>
	Descripcion: <form:input path="descripcion" id="descripcion" placeholder="Descripcion" maxlength="50"/><br>
	Atributo: <form:input path="atributo" id="atributo" placeholder="Atributo" maxlength="50"/><br>
	Precio: <form:input path="precio" id="precio" placeholder="Precio" maxlength="10"/><br>
	
	<input type="text" name="opc" id="opc" value="${opc}"><br>
	
	<button type="submit" class="btn btn-primary">Guardar</button>
	
	
</form:form>