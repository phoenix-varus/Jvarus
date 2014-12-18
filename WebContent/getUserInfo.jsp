<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户信息</title>
</head>
<body>
	这里是用户信息界面。
	<br></br>
	<s:iterator id="user" value="#session.user"></s:iterator>
	<font>UserName:<input readonly="readonly" value="${user.name}"></input></font>
</body>
</html>