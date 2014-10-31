<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="#" method="post">
		<table>

			<tr>
				<td>User Name</td>
				<td><input type="text" name="j_username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="j_password"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Login"></td>
			</tr>



		</table>
	</form>
	
	 <a href="connect/facebook" ></a><input type="button" value="Login with Facebook"> </a>
	 <input type="button" value="Login with Google">
	 <input type="button" value="Login with Twitter">
	
</body>
</html>