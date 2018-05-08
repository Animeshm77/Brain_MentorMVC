package demo.niit.brainmentor_mvc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import demo.niit.brainmentor_mvc.entity.User;
import demo.niit.brainmentor_mvc.service.LoginService;
import demo.niit.brainmentor_mvc.utility.AppUtility;

public class StudentController {
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
			model.addObject(AppUtility.USER, user);
			model.addObject(AppUtility.USER_ROLEID, user.getRoleId());
		}
		return model;
	}

}
