<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page buffer="32kb" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<<<<<<< HEAD
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
=======

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style2.css" rel="stylesheet">
<link href="css/style3.css" rel="stylesheet">
<link href="css/connexion.css" rel="stylesheet">
<link href="css/ajouterAnnonce.css" rel="stylesheet">
<link href="css/ajouterAdresseetanonnce.css" rel="stylesheet">
</head>

<body>
	<f:view>
	<c:import url="/acceuilUtilisateur.jsp"></c:import>
	<div id="container">
	<h:form>
	
        	<p>
        		
        		Veillez saisir les informations nécessaire : <br>
        	
        	</p>
         <hr>
           
            <h:outputLabel for="email">Ville <span class="requis">*</span></h:outputLabel>
            <h:inputText id="email" value="#{adresseBean.ville}" required="true" size="20" maxlength="60" styleClass="lesInputEmail"/>
            <h:message id="emailMessage" for="email" errorClass="erreur" />
            <br />
     
            <h:outputLabel for="motdepasse">Cartier <span class="requis">*</span></h:outputLabel>
            <h:inputSecret id="motdepasse" value="#{adresseBean.cartier}" required="true" size="20" maxlength="20" styleClass="lesInputd"/>
            <h:message id="motDePasseMessage" for="motdepasse" errorClass="erreur"  />
            <br />
     
            <h:outputLabel for="confirmation">Confirmation <span class="requis">*</span></h:outputLabel>
            <h:inputSecret id="confirmation" value="#{adresseBean.codePostale}" required="true" size="20" maxlength="20" styleClass="lesInputMotPasse"/>
            <h:message id="confirmationMessage" for="confirmation" errorClass="erreur" />
            <br />
     
            
           
             
            <h:messages globalOnly="true" infoClass="info" />
     
            <h:commandButton value="Next"  styleClass="lesInput"  action="#{adresseBean.creerAdresse }"/>
            <!--  je clique et j'enregistre et si il anule dans la page suivvante je vais surprimer ce que j'ai me -->
            <br />
         <hr>
         <p>
         
         
         </p>
         <p>
         
         
         </p>
         <p>UVSQ 2013</p>
        </h:form>    
        </div>
		<%-- <h:form>
			<h4>
				Formulaire Ajouter une adresse au <a
					href="http://www.objis.com/formation-java/club-objis.html">Club
					Objis</a>.
			</h4>
			<hr>
			<table>
				<tr>
					<td>Ville:</td>
					<td><h:inputText value="" required="true" id="prenom" /> <h:message
							for="prenom" /></td>
				</tr>
				<tr>
					<td>Code Postale:</td>
					<td><h:inputText value="" required="true" id="nom" /> <h:message
							for="nom" /></td>
				</tr>
				<tr>
					<td>Cartier:</td>
					<td><h:inputText value="" required="true" id="cartier" /> <h:message	for="nom" /></td>
				</tr>							
			</table>
			<p>
				<h:commandButton value="Next" action="register" />
			</p>
			<hr>
		</h:form> --%>
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
	</f:view>
</body>
</html>