<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page buffer="32kb" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<script>
	
</script>

<style>
.pic {
	margin-bottom: -4px;
	margin-right: 2px;
}

.search .rich-menu-item-hover {
	background-color: transparent;
	border-color: transparent;
}
</style>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style2.css" rel="stylesheet">
<link href="css/style3.css" rel="stylesheet">
<link href="css/connexion.css" rel="stylesheet">


</head>
<body>

	<f:view>
		<c:import url="/acceuil.jsp"></c:import>
		<h:form>
			<div id="messageSucces">
				<h2>Success</h2>
			</div>
		</h:form>

	</f:view>
</body>
</html>