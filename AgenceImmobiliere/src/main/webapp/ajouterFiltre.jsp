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
<title>Ajouter un Filtre</title>
<script>
function alerte(){
alert('ici ce que tu veux'); 
}
</script> 

<link href="css/ajouterFiltre.css" rel="stylesheet">
</head>
<body>
	<f:view>
		<c:import url="/acceuilUtilisateur.jsp"></c:import>
		<div id="containerAjouterFiltre">
			<h:form>
				<h4>Formulaire, Ajouter une ALERTE :</h4>
				<table>
					<tr>
						<td>Type Bien:</td>
						<td><h:selectOneMenu value="#{filtreBean.typeBien}">
								<f:selectItem itemLabel="" itemValue="" />
								<f:selectItem itemLabel="Apartement" itemValue="Apartement" />
								<f:selectItem itemLabel="Studio" itemValue="Studio" />
								<f:selectItem itemLabel="Chambre" itemValue="Chambre" />
							</h:selectOneMenu>
							
							</td>
					</tr>
					<tr>
						<td>Type Annonce:</td>
						<td><h:selectOneMenu value="#{filtreBean.typeAnnonce}" >
								<f:selectItem itemLabel="" itemValue="" />
								<f:selectItem itemLabel="Vente" itemValue="Vente" />
								<f:selectItem itemLabel="Location" itemValue="Location" />
							</h:selectOneMenu></td>
					</tr>
					<tr>
						<td>Localisation :</td>					
						<td>
							<h:inputText id="ville"	value="#{filtreBean.localisationBien}" required="true"/> 
							<rich:message	for="ville" style="color: red" />
						</td>
					</tr>
					<tr>
						<td>Date publication :</td>
						<td><rich:calendar value="#{filtreBean.datePublication}"></rich:calendar></td>

					</tr>


					<tr>
						<td>Nombre de Pièce :</td>
						<td><h:inputText id="nbPiece" value="#{filtreBean.nbPiece}" />
							<rich:message for="nbPiece" style="color: red" /></td>
					</tr>
					<tr>
						<td>Intervale Prix:</td>
						<td><h:inputText id="prix" value="#{filtreBean.intervalPrix}" />
							<rich:message for="prix" style="color: red" />Euro</td>
					</tr>
					<tr>
						<td>Surface</td>
						<td><h:inputText id="sur"
								value="#{filtreBean.intervalSurface}" /> <rich:message
								for="sur" style="color: red" /> M2
					</tr>

					<tr>
						<td>Description du Bien :</td>
						<td><h:inputTextarea value="#{filtreBean.termeDescription}">
								<f:validateLength maximum="100"></f:validateLength>
							</h:inputTextarea></td>
					</tr>
					<!--  n'oublier pas dans le bean ajouter l'etat du filtre
				 -->

				</table>
				<div id="butonEnregister">
					<h:panelGroup>
						<h:commandButton value="Executer"
							action="#{filtreBean.creerFiltre }" />
						<h:commandButton value="Annuler" action="succesAjoueAnnotation"
							immediate="true" />
					</h:panelGroup>
				</div>
				
				
			</h:form>
		</div>
	</f:view>
</body>
</html>