package cn.varus.web;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.varus.entity.User;
import cn.varus.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

@Component("userController")
public class UserController extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;

	@Autowired
	private UserService userService;
	@Autowired
	private User user;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}

	public String getUserInfo() {
		User user = userService.getUserInfo();
		session.put("user", user);
		return SUCCESS;
	}
}
