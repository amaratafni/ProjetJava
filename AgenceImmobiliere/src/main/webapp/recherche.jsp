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
<link href="css/recherche.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page de recherche</title>

</head>
<body>
	<f:view>
	<c:import url="/acceuil.jsp"></c:import>
		<h:form id="table">

			<table>
				
				<tr>
					<td>Type Bien:</td>
					<td><h:selectOneMenu value="#{rechercheBean.annonce.typeBien}" required="true" requiredMessage="champs obligatoire">
							<f:selectItem itemLabel="" itemValue="" />
							<f:selectItem itemLabel="Apartement" itemValue="Apartement" />
							<f:selectItem itemLabel="Studio" itemValue="Studio" />
							<f:selectItem itemLabel="Chambre" itemValue="Chambre" />
						</h:selectOneMenu>
						<rich:message	for="prix" style="color: red" />
					</td>
				</tr>
				<tr>
					<td>Type Annonce:</td>
					<td><h:selectOneMenu value="#{rechercheBean.annonce.typeAnnonce}" required="true" requiredMessage="champs obligatoire">
							<f:selectItem itemLabel="" itemValue="" />
							<f:selectItem itemLabel="Vente" itemValue="Vente" />
							<f:selectItem itemLabel="Location" itemValue="Location" />
						</h:selectOneMenu>
						<rich:message	for="prix" style="color: red" />
					</td>
				</tr>
				<tr>
					<td>Titre :</td>
					<td><h:inputText id="titre" value="#{rechercheBean.annonce.titre}"
							required="true" requiredMessage="champs obligatoire" /></td>
				</tr>
				<tr>
					<td>Surface</td>
					<td><h:inputText id="sur" value="#{rechercheBean.annonce.surface}"
							required="true" requiredMessage="champs obligatoire" />m2 <rich:message
							for="sur" style="color: red" /></td>
				</tr>

				<tr>
					<td>Surface Carry :</td>
					<td><h:inputText id="surf" value="#{rechercheBean.annonce.surfaceCarry}"
							required="true" requiredMessage="champs obligatoire" />m2<rich:message
							for="surf" style="color: red" /></td>
				</tr>

				<tr>
					<td>Description du Bien :</td>
					<td><h:inputTextarea value="#{rechercheBean.annonce.description}">
							<f:validateLength maximum="100"></f:validateLength>
						</h:inputTextarea></td>
				</tr>
				<tr>
					<td>Classe Energitique</td>
					<td><h:selectOneMenu value="#{rechercheBean.annonce.classeEnergitique}">
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
					<td>Prix:</td>
					<td><h:inputText id="prix" value="#{rechercheBean.annonce.prix}"
							required="true" requiredMessage="champs obligatoire" />Euro. <rich:message
							for="prix" style="color: red" /></td>
				</tr>
				
			</table>

			<div id="butonEnregister">
				<h:commandButton value="Recherche"
					action="#{rechercheBean.recherche }" styleClass="avesettings" />
			</div>

		</h:form>

	</f:view>
</body>
</html>