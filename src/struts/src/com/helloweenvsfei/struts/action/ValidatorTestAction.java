/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.helloweenvsfei.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.helloweenvsfei.struts.form.ValidatorTestForm;

/**
 * MyEclipse Struts Creation date: 05-06-2008
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/validatorTest" name="validatorTestForm"
 *                input="/form/validatorTest.jsp" scope="request"
 *                validate="true"
 */
public class ValidatorTestAction extends Action {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		ValidatorTestForm validatorTestForm = (ValidatorTestForm) form;

		return mapping.getInputForward();
	}
}