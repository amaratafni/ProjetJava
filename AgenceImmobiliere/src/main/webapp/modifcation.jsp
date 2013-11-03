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

<link href="css/ajouterAdresseetanonnce.css" rel="stylesheet">
</head>
<body>
	<f:view>
		<c:import url="/acceuilUtilisateur.jsp"></c:import>
		<div id="containerModifcation">
			<h:form>
				<h:panelGrid columns="2">
				
					<h:outputLabel value="Titre" for="code" />
					<h:inputText id="code" value="#{annonceBean.curentCourse.titre }"></h:inputText>
					
					<h:outputLabel value="TypeAnnonce" for="typeAnnonce" />
					<h:selectOneMenu value="#{annonceBean.curentCourse.typeAnnonce }">
								<f:selectItem itemLabel="Vente" itemValue="Vente" />
								<f:selectItem itemLabel="Location" itemValue="Location" />
					</h:selectOneMenu>
					
					<h:outputLabel value="typeBien" for="typeBien" />
					<h:selectOneMenu value="#{annonceBean.curentCourse.typeBien }">
								<f:selectItem itemLabel="Appartement" itemValue="Appartement" />
								<f:selectItem itemLabel="Studio" itemValue="Studio" />
								<f:selectItem itemLabel="Chambre" itemValue="Chambre" />
					</h:selectOneMenu>
					
					<h:outputLabel value="surface" for="surface" />
					<h:inputText id="surface" value="#{annonceBean.curentCourse.surface }"></h:inputText>
					
					<h:outputLabel value="surfaceCarry" for="surfaceCarry" />
					<h:inputText id="surfaceCarry" value="#{annonceBean.curentCourse.surfaceCarry }"></h:inputText>
					
					
					
					<h:outputLabel value="Description" for="description" />
					<h:inputText id="description" value="#{annonceBean.curentCourse.description }"></h:inputText>
					
					<div id="deuxboutonSupEtRetourPageSupprimerUtilisateur">
						<h:panelGroup>
							<h:commandButton value="Update" action="#{annonceBean.update }"></h:commandButton>
							<h:commandButton value="Retour" action="list" immediate="true"></h:commandButton>

							
							<!--  immediate = true c parce que il traite pas de jsf, list je les defini ds faces config -->
						</h:panelGroup>
					</div>
				</h:panelGrid>
			</h:form>
		</div>
	</f:view>

</body>
</html>