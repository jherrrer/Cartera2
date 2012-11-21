<%@ page import="prafinal.Cartera" %>



<div class="fieldcontain ${hasErrors(bean: carteraInstance, field: 'CC', 'error')} required">
	<label for="CC">
		<g:message code="cartera.CC.label" default="CC" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="CC" type="number" value="${carteraInstance.CC}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: carteraInstance, field: 'nombre', 'error')} ">
	<label for="nombre">
		<g:message code="cartera.nombre.label" default="Nombre" />
		
	</label>
	<g:textField name="nombre" value="${carteraInstance?.nombre}"/>
</div>

