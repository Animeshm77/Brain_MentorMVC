package demo.niit.brainmentor_mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import demo.niit.brainmentor_mvc.dao.LoginDao;
import demo.niit.brainmentor_mvc.entity.Admin;
import demo.niit.brainmentor_mvc.entity.Student;
import demo.niit.brainmentor_mvc.entity.User;
import demo.niit.brainmentor_mvc.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDAO;

	public Student getStudent(User user) {
		return loginDAO.getStudent(user);
	}

	public Admin getAdmin(User user) {
		return loginDAO.getAdmin(user);
	}

}