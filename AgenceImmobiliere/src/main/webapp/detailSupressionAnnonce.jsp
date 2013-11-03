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
		<c:import url="/acceuilUtilisateur.jsp"></c:import>
		<div id="container">
			<h:form>
				<h:panelGrid columns="2">
					<h:outputLabel value="Titre" for="code" />
					<h:inputText id="code" value="#{annonceBean.curentCourse.titre }"></h:inputText>
					<h:outputLabel value="TypeAnnonce" for="typeAnnonce" />
					<h:inputText id="typeAnnonce"
						value="#{annonceBean.curentCourse.typeAnnonce }"></h:inputText>
					<h:outputLabel value="Description" for="description" />
					<h:inputText id="description"
						value="#{annonceBean.curentCourse.description }"></h:inputText>
					<div id="deuxboutonSupEtRetourPageSupprimerUtilisateur">
						<h:panelGroup>

							<h:commandButton value="Delete annonce"
								action="#{annonceBean.deleteAnnonce}"></h:commandButton>
							<%-- <h:commandButton value="Retour" action="list" immediate="true"></h:commandButton> --%>
							<!--  immediate = true c parce que il traite pas de jsf, list je les defini ds faces config -->

						</h:panelGroup>
					</div>
				</h:panelGrid>
			</h:form>
		</div>
	</f:view>

</body>
</html>