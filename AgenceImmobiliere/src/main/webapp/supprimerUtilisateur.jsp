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
<title>Supprimer Utilisateur</title>

<link href="css/ajouterAdresseetanonnce.css" rel="stylesheet">
</head>
<body>
	<f:view>
		<c:import url="/acceuilAdmin.jsp"></c:import>
		
		<div id="containerSuprimerUtilisateur">
		<h:form>
			<h:panelGrid columns="1">
				<!--  il va tout rassembler ds une seule colone -->
				<rich:scrollableDataTable id="utilisateurTable"
					binding="#{adminBean.utilisateurTable}"
					value="#{adminBean.utilisateurListTest}" var="item" width="500px"
					height="200px">
					<!--  a4j:support et onRowObClick c pour le double clique -->
					<a4j:support  event="onRowDblClick" action="#{adminBean.viewDetail}"/>
					
					<rich:column id="code" width="200px">
						<f:facet name="header">
							<h:outputText value="Login"></h:outputText>
						</f:facet>
						<h:outputText value="#{item.alias}"></h:outputText>
					</rich:column>

					<rich:column id="typeAnnonce" width="200px">
						<f:facet name="header">
							<h:outputText value="Name"></h:outputText>
						</f:facet>
						<h:outputText value="#{item.name}"></h:outputText>
					</rich:column>
					<rich:column id="description" width="200px">
						<f:facet name="header">
							<h:outputText value="Email"></h:outputText>
						</f:facet>
						<h:outputText value="#{item.email}"></h:outputText>
					</rich:column>

				</rich:scrollableDataTable>
				<!--  pour que les bouton s'affiche ds la meme ligne je vais les mettres ds panelgroupe -->
				<h:panelGroup>
					<h:commandButton value="Description" action="#{adminBean.viewDetail }"></h:commandButton>
					<%-- <h:commandButton value="nouveau"
						action="#{adminBean.viewNew }"></h:commandButton> --%>
				</h:panelGroup>				
			</h:panelGrid>
			</h:form>
		</div>
	</f:view>
</body>
</html>