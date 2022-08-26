<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입페이지</h1>
	<hr/>
	<form method="post" action="/user/join">
		username : <input type="text" name="username"/><br/>
		password : <input type="text" name="password"/><br/>
		email : <input type="text" name="email"/><br/>
		<button type="submit">회원가입완료</button>
	</form>
</body>
</html>
