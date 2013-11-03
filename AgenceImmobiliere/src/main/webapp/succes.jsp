<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page buffer="32kb" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ page isELIgnored="false"%>
<html>
<head>

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

</head>

<body>
	<f:subview id="acceuil">
		<h:form>
			<!--  partie header **************************************************************************** -->
			<div id="header">
				<rich:toolBar height="40" itemSeparator="grid" id="salam">
					<rich:dropDownMenu styleClass="myClasseitem">
						<f:facet name="label">
							<h:panelGroup>
								<h:outputText value="Gestion D'annonce Immobilier" />
							</h:panelGroup>
						</f:facet>
					</rich:dropDownMenu>
					<rich:dropDownMenu>
						<f:facet name="label">							
							<a4j:commandLink action="pageAuth" styleClass="styleLik">Home</a4j:commandLink>
						</f:facet>

					</rich:dropDownMenu>
					<rich:dropDownMenu>
						<f:facet name="label">
							<a4j:commandLink styleClass="styleLik">Contact</a4j:commandLink>
						</f:facet>
					</rich:dropDownMenu>
					<rich:dropDownMenu>
						<f:facet name="label">
							<a4j:commandLink styleClass="styleLik">Source</a4j:commandLink>
						</f:facet>
					</rich:dropDownMenu>
					<rich:toolBarGroup location="right">
						<h:inputText styleClass="barsearch" />
						<h:commandButton styleClass="barsearchbutton"
							onclick="return false;" value="Search" />
					</rich:toolBarGroup>
				</rich:toolBar>
			</div>

		<h4>Inscription bien prise en compte....!!!Merci de votre inscription, veuillez authetifier pour ajouter des annonces</h4>
		
			<!--  partie content **************************************************************************** -->
			<div id="content">

				<div id="sidebar" class="sidebar" style="width: 180px;">
					<rich:panelMenu style="width:245px" mode="ajax"
						iconExpandedGroup="disc" iconCollapsedGroup="disc"
						iconExpandedTopGroup="chevronUp" iconGroupTopPosition="right"
						iconCollapsedTopGroup="chevronDown">
						<rich:panelMenuGroup label="Administrateur " expanded="true">
							<rich:panelMenuItem>
								<h:outputLink value="connexion.jsf"><h:outputText value="Connexion" /></h:outputLink>
							</rich:panelMenuItem>
														
							<rich:panelMenuItem label="Contact Admin" onclick="a();">
							</rich:panelMenuItem>
							
						</rich:panelMenuGroup>
						<rich:panelMenuGroup label="Gestion des Utilisateur"
							expanded="true">
							<rich:panelMenuItem>
							<h:outputLink value="inscription.jsf"><h:outputText value="Inscription" /></h:outputLink>
							</rich:panelMenuItem>
							<rich:panelMenuItem>
							<h:outputLink value="authUtilisteur.jsf"><h:outputText value="Authentifcation" /></h:outputLink>
							</rich:panelMenuItem>							
						</rich:panelMenuGroup>						

						<rich:panelMenuGroup label="Recherche avancer " expanded="true">
							<rich:panelMenuItem label="recherche annonce"></rich:panelMenuItem>
						</rich:panelMenuGroup>
					</rich:panelMenu>
				</div>				
			</div>
					
			<!--  partie footer **************************************************************************** -->
			<div id="footer"></div>
		</h:form>
	</f:subview>
</body>
</html>