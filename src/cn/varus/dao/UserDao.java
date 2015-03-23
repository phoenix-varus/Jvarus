package cn.varus.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.varus.dao.UserDao;
import cn.varus.entity.User;

@Component
// 被需要者的注入，被动提出
public class UserDao extends JdbcDaoSupport {
	private HibernateTemplate hibernateTemplate;

	@Resource
	public void setJb(JdbcTemplate jb) {
		super.setJdbcTemplate(jb);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	// 需要者的注入，主动要求
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	public User getUserInfo() {
		System.out.println(hibernateTemplate);
		// System.out.println(jd);
		System.out.println(this.getJdbcTemplate());
		User user = new User();
		List<User> userList = hibernateTemplate.find("from User ");
		user = userList.get(0);
		return user;
	}

}
