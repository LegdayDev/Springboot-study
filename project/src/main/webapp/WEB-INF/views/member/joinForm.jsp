<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>member 회원가입페이지</h1>
	<hr/>
	<form method="post" action="/member/joinForm">
		유저네임 : <input type="text" name="username"/><br/>
		비밀번호 : <input type="password" name="password"/><br/>
		이메일 : <input type="text" name="email"/><br/>
		<button type="submit">회원가입완료</button>
	</form>
</body>
</html>