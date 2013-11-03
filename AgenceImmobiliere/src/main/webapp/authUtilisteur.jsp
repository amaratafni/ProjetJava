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
<<<<<<< HEAD
<link href="css/style2.css" rel="stylesheet">
<link href="css/style3.css" rel="stylesheet">
<link href="css/connexion.css" rel="stylesheet">
<link href="css/ajouterAnnonce.css" rel="stylesheet">
<link href="css/ajouterAdresseetanonnce.css" rel="stylesheet">
<link href="css/updateAnnonce.css" rel="stylesheet">

<link href="css/propre.css" rel="stylesheet">
=======


>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
</head>
<body>
	
	<f:view>
			<c:import url="/acceuil.jsp"></c:import>	
		<h:form>			
			<!-- *********************************************************** -->
			<!-- authetification  -->
			<div id ="idConnexion">
			<rich:spacer height="200px"></rich:spacer>
			<center>
				<rich:panel
					style="background-image:url(#{facesContext.externalContext.requestContextPath}/images/ajax/userauth.png);
                            background-repeat:no-repeat;background-position:-35px -15px;
                            ;width:400px;"
					header="Authentification" styleClass="panel_3">

					<h:panelGrid columns="3">
						<h:panelGroup>
<<<<<<< HEAD
							<h:outputText value="Login :" />
							<br>
							<h:inputText value="#{utilisateurBean.alias}" id="alias"
								required="true" validator="#{utilisateurBean.validerAliasAuthentification}" styleClass="champsaisie"/>
							<h:message for="alias" style="color: red" />
							
							<br>
							<h:outputText value="Mot Passe : " />
							<br>
							<h:inputSecret value="#{utilisateurBean.email}" id="email"
								required="true" validator="#{utilisateurBean.validerEmailAuthentification}" styleClass="champsaisie" />
							<h:message for="email" style="color: red" />
						
=======
							<h:outputText value="alias :" />
							<h:inputText value="#{utilisateurBean.alias}" id="alias"
								required="true" validator="#{utilisateurBean.validerAliasAuthentification}" />
							<h:message for="alias" style="color: red" />
							<br>
							<h:outputText value="Email : " />
							<h:inputText value="#{utilisateurBean.email}" id="email"
								required="true" validator="#{utilisateurBean.validerEmailAuthentification}" />
							<h:message for="email" style="color: red" />
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
						</h:panelGroup>
					</h:panelGrid>

					<rich:spacer height="30px"></rich:spacer>

					<h:commandButton value="Connexion"
						action="#{utilisateurBean.checkValidityAuthentificationUser}" />
				</rich:panel>
			</center>
			<!--  -->
			</div>

		</h:form>

	</f:view>
</body>
</html>