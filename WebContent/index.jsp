<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Identification :</h1>
	<html:form action="Identification" method="post">
		<table style="margin: 100px 0px 0px 200px">
			<!-- haut & droite & bas & gauche-->
			<tr>
				<td>nom :</td>
				<%-- <td><bean:message name="mesMessages" property="erreur.nom"/></td> --%><!-- name="pers" -->
				<!-- name est le nom du bean. c.f. struts-config.xml -->
				<td><html:text name="identificationForm" property="nom" /></td>
				<td><b style="color: red"> <html:errors
							property="erreur.nom" /> <!-- property permet de sélectionner le message d'erreur. c.f. mesMessages.properties.
							Si ce paramètre n'est pas renseigné, tous les messages sont affichés. -->
				</b></td>
			</tr>
			<tr>
				<td>Prénom :</td>
				<td><html:text name="identificationForm" property="prenom" /></td>
				<td><b style="color: red"><html:errors
							property="erreur.prenom" /></b></td>
			</tr>
			<tr>
				<td></td>
				<td><html:submit value="envoyer" />&nbsp;&nbsp;&nbsp;<html:reset
						value="reset" /></td>
			</tr>
		</table>
	</html:form>
	
</body>
</html>