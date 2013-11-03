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
<title>Insert title here</title>
<link href="css/style2.css" rel="stylesheet">
<link href="css/style3.css" rel="stylesheet">
<link href="css/connexion.css" rel="stylesheet">
<link href="css/ajouterAnnonce.css" rel="stylesheet">
<link href="css/ajouterAdresseetanonnce.css" rel="stylesheet">
<link href="css/propre.css" rel="stylesheet">
<link href="css/updateAnnonce.css" rel="stylesheet">
<style>
.top {
	vertical-align: top;
}

.info {
	height: 202px;
	overflow: auto;
}
</style>
</head>
<body>
	<f:view>
		<c:import url="/acceuilUtilisateur.jsp"></c:import>
		<div id="containerddd">
			<h:form>
				<h4>Formulaire, Ajouter une annonce utilisateur :</h4>
				<table>
					<tr>
						<td>Type Bien:</td>
						<td><h:selectOneMenu value="#{annonceBean.annonce.typeBien}">
								<f:selectItem itemLabel="Apartement" itemValue="Apartement" />
								<f:selectItem itemLabel="Studio" itemValue="Studio" />
								<f:selectItem itemLabel="Chambre" itemValue="Chambre" />
							</h:selectOneMenu></td>
					</tr>
					<tr>
						<td>Type Annonce:</td>
						<td><h:selectOneMenu
								value="#{annonceBean.annonce.typeAnnonce}">
								<f:selectItem itemLabel="Vente" itemValue="Vente" />
								<f:selectItem itemLabel="Location" itemValue="Location" />
							</h:selectOneMenu></td>
					</tr>
					<tr>
						<td>Titre :</td>
						<td><h:inputText id="titre"
								value="#{annonceBean.annonce.titre}" required="true"
								requiredMessage="champs obligatoire" /></td>
					</tr>
					<tr>
						<td>Surface</td>
						<td><h:inputText id="sur"
								value="#{annonceBean.annonce.surface}" required="true"
								requiredMessage="champs obligatoire" />m2 <rich:message
								for="sur" style="color: red" /></td>
					</tr>

					<tr>
						<td>Surface Carry :</td>
						<td><h:inputText id="surf"
								value="#{annonceBean.annonce.surfaceCarry}" required="true"
								requiredMessage="champs obligatoire" />m2<rich:message
								for="surf" style="color: red" /></td>
					</tr>

					<tr>
						<td>Description du Bien :</td>
						<td><h:inputTextarea
								value="#{annonceBean.annonce.description}">
								<f:validateLength maximum="100"></f:validateLength>
							</h:inputTextarea></td>
					</tr>
					<tr>
						<td>Classe Energitique</td>
						<td><h:selectOneMenu
								value="#{annonceBean.annonce.classeEnergitique}">
								<f:selectItem itemLabel="A" itemValue="A" />
								<f:selectItem itemLabel="B" itemValue="B" />
								<f:selectItem itemLabel="C" itemValue="B" />
								<f:selectItem itemLabel="D" itemValue="B" />
								<f:selectItem itemLabel="E" itemValue="B" />
								<f:selectItem itemLabel="F" itemValue="B" />
								<f:selectItem itemLabel="G" itemValue="B" />
							</h:selectOneMenu>
					</tr>

					<tr>
						<!-- email -->
					<tr>
						<td>Email:</td>
						<td><h:inputText value="#{annonceBean.annonce.email}"
								required="true" requiredMessage="champs obligatoire" id="email" />
							<rich:message for="email" style="color: red" /></td>
					</tr>
					<tr>
						<td>Tel :</td>
						<!-- Teléphone -->
						<td><h:inputText id="tel"
								value="#{annonceBean.annonce.numTel}" required="true"
								requiredMessage="champs obligatoire" /> <rich:message for="tel"
								style="color: red" /></td>
					</tr>
					<tr>
						<td>Prix:</td>
						<td><h:inputText id="prix"
								value="#{annonceBean.annonce.prix}" required="true"
								requiredMessage="champs obligatoire" />Euro. <rich:message
								for="prix" style="color: red" /></td>
					</tr>
				</table>
				<!--  immage : -->
				<h:panelGrid columns="2" columnClasses="top,top">
						<rich:fileUpload fileUploadListener="#{fileUploadBean.listener}"
							id="upload" acceptedTypes="jpg, gif, png, bmp"
							ontyperejected="alert('Only JPG, GIF, PNG and BMP files are accepted');"
							maxFilesQuantity="1" immediateUpload="false">
							<a4j:support event="onuploadcomplete" reRender="info" />
						</rich:fileUpload>
						</h:panelGrid>
				<!--  immage  -->
				<h:form>
					<div id="butonEnregister">
						<h:commandButton value="Enregistrer"
							action="#{annonceBean.creerAnnonce}" styleClass="avesettings" />
					</div>
					<div id="butonAnnuler">
						<h:commandButton value="Annuler" immediate="true"
							action="#{annonceBean.annulerInsertionAdresse}"
							styleClass="avesettings" />
					</div>
				</h:form>
				<h:form>
					

					
				</h:form>
			</h:form>
			


		</div>
	</f:view>
</body>
</html>
