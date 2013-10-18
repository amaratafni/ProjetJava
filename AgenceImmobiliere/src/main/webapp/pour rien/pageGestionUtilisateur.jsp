<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page buffer="32kb" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.scrolls {
	width: 300px;
	height: 200px;
	overflow: auto;
}
</style>
<!--  lien CSS : -->
<link href="css/style1.css" rel="stylesheet">
<title>Binevenue dans votre espace</title>
<!--  scipt -->
<script>
	
</script>
</head>
<body>

	<f:view>

		<div id="container">

			<div id="header">

				<h:form>
					<!--  menu :  -->
					<rich:toolBar>
						<rich:dropDownMenu>
							<f:facet name="label">
								<h:panelGroup>
									<h:graphicImage value="/images/icons/copy.gif" styleClass="pic" />
									<h:outputText value="File" />
								</h:panelGroup>
							</f:facet>
							<rich:menuItem submitMode="ajax" value="New"
								action="#{ddmenu.doNew}" icon="/images/icons/create_doc.gif">
							</rich:menuItem>
							<rich:menuItem submitMode="ajax" value="Open"
								action="#{ddmenu.doOpen}" icon="/images/icons/open.gif" />
							<rich:menuGroup value="Save As...">
								<rich:menuItem submitMode="ajax" value="Save"
									action="#{ddmenu.doSave}" icon="/images/icons/save.gif" />
								<rich:menuItem submitMode="ajax" value="Save All"
									action="#{ddmenu.doSaveAll}">
									<f:facet name="icon">
										<h:graphicImage value="/images/icons/save_all.gif" />
									</f:facet>
								</rich:menuItem>
							</rich:menuGroup>
							<rich:menuItem submitMode="ajax" value="Close"
								action="#{ddmenu.doClose}" />
							<rich:menuSeparator id="menuSeparator11" />
							<rich:menuItem submitMode="ajax" value="Exit"
								action="#{ddmenu.doExit}" />
						</rich:dropDownMenu>
						<rich:dropDownMenu>
							<f:facet name="label">
								<h:panelGrid cellpadding="0" cellspacing="0" columns="2"
									style="vertical-align:middle">
									<h:outputText value="Links" />
								</h:panelGrid>
							</f:facet>

							<rich:menuItem submitMode="none"
								onclick="document.location.href='http://labs.jboss.com/jbossrichfaces/'">
								<h:outputLink value="http://labs.jboss.com/jbossrichfaces/">
									<h:outputText value="RichFaces Home Page"></h:outputText>
								</h:outputLink>
							</rich:menuItem>

							<rich:menuItem submitMode="none"
								onclick="document.location.href='http://jboss.com/index.html?module=bb&amp;op=viewforum&amp;f=261'">
								<h:outputLink
									value="http://jboss.com/index.html?module=bb&amp;op=viewforum&amp;f=261">
									<h:outputText value="RichFaces Forum"></h:outputText>
								</h:outputLink>
							</rich:menuItem>

						</rich:dropDownMenu>
						<rich:toolBarGroup location="right">
							<rich:dropDownMenu value="Search" direction="bottom-left"
								jointPoint="br" styleClass="search">
								<rich:menuItem submitMode="none">
									<h:inputText value="" id="searchinput" />
									<button type="button">Search</button>
								</rich:menuItem>
								<rich:menuItem value="Enter your search criteria here"
									disabled="true"></rich:menuItem>
							</rich:dropDownMenu>
						</rich:toolBarGroup>
					</rich:toolBar>

					<rich:spacer width="1" height="5" />
					<br />
					<%-- <a4j:outputPanel ajaxRendered="true">
						<h:outputText value="Current Selection: "></h:outputText>
						<h:outputText style="font-weight:bold" value="#{ddmenu.current}"></h:outputText>
					</a4j:outputPanel> --%>
					<br />
					<rich:spacer width="1" height="25" />
					<!--  fin Menu  -->
					<div id="pic1" style="visibility: visible">
						<h:panelGrid columns="1" columnClasses="cent">
							<h:panelGroup id="picture">
								<h:graphicImage value="/images/rich1.jpg" id="pic" />
							</h:panelGroup>
						</h:panelGrid>
					</div>
				</h:form>
				<h1 align="center">BienVenu dans votre espace Utilisateur : </h1>
			</div>
			
			<!--  l'image richFaces : -->


			<div id="content">
				<h:form>
					<div id="sidebar" class="sidebar" style="width: 160px;">
						<rich:panelMenu style="width:210px" mode="ajax"
							iconExpandedGroup="disc" iconCollapsedGroup="disc"
							iconExpandedTopGroup="chevronUp" iconGroupTopPosition="right"
							iconCollapsedTopGroup="chevronDown">

							<rich:panelMenuGroup label="Gestion des annonces "
								expanded="true">
								<rich:panelMenuItem label="Ajouter une annonce"
									onclick="showGif();">
								</rich:panelMenuItem>

								<rich:panelMenuItem label="Supprimer une annonce"
									onclick="ajouterClient();">

								</rich:panelMenuItem>

							</rich:panelMenuGroup>

							<rich:panelMenuGroup label="Gestion des filtres" expanded="true">
								<rich:panelMenuItem label="Declencher un  filtre">
								</rich:panelMenuItem>
								<rich:panelMenuItem label="Supprimer un Filtre" onclick="tabeRecherche();">
								</rich:panelMenuItem>
								<rich:panelMenuItem label="Modifier un Filtre" onclick="tabeRecherche();">
								</rich:panelMenuItem>

							</rich:panelMenuGroup>
							<!--  another gestion recherche -->
							<rich:panelMenuGroup label="Recherche Par critère"
								expanded="true">

								<rich:panelMenuItem label="Recherche" onclick="tabeRecherche();">
								</rich:panelMenuItem>

							</rich:panelMenuGroup>

						</rich:panelMenu>
					</div>
					<!--  declaration d'un tableau de Recherche : -->
					<!-- *********************************************************************************** -->

					<!-- ******************************************************************************************************** -->
					<div id="facebookTwiter">
						<h:panelGrid columns="2" columnClasses="cent">
							<h:panelGroup id="picture">
								<h:outputLink value="https://www.google.fr/">
									<h:graphicImage value="/images/t.jpg" id="pic" />
								</h:outputLink>

								<h:outputLink value="https://www.google.fr/">
									<h:graphicImage value="/images/f.jpg" id="pic2" />
								</h:outputLink>

							</h:panelGroup>

						</h:panelGrid>
					</div>

					

					
				</h:form>
			</div>

			<!--  fotter -->
			<div id="footer">
				<h3>TAFNI Amara</h3>
			</div>
		</div>

	</f:view>

</body>
</html>