package org.slc.sli.controller;

import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.slc.sli.entity.SpringPropertiesTest;

/**
 * 
 * TODO: Write Javadoc
 * 
 */
public class LoginController {

	private SpringPropertiesTest testClass;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model, HttpSession session,
			HttpServletRequest request) {
		System.out.println("before printing session atts");
		Enumeration attributeNames = session.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			System.out.println(attributeNames.nextElement());
		}
		// System.out.println("cookie = " + cookie);
		System.out.println("after priting session atts");

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int index = 0; index < cookies.length; index++) {
				System.out.println("Cookie[" + index + "] = "
						+ cookies[index].getName() + "= "
						+ cookies[index].getValue());
			}
		}
		System.out.println("Referrer URL = " + request.getHeader("referer"));
		// System.out.println("SessionAtts = " + session.getAttributeNames());
		model.addAttribute("message", "Enter Username and password");
		model.addAttribute("errorMessage",
				"Invalid Username or password, please try again");
		model.addAttribute("displayError", "none");
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView checkLogin(String username, String pwd, ModelMap model) {

		String[] acceptableUsers = { "sivan", "david", "sravan", "cgray",
				"lkim", "rbraverman" };
		String user = username;
		for (int i = 0; i < acceptableUsers.length; i++) {
			if (acceptableUsers[i].equals(username)) {
				if (i < 3)
					user = "common";
				return new ModelAndView("redirect:appselector").addObject(
						"username", user);
			}
		}

		model.addAttribute("message", "Enter valid Username");
		model.addAttribute("errorMessage",
				"Invalid Username or password, please try again");
		model.addAttribute("displayError", "block");
		return new ModelAndView("login");

	}

	public SpringPropertiesTest getTestClass() {
		return testClass;
	}

	public void setTestClass(SpringPropertiesTest testClass) {
		this.testClass = testClass;
	}

}
