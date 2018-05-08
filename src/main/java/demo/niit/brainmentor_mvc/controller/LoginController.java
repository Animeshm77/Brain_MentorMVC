package demo.niit.brainmentor_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import demo.niit.brainmentor_mvc.entity.User;
import demo.niit.brainmentor_mvc.service.LoginService;
import demo.niit.brainmentor_mvc.utility.AppUtility;



@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute User user) {
		User loginUser = null;
		ModelAndView model = null;

		switch (user.getRoleId()) {
		case AppUtility.STUDENT_ROLEID:
			loginUser = loginService.getStudent(user);
			break;
		case AppUtility.ADMIN_ROLEID:
			loginUser = loginService.getStudent(user);
			break;
		default:
			return model;
		}
		if (loginUser == null) {
			model = new ModelAndView(AppUtility.LOGIN);
			model.addObject(AppUtility.RESULT, AppUtility.INVALID_LOGIN_ERROR);
		} else {
			model = new ModelAndView(AppUtility.HOME);
			model.addObject(AppUtility.USER, loginUser);
			model.addObject(AppUtility.USER_ROLEID, loginUser.getRoleId());
		}
		return model;
	}

	@RequestMapping(value = "home_page", method = RequestMethod.GET)
	public ModelAndView viewHomePage(@ModelAttribute User user) {
		return new ModelAndView("home_page");
	}
	
	@RequestMapping(value = "login_page", method = RequestMethod.GET)
	public ModelAndView viewLoginPage(@ModelAttribute User user) {
		return new ModelAndView("login_page");
	}
	@RequestMapping(value = "register_page", method = RequestMethod.GET)
	public ModelAndView viewRegisterPage(@ModelAttribute User user) {
		return new ModelAndView("register_page");
	}
	
	
	
	

}
