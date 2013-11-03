<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page buffer="32kb" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style2.css" rel="stylesheet">
<link href="css/style3.css" rel="stylesheet">
<link href="css/connexion.css" rel="stylesheet">
<link href="css/ajouterAnnonce.css" rel="stylesheet">
<link href="css/ajouterAdresseetanonnce.css" rel="stylesheet">
<link href="css/modficationUtilisateur.css" rel="stylesheet">
</head>
<body>
	<f:view>
		<c:import url="/acceuilAdmin.jsp"></c:import>
		<div id="containerSuprimerUtilisateur">
			<h:form>
				<h:panelGrid columns="2">
					<h:outputLabel value="Login" for="code" />
					<h:inputText id="code"
						value="#{adminBean.curentUtilisateur.alias }"></h:inputText>
					<h:outputLabel value="name" for="name" />
					<h:inputText id="typeAnnonce"
						value="#{adminBean.curentUtilisateur.name }"></h:inputText>
					<h:outputLabel value="Email" for="description" />
					<h:inputText id="email"
						value="#{adminBean.curentUtilisateur.email }"></h:inputText>
					<div id="deuxbouton">
						<h:panelGroup>

							<h:commandButton value="Delete" action="#{adminBean.deleteIn }"></h:commandButton>
							<h:commandButton value="Retour" action="listUtilisateur" immediate="true"></h:commandButton>
							<!--  immediate = true c parce que il traite pas de jsf, list je les defini ds faces config -->

						</h:panelGroup>
					</div>

				</h:panelGrid>
			</h:form>
		</div>
	</f:view>

</body>
</html>