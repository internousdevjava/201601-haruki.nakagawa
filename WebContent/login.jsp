<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン</title>
</head>
<body>

<center>
	<h3>ログイン</h3>
  		<s:form action ="LoginAction">
  			<p>ユーザーID：
  				<s:textfield  label ="ID"  name = "id" />
 			 <p>パスワード：
  				<s:password  label = "Password"  name = "password"/>
				<p>
			<s:submit  value = "ログイン"/>
  		</s:form>
</center>
</body>
</html>