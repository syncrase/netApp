package fr.syncrase.netApp.controleur;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class IdentificationAction extends Action {

	static Logger logger = Logger.getLogger(IdentificationAction.class);

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

//		logger.addAppender(logger.getAppender("FILE"));
		
		logger.info("succes");
		logger.warn("chaud");
		logger.error("attention");
		return mapping.findForward("succes");

	}

}
