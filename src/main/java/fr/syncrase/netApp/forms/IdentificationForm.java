package fr.syncrase.netApp.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class IdentificationForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String nom;
	String prenom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String toString() {
		return nom + " " + prenom;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		if ("".equals(nom)) {
			errors.add("erreur.nom", new ActionMessage("erreur.nom.vide"));
		} else if (nom.length() > 10) {
			errors.add("erreur.nom", new ActionMessage("erreur.nom.tropLong"));
		}

		if ("".equals(prenom)) {
			errors.add("erreur.prenom", new ActionMessage("erreur.prenom.vide"));
		} else if (nom.length() > 10) {
			errors.add("erreur.prenom", new ActionMessage(
					"erreur.prenom.tropLong"));
		}


		return errors;
	}

}
