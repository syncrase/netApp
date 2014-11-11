package fr.syncrase.netApp.controleur;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ActionTest extends Action {

	static Logger logger = Logger.getLogger(ActionTest.class);
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {

		logger.info("action test");
		logger.warn("warning");
		logger.error("error");
		
		return mapping.findForward("succes");
	}

}
