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

<link href="css/updateAnnonce.css" rel="stylesheet">

</head>
<body>
	<f:view>
		<c:import url="/acceuilUtilisateur.jsp"></c:import>
		<div id="containerSeulAdresse">
			<h:form>
				<p>
					Veillez saisir l'adresse du bien  : <br>
				</p>
				<hr>
				
				
				<h:outputLabel for="email">Ville <span
						class="requis">*</span>
				</h:outputLabel>
				<h:inputText id="email" value="#{adresseBean.ville}" required="true"
					size="20" maxlength="60" styleClass="lesInputEmail" >						
				</h:inputText>
				<h:message id="emailMessage" for="email" errorClass="erreur" style="color: red" />
				<br />

				<h:outputLabel for="cartier">Cartier <span	class="requis">*</span>
				</h:outputLabel>
				<h:inputText id="cartier" value="#{adresseBean.cartier}"
					required="true" size="20" maxlength="20" styleClass="lesInputd" >
					
				</h:inputText>
				<h:message id="cartiers" for="cartier"	errorClass="erreur" style="color: red"/>
				<br />

				<h:outputLabel for="postale">Code Postale <span
						class="requis">*</span>
				</h:outputLabel>
				<h:inputText id="postale" value="#{adresseBean.codePostale}"
					required="true" size="20" maxlength="20"
					styleClass="lesInputMotPasse">
					<f:validateLength minimum="5" maximum="5" />
				</h:inputText>
				<h:message for="postale" style="color: red"></h:message>
				<br />		
				<h:messages globalOnly="true" infoClass="info" />
				<h:commandButton value="Suivant" styleClass="lesInput"
					action="#{adresseBean.creerAdresse }" />
			
				<br />
				
			</h:form>
		</div>		
	</f:view>
</body>
</html>