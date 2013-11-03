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
<<<<<<< HEAD
<link href="css/acceuilUser.css" rel="stylesheet">
=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5

</head>

<body>
	<f:subview id="acceuilUtilisateur">
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
<<<<<<< HEAD
			<h3>Bienvenu dans votre espace personnelle :</h3>
			<h:form>
			<div id="botonDeconecter">
				<a4j:commandLink action="pageAuth" styleClass="botonDeconecter">Deconnection</a4j:commandLink>
			</div>
			<div id="botonDeconecte4r">
				<a4j:commandLink action="#{scriptInsertBean.inserer}" styleClass="botonDeconecter">Inserre</a4j:commandLink>
			</div>
			</h:form>
			<hr>
=======

>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
			<!--  partie content **************************************************************************** -->
			<div id="content">
				<div id="sidebar" class="sidebar" style="width: 180px;">
					<rich:panelMenu style="width:245px" mode="ajax"
						iconExpandedGroup="disc" iconCollapsedGroup="disc"
						iconExpandedTopGroup="chevronUp" iconGroupTopPosition="right"
						iconCollapsedTopGroup="chevronDown">
						<rich:panelMenuGroup label="GestionAnnonce " expanded="true">
							<rich:panelMenuItem>
<<<<<<< HEAD
								<h:outputLink value="ajouterAdresse.jsf">
									<h:outputText value="Ajouter une annonce" />
								</h:outputLink>
							</rich:panelMenuItem>
							<rich:panelMenuItem>
								<h:outputLink value="updateAnnonce.jsf">
									<h:outputText value="Modifier annonces" />
								</h:outputLink>
							</rich:panelMenuItem>
							<rich:panelMenuItem>
								<h:outputLink value="suprimerAnnonce.jsf">
									<h:outputText value="Supprimer annonce" />
								</h:outputLink>
							</rich:panelMenuItem>


						</rich:panelMenuGroup>
						<rich:panelMenuGroup label="Gestion de filtre " expanded="true">
							<rich:panelMenuItem>

								<h:outputLink value="ajouterFiltre.jsf">
									<h:outputText value="Ajouter un filtre" />
								</h:outputLink>
							</rich:panelMenuItem>
							<rich:panelMenuItem>
								<h:outputLink value="desactiverFiltre.jsf">
									<h:outputText value="Désactiver un filtre" />
								</h:outputLink>
							</rich:panelMenuItem>
							<rich:panelMenuItem>
								<h:outputLink value="supprimerFiltre.jsf">
									<h:outputText value="Supprimer un filtre" />
								</h:outputLink>
							</rich:panelMenuItem>
						</rich:panelMenuGroup>

=======
							<h:outputLink value="ajouterAdresse.jsf"><h:outputText value="Ajouter une annonce" /></h:outputLink></rich:panelMenuItem>							
							<rich:panelMenuItem label="Supprimer une annonce">	</rich:panelMenuItem>					
							<rich:panelMenuItem label="Supprimer annonce"></rich:panelMenuItem>
							<rich:panelMenuItem label="Modifier annonce"></rich:panelMenuItem>
							<rich:panelMenuItem label="Recherche annonce"></rich:panelMenuItem>
						</rich:panelMenuGroup>
						<rich:panelMenuGroup label="Gestion de filtre " expanded="true">
							<rich:panelMenuItem label="Ajouter un filtre"></rich:panelMenuItem>
							<rich:panelMenuItem label="Désactiver un filtre"></rich:panelMenuItem>
						</rich:panelMenuGroup>
						
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
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