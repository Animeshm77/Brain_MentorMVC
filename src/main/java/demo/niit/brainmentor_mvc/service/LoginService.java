package demo.niit.brainmentor_mvc.service;


import demo.niit.brainmentor_mvc.entity.Admin;
import demo.niit.brainmentor_mvc.entity.Student;
import demo.niit.brainmentor_mvc.entity.User;

public interface LoginService {

	public Student getStudent(User user);
	public Admin getAdmin(User user);


}