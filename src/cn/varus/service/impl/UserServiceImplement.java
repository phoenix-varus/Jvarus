package cn.varus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.varus.dao.UserDao;
import cn.varus.entity.User;
import cn.varus.service.UserService;

@Component
public class UserServiceImplement implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserInfo() {
		User user = userDao.getUserInfo();
		return user;
	}
}
