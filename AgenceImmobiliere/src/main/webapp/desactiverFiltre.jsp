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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifier/Désactiver Filtre</title>
<link href="css/modfiFiltre.css" rel="stylesheet">
</head>
<body>
	<f:view>
		<c:import url="/acceuilUtilisateur.jsp"></c:import>
		<!--  i can change this page: -->
		<div id="containerAjouterFiltre">
			<h:form>
				<h:panelGrid columns="1">
					<!--  il va tout rassembler ds une seule colone -->
					<rich:scrollableDataTable id="annonceTable"
						binding="#{filtreBean.filtreTable}"
						value="#{filtreBean.filtreList}" var="item" width="500px"
						height="200px">
						<!--  a4j:support et onRowObClick c pour le double clique -->
						<a4j:support event="onRowDblClick"
							action="#{filtreBean.viewDetail}" />

						<rich:column id="code" width="200px">
							<f:facet name="header">
								<h:outputText value="typeBien"></h:outputText>
							</f:facet>
							<h:outputText value="#{item.typeBien}"></h:outputText>
						</rich:column>

						<rich:column id="typeAnnonce" width="200px">
							<f:facet name="header">
								<h:outputText value="TypeAnnonce"></h:outputText>
							</f:facet>
							<h:outputText value="#{item.typeAnnonce}"></h:outputText>
						</rich:column>
						
						
						<rich:column id="localisationBien" width="200px">
							<f:facet name="header">
								<h:outputText value="localisationBien"></h:outputText>
							</f:facet>
							<h:outputText value="#{item.localisationBien}"></h:outputText>
						</rich:column>

						<rich:column id="datePublication" width="200px">
							<f:facet name="header">
								<h:outputText value="datePublication"></h:outputText>
							</f:facet>
							<h:outputText value="#{item.datePublication}"></h:outputText>
						</rich:column>

						<rich:column id="nbPiece" width="200px">
							<f:facet name="header">
								<h:outputText value="nbPiece"></h:outputText>
							</f:facet>
							<h:outputText value="#{item.nbPiece}"></h:outputText>
						</rich:column>


						<rich:column id="intervalPrix" width="200px">
							<f:facet name="header">
								<h:outputText value="intervalPrix"></h:outputText>
							</f:facet>
							<h:outputText value="#{item.intervalPrix}"></h:outputText>
						</rich:column>

						<rich:column id="intervalSurface" width="200px">
							<f:facet name="header">
								<h:outputText value="intervalSurface"></h:outputText>
							</f:facet>
							<h:outputText value="#{item.intervalSurface}"></h:outputText>
						</rich:column>
						<rich:column id="etatFiltre" width="200px">
							<f:facet name="header">
								<h:outputText value="etatFiltre"></h:outputText>
							</f:facet>
							<h:outputText value="#{item.etatFiltre}"></h:outputText>
						</rich:column>
						
					</rich:scrollableDataTable>
					<!--  pour que les bouton s'affiche ds la meme ligne je vais les mettres ds panelgroupe -->
					<h:panelGroup>
						<h:commandButton value="Description"
							action="#{filtreBean.viewDetail }"></h:commandButton>
					</h:panelGroup>
				</h:panelGrid>
			</h:form>
		</div>
	</f:view>
</body>
</html>