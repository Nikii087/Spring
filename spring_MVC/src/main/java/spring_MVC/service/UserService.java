package spring_MVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_MVC.dao.UserDao;
import spring_MVC.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	public int createUser(User user)
	{
		return this.userDao.saveUser(user);
	}

}
