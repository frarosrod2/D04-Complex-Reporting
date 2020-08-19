<%--
- form.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non- use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="patron.banner.form.label.picture" path="picture"/>
	<acme:form-textbox code="patron.banner.form.label.slogan" path="slogan"/>
	<acme:form-url code="patron.banner.form.label.targetURL" path="targetURL"/>
	<jstl:if test="${hasCard}">
		<h3>
			<acme:message code="patron.banner.form.label.creditCard" />
		</h3>
		<acme:form-textbox code="patron.creditCard.label.holder" path="holderName" />
		<acme:form-textbox code="patron.creditCard.label.number" path="number" />
		<acme:form-textbox code="patron.creditCard.label.brand" path="brand" />
		<acme:form-textbox code="patron.creditCard.label.cvv" path="cvv" />
		<acme:form-textbox code="patron.creditCard.label.expMonth" path="expMonth" />
		<acme:form-textbox code="patron.creditCard.label.expYear" path="expYear" />		
	</jstl:if>
  	<acme:form-return code="patron.banner.form.button.return"/>
</acme:form>