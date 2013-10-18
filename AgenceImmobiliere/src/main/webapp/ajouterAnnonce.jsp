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
<script>
	
</script>

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
<link href="css/connexion.css" rel="stylesheet">
<link href="css/ajouterAnnonce.css" rel="stylesheet">
</head>
<body>
	<f:view>
		<c:import url="/acceuilUtilisateur.jsp"></c:import>
	
		<h:form id="idAjouterAnnonce">		
			<rich:panel
				style=
                            "width:700px"
				>

				<h:panelGrid columns="3">
					<h:outputText value="* Type Annonce:" />
					<h:inputText id="log" value="#{annonceBean.typeAnnonce}"
						required="true" requiredMessage="champs obligatoire">
					</h:inputText>
					<rich:message for="log" style="color: red" />

					<h:outputText value="* Type Bien :" />
					<h:inputText id="mdp" value="#{annonceBean.typeBien}"
						required="true" requiredMessage="champs obligatoire" />
					<rich:message for="mdp" style="color: red" />

					<h:outputText value="Titre :" />
					<h:inputText id="titre" value="#{annonceBean.titre}"
						required="true" requiredMessage="champs obligatoire" />
					<br>

					<h:outputText value="* Surface :" />
					<h:inputText id="sur" value="#{annonceBean.surface}"
						required="true" requiredMessage="champs obligatoire" />
					<rich:message for="sur" style="color: red" />
					
					<h:outputText value="* Date publication :" />
					<rich:calendar value="#{annonceBean.datePublication}"></rich:calendar>
					<br>
					<h:outputText value="* Surface_Carry :" />
					<h:inputText id="surf" value="#{annonceBean.surfaceCarry}"
						required="true" requiredMessage="champs obligatoire" />
					<rich:message for="surf" style="color: red" />
					
					<h:outputText value="Description du Bien :" />
					<h:inputTextarea value="#{annonceBean.description}">
						<f:validateLength maximum="100"></f:validateLength>
					</h:inputTextarea>
					<br>
					<h:outputText value="* Classe Energitique :" />
					<h:inputText id="energ" value="#{annonceBean.classeEnergitique}"
						required="true" requiredMessage="champs obligatoire" />
					<rich:message for="energ" style="color: red" />
					
					<h:outputText value="* Email :" />
					<h:inputText id="emai" value="#{annonceBean.email}"
						required="true" requiredMessage="champs obligatoire" />
					<rich:message for="emai" style="color: red" />
					
					<h:outputText value="*Teléphone :" />
					<h:inputText id="tel" value="#{annonceBean.numTel}"
						required="true" requiredMessage="champs obligatoire" />
					<rich:message for="tel" style="color: red" />
					
					<h:outputText value="*Prix :" />
					<h:inputText id="prix" value="#{annonceBean.prix}"
						required="true" requiredMessage="champs obligatoire" />
					<rich:message for="prix" style="color: red" />
					
					<h:commandButton value="Valider"
						action="#{annonceBean.creerAnnonce}"
						 	styleClass="apply"/>
					
				</h:panelGrid>
			</rich:panel>
		</h:form>

	</f:view>
</body>
</html>