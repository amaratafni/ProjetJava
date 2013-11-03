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
<title>resultat Recherche</title>
</head>
<body>
	<f:view>
		<h:form>
		<h3>les resultats rechercher : </h3><br>
		
			<rich:panel bodyClass="rich-laguna-panel-no-header">
				<h:panelGrid columns="2">
					<a4j:mediaOutput element="img" mimeType="#{file.mime}"
						createContent="#{rechercheBean.paint}" value="#{row}"
						style="width:200px; height:200px;" cacheable="false">
						<f:param value="#{fileUploadBean.timeStamp}" name="time" />
					</a4j:mediaOutput>
					<h:panelGrid columns="2">
						<h:outputText value="File Name:" />
						<h:outputText value="#{file.name}" />												
					</h:panelGrid>
				</h:panelGrid>
			</rich:panel>

		</h:form>
	</f:view>
</body>
</html>