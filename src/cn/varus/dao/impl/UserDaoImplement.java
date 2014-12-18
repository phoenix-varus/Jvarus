package cn.varus.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.varus.dao.UserDao;
import cn.varus.entity.User;

@Component
// 被需要者的注入，被动提出
public class UserDaoImplement implements UserDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	// 需要者的注入，主动要求
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	@Override
	public User getUserInfo() {
		User user = new User();
		List<User> userList = hibernateTemplate.find("from User ");
		user = userList.get(0);
		return user;
	}

}
