package fr.syncrase.netApp.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class FormTest extends ActionForm  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		return errors;
	}
	
}
