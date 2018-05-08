<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="demo.niit.brainmentor_mvc.utility.AppUtility"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/styles.css">
	
<style type="text/css">
body {
	background:
		url("${pageContext.request.contextPath}/assets/images/background.jpg");
}

.button {
	padding: 10px 15px;
	font-size: 14px;
	line-height: 100%;
	text-shadow: 0 1px rgba(0, 0, 0, 0.4);
	color: #fff;
	vertical-align: middle;
	text-align: center;
	cursor: pointer;
	font-weight: bold;
	transition: background 0.1s ease-in-out;
	-webkit-transition: background 0.1s ease-in-out;
	-moz-transition: background 0.1s ease-in-out;
	-ms-transition: background 0.1s ease-in-out;
	-o-transition: background 0.1s ease-in-out;
	text-shadow: 0 1px rgba(0, 0, 0, 0.3);
	color: #fff;
	-webkit-border-radius: 40px;
	-moz-border-radius: 40px;
	border-radius: 40px;
	font-family: 'Helvetica Neue', Helvetica, sans-serif;
}

.button, .button:hover, .button:active {
	outline: 0 none;
	text-decoration: none;
	color: #fff;
}

.username {
	background-color: #2ecc71;
	box-shadow: 0px 3px 0px 0px #239a55;
}
</style>

<title>Home Admin</title>
</head>
<body>

	<div id='cssmenu'>
		<ul>
			<li class=''><a
				href='${pageContext.request.contextPath}/home_page.jsp'><span>Home</span></a></li>
			<c:if test='${ empty sessionScope.userName}'>
				<li><a
					href='${pageContext.request.contextPath}/login_pageAdmin.jsp'><span>Login</span></a></li>
				<li><a
					href='${pageContext.request.contextPath}/register_page.jsp'><span>Register</span></a></li>
			</c:if>
		</ul>
	</div>

	<c:if test='${not empty sessionScope.userName}'>

		<div style="position: absolute; top: 70px; left: 1100px">
			Logged as <a href='${pageContext.request.contextPath}/userprofile_page.jsp' class="button username">${sessionScope.userName}</a>
		</div>

		<div style="position: absolute; top: 70px; left: 1300px">
			<a href='${pageContext.request.contextPath}/logout'>Logout</a>
		</div>
		<table>
		<tr>
<form action="">
<input type=submit value="Add Test" >
<input type=submit value="Add Question" >
<input type=submit value="Delete Test " >
<input type=submit  value = "Delete Question">



</form></tr></table>
	</c:if>

</body>
</html>