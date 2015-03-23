package cn.varus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.varus.dao.UserDao;
import cn.varus.entity.User;
import cn.varus.service.UserService;

@Component
public class UserService {
	@Autowired
	private UserDao userDao;

	public User getUserInfo() {
		User user = userDao.getUserInfo();
		return user;
	}
}
