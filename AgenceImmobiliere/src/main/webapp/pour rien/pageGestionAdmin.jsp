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
<title>Agence</title>
<!--  scipt -->
<script>
	function showGif() {
		document.getElementById("recherched").style.visibility = "visible";
		document.getElementById("pic1").style.visibility = "hidden";
		document.getElementById("ajouteClients").style.visibility = "hidden";
		document.getElementById("success").style.visibility = "hidden";
		document.getElementById("tabeRecherche").style.visibility = "hidden";

	}
	function showAcceuil() {
		document.getElementById("pic1").style.visibility = "hidden";

	}
	function ajouterClient() {
		document.getElementById("recherched").style.visibility = "hidden";
		document.getElementById("pic1").style.visibility = "hidden";
		document.getElementById("success").style.visibility = "hidden";
		document.getElementById("ajouteClients").style.visibility = "visible";
		document.getElementById("tabeRecherche").style.visibility = "hidden";
	}
	function success() {
		document.getElementById("recherched").style.visibility = "hidden";
		document.getElementById("pic1").style.visibility = "visible";
		document.getElementById("ajouteClients").style.visibility = "hidden";
		document.getElementById("success").style.visibility = "visible";
		document.getElementById("tabeRecherche").style.visibility = "hidden";
	}
	function showRecherche() {
		//je vais mettre le id d'un tableau
		document.getElementById("tabeRecherche").style.visibility = "visible";
		document.getElementById("recherched").style.visibility = "hidden";
		document.getElementById("pic1").style.visibility = "hidden";
		document.getElementById("ajouteClients").style.visibility = "hidden";
		document.getElementById("success").style.visibility = "hidden";
	}
</script>
</head>
<!--  inchalah je vai essayer de faire une simple page authenification ensuite je rentre sur cette aplication: -->
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
			</div>

			<!--  l'image richFaces : -->


			<div id="content">
				<h:form>
					<div id="sidebar" class="sidebar" style="width: 160px;">
						<rich:panelMenu style="width:210px" mode="ajax"
							iconExpandedGroup="disc" iconCollapsedGroup="disc"
							iconExpandedTopGroup="chevronUp" iconGroupTopPosition="right"
							iconCollapsedTopGroup="chevronDown">

							<rich:panelMenuGroup label="Gestion des Clients " expanded="true">
								<rich:panelMenuItem label="Supprimer Client" onclick="showGif();">
								</rich:panelMenuItem>

								<rich:panelMenuItem label="bloque"
									onclick="ajouterClient();">

								</rich:panelMenuItem>
								<rich:panelMenuItem label="Recherche Client"
									onclick="showRecherche();">
								</rich:panelMenuItem>
							</rich:panelMenuGroup>

							<rich:panelMenuGroup label="Gestion des annonces" expanded="true">
								<rich:panelMenuItem label="suprimer une annonce">
								</rich:panelMenuItem>
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

					<div id="success" style="visibility: hidden;">
						<h2>Insertion reussi...</h2>

					</div>

					<div id="recherched" align="center" style="visibility: hidden;">

						<rich:panel style="width:420px;">
							<f:facet name="header">
								<h:outputText value="Person Info"></h:outputText>
							</f:facet>
							<h:panelGrid columns="2">
								<h:outputText value="Name: " />
								<rich:inplaceInput defaultLabel="click to enter your name" />
								<h:outputText value="Email:" />
								<rich:inplaceInput defaultLabel="click to enter your email" />
								<h:form>
									<!--  je vai afficher un truc et je cache un truc avc onclik oki -->
									<h:commandButton value="Valider "
										action="#{clientBean.ajouterClient}" />
								</h:form>
								<!--  icilaisse tomber qd je clik il se rend vers la meme page principale donc normal oki -->
								<h:form>
									<h:commandButton value="Annuler " action="page1" />
								</h:form>
							</h:panelGrid>
						</rich:panel>
					</div>
				</h:form>
			</div>

			<!--  ajoue Client ici  -->

			<div id="ajouteClients" style="visibility: hidden;">
				<h:form>
					<!--  je vais crier un formulaire d'ajoute Client  -->
					<rich:panel style="width:450px;">
						<f:facet name="header">
							<h:outputText value="Formulaire Ajoute Clients"></h:outputText>
						</f:facet>
						<h:panelGrid columns="3">
							<h:outputText value="Name: " />
							<rich:inplaceInput value="#{clientBean.nomClient }"
								defaultLabel="click to enter your name" />
							<br>
							<h:outputText value="Date:" />
							<%-- 	<rich:inplaceInput value="#{clientBean.dateInscri }" defaultLabel="click to enter your DATE"/> --%>
							<rich:calendar value="#{clientBean.dateInscri}"></rich:calendar>
							<br>

							<!--  je vai afficher un truc et je cache un truc avc onclik oki -->
							<h:commandButton value="Valider" onclick="success();"
								action="#{clientBean.ajouterClient}" />
							<!--  icilaisse tomber qd je clik il se rend vers la meme page principale donc normal oki -->

							<h:commandButton value="Annuler " action="page1" />

						</h:panelGrid>
					</rich:panel>

					<!--  fini ii formulaire ajouClient -->

				</h:form>
			</div>
			<div id="tabeRecherche" style="visibility: hidden">
				<!-- nom inchamah -->
				<h:form>
					<rich:dataTable var="list" value="#{clientBean.clientList}"
						id="table">

						<!-- déclaration des colonnes -->
						<f:facet name="header">
							<rich:columnGroup>
								<rich:column>
									<h:outputText value="Nom" />
								</rich:column>
								<rich:column>
									<h:outputText value="Date Inscrip" />
								</rich:column>
								<rich:column>
									<h:outputText value="Identifiant" />
								</rich:column>
							</rich:columnGroup>
						</f:facet>
						<rich:column>
							<h:outputText value="#{list.nomClient}" />
						</rich:column>
						<rich:column>
							<h:outputText value="#{list.dateInscri}" />
						</rich:column>
						<rich:column>
							<h:outputText value="#{list.idClient}" />
						</rich:column>
					</rich:dataTable>
				</h:form>
				<!--  fini now inchalah -->
			</div>
			<div id="formulaireRecherche"></div>

			<!--  fotter -->
			<div id="footer">
				<h3>TAFNI Amara</h3>
			</div>
		</div>

	</f:view>

</body>
</html>