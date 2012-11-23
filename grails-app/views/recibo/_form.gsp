<%@ page import="prafinal.Recibo" %>



<div class="fieldcontain ${hasErrors(bean: reciboInstance, field: 'cc', 'error')} required">
	<label for="cc">
		<g:message code="recibo.cc.label" default="Cc" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="cc" type="number" value="${reciboInstance.cc}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: reciboInstance, field: 'comentarios', 'error')} ">
	<label for="comentarios">
		<g:message code="recibo.comentarios.label" default="Comentarios" />
		
	</label>
	<g:textField name="comentarios" value="${reciboInstance?.comentarios}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: reciboInstance, field: 'entra', 'error')} required">
	<label for="entra">
		<g:message code="recibo.entra.label" default="Entra" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="entra" type="number" value="${reciboInstance.entra}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: reciboInstance, field: 'sale', 'error')} required">
	<label for="sale">
		<g:message code="recibo.sale.label" default="Sale" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sale" type="number" value="${reciboInstance.sale}" required=""/>
</div>

