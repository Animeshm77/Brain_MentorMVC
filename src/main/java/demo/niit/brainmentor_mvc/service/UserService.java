package demo.niit.brainmentor_mvc.service;


import demo.niit.brainmentor_mvc.entity.User;

public interface UserService {

	public User getUser(User user);
	public void createUser(User user);

}