<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="urn:jsptagdir:/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="tool.name" path="name" width="40%"/>
	<acme:list-column code="tool.technology" path="technology" width="40%"/>
	<acme:list-column code="tool.retailPrice" path="retailPrice" width="20%"/>
</acme:list>
