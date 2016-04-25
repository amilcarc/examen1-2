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

Bienvenido a la cadena de hotel PeruInka Sucursal

<br>
<a href="frmsucursal">New Sucursal</a>
<br>

<display:table name="${sucSucursal}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Razon Social" property="razonSocial" />
	<display:column title="RUC" property="ruc" />
	<display:column title="Direcion" property="direccion" />
	<display:column title="DNI" property="nroTelefono" />
	<display:column title="Estado" property="estado" />
	<display:column title="OPC">
		<a href="editSucursal?id_=${item.id}">Modificar</a>
		<a href="deleteSucursal?id_=${item.id}">Eliminar</a>
	</display:column>
	
	
</display:table>