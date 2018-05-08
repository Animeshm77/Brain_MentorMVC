package demo.niit.brainmentor_mvc.dao;

import demo.niit.brainmentor_mvc.entity.Admin;
import demo.niit.brainmentor_mvc.entity.Student;
import demo.niit.brainmentor_mvc.entity.User;

public interface LoginDao {
	public Student getStudent(User user);
	public Admin getAdmin(User user);
}