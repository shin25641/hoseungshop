<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta name="viewport"
	content="width=device-width, height=device-height, minimum-scale=1.0, maximum-scale=1.0, initial-scale=1.0">
	<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>
	<div class="login_page">
		<div class="container login">
		<header>
		   	<div class="header__logo">
            	<a href="/"><img src="img/logo.png" alt=""></a>
            </div>
			<h4>로그인</h4>
		</header>
		<form action="doLogin" method="POST">
			<c:if test="${LoginFailMessage!=null}">
				<p> Error : <c:out value="${LoginFailMessage}"/> </p>
			</c:if>
			<div class="input-box">
				<input id="username" type="text" name="username" placeholder="아이디">
				<label for="username">아이디</label>
			</div>
			<div class="input-box">
				<input id="password" type="password" name="password"
					placeholder="비밀번호"> <label for="password">비밀번호</label>
			</div>
		</form>
			<div id="forgot"><a href="#">아이디 찾기</a> | <a href="#">비밀번호 찾기</a></div>
			<input type="submit" value="로그인">
			<p class="login-join-text">
				<span>가입만 해도 즉시 15% 할인</span>
				<a href="/joinForm">회원가입</a>
			</p>
		</div>
	</div>
</body>
</html>


