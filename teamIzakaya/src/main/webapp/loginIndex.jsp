<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
li { line-height: 150%;}
a  { text-decoration: none; }
</style>
</head>
<body>
<h1>loginIndex</h1>

<form method="post">
ID : <input type="text" name="implId">
PASSWORD : <input type="password" name="implPw"><br>
<input type="submit" value="login" formaction="/employee/login.do">
<br>
<!-- 위 기능으로 고객메인페이지로 이동해야하는데 일단 임시로 이동경로 만들었습니다. -->
<a href="/custom/main.do"></a>

</form>
</body>
</html>
