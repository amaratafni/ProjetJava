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
<link href="css/modfiFiltre.css" rel="stylesheet">
</head>
<body>
<f:view>
		<c:import url="/acceuilUtilisateur.jsp"></c:import>
		<div id="containerAjouterFiltre">
			<h:form>
				<h:panelGrid columns="2">
					<h:outputLabel value="typeAnnonce" for="typeAnnonce" />										
					<h:selectOneMenu value="#{filtreBean.curentFiltre.typeAnnonce }">								
								<f:selectItem itemLabel="Vente" itemValue="Vente" />
								<f:selectItem itemLabel="Location" itemValue="Location" />
					</h:selectOneMenu>
					
					<h:outputLabel value="typeBien" for="typeBien" />
								
					<h:selectOneMenu value="#{filtreBean.curentFiltre.typeBien }">								
								<f:selectItem itemLabel="Appartement" itemValue="Appartement" />
									<f:selectItem itemLabel="Studio" itemValue="Studio" />
								<f:selectItem itemLabel="Chambre" itemValue="Chambre" />
					</h:selectOneMenu>
														
					<h:outputLabel value="localisationBien" for="localisationBien" />
					<h:inputText id="localisationBien"	value="#{filtreBean.curentFiltre.localisationBien }"></h:inputText>
					
					<h:outputLabel value="datePublication" for="datePublication" />
					<%-- <h:inputText id="datePublication"	value="#{filtreBean.curentFiltre.datePublication }"></h:inputText> --%>
					<rich:calendar value="#{filtreBean.curentFiltre.datePublication }"></rich:calendar>
					
					<h:outputLabel value="nbPiece" for="nbPiece" />
					<h:inputText id="nbPiece"	value="#{filtreBean.curentFiltre.nbPiece }"></h:inputText>
					
					<h:outputLabel value="intervalPrix" for="intervalPrix" />
					<h:inputText id="intervalPrix"	value="#{filtreBean.curentFiltre.intervalPrix }"></h:inputText>
					
					
					<h:outputLabel value="intervalSurface" for="intervalSurface" />
					<h:inputText id="intervalSurface"	value="#{filtreBean.curentFiltre.intervalSurface }"></h:inputText>
					
					<h:outputLabel value="etatFiltre" for="etatFiltre" />
					<%-- <h:inputText id="etatFiltre"	value="#{filtreBean.curentFiltre.etatFiltre }"></h:inputText> --%>
					<h:selectOneMenu value="#{filtreBean.curentFiltre.etatFiltre }">								
								<f:selectItem itemLabel="True" itemValue="True" />
								<f:selectItem itemLabel="False" itemValue="False" />
					</h:selectOneMenu>
					
					<div id="deuxbouton">
						<h:panelGroup>

							<h:commandButton value="Update" action="#{filtreBean.update }"></h:commandButton>
							<h:commandButton value="Retour" action="listFiltre" immediate="true"></h:commandButton>
							<!--  immediate = true c parce que il traite pas de jsf, list je les defini ds faces config -->

						</h:panelGroup>
					</div>

				</h:panelGrid>
			</h:form>
		</div>
	</f:view>
	
</body>
</html>