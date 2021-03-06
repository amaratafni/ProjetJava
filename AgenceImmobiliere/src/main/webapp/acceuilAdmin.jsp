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
<title>Page Admin</title>
<link href="css/style2.css" rel="stylesheet">
<link href="css/style3.css" rel="stylesheet">
<link href="css/admin.css" rel="stylesheet">

</head>

<body>
	<f:subview id="acceuilAdmin">
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
			<h4>
				Bienvenu dans votre espace personnelle : 			</h4>
			<div id="botonDeconecter">				
					<a4j:commandLink action="pageAuth">Deconnection</a4j:commandLink>
			</div>
			<hr>
			<!--  partie content **************************************************************************** -->
			<div id="content">
				<div id="sidebar" class="sidebar" style="width: 180px;">
					<rich:panelMenu style="width:245px" mode="ajax"
						iconExpandedGroup="disc" iconCollapsedGroup="disc"
						iconExpandedTopGroup="chevronUp" iconGroupTopPosition="right"
						iconCollapsedTopGroup="chevronDown">

						<rich:panelMenuGroup label="Gestion des Utilisateur "
							expanded="true">
							<!--  getsion utilisateur -->
							<rich:panelMenuItem>
								<h:outputLink value="supprimerUtilisateur.jsf">
									<h:outputText value="Supprimer une Utilisateur" />
								</h:outputLink>
							</rich:panelMenuItem>
							<rich:panelMenuItem>
								<h:outputLink value="desactiverUtilisateur.jsf">
									<h:outputText value="Désactiver une Utilisateur" />
								</h:outputLink>
							</rich:panelMenuItem>
						</rich:panelMenuGroup>
						<!--  getsion Annonce -->
						<rich:panelMenuGroup label="GestionAnnonce " expanded="true">
							<rich:panelMenuItem>
								<h:outputLink value="suprimerAnnonce.jsf">
									<h:outputText value="Supprimer une annonce" />
								</h:outputLink>
							</rich:panelMenuItem>
							<rich:panelMenuItem>
								<h:outputLink value="suprimerAnnonce.jsf">
									<h:outputText value="Modifier annonce" />
								</h:outputLink>
							</rich:panelMenuItem>
							<rich:panelMenuItem label="Recherche annonce">
								<h:outputLink value="suprimerAnnonce.jsf">
									<h:outputText value="Recherche Annonce" />
								</h:outputLink>
							</rich:panelMenuItem>
							<!--  getsion filtre -->
						</rich:panelMenuGroup>
						<rich:panelMenuGroup label="Gestion de filtre " expanded="true">
							<rich:panelMenuItem>
							<h:outputLink value="suprimerAnnonce.jsf">
									<h:outputText value="Surimer un filtre" />
								</h:outputLink>
							</rich:panelMenuItem>
							<rich:panelMenuItem>
							<h:outputLink value="suprimerAnnonce.jsf">
									<h:outputText value="Désactiver un filtre" />
								</h:outputLink>
							</rich:panelMenuItem>
						</rich:panelMenuGroup>

						<rich:panelMenuGroup label="Recherche avancer " expanded="true">
							<rich:panelMenuItem>
							<h:outputLink value="suprimerAnnonce.jsf">
									<h:outputText value="recherche annonce" />
								</h:outputLink>
							</rich:panelMenuItem>
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