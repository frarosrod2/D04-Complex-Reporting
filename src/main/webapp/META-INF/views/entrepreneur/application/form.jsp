<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="entrepreneur.application.form.label.ticker" path="ticker"/>
	<acme:form-moment code="entrepreneur.application.form.label.creationMoment" path="creationMoment"/>
	<acme:form-textbox code="entrepreneur.application.form.label.statement" path="statement"/>
	<acme:form-textbox code="entrepreneur.application.form.label.investmentOffer" path="investmentOffer"/>
		
  	<acme:form-return code="entrepreneur.application.form.button.return"/>
</acme:form>
	
	