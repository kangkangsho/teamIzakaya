<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
@import url(http://fonts.googleapis.com/earlyaccess/hanna.css);

.header ul li{display:inline; float: left;}
.header div{margin-top:-13px;text-align:center;border: 1px outset ;background-color:#4C4C4C ; border-radius: 5px 5px 5px 5px; width:234px; height:50px ;float:left; font-size: 28pt; text-align: center;font-family: 'Hanna';padding-top: 8px;}

.main {margin-top:-13px;width: 240px; height: 60px ;float: left; }
.a{width: 240px; height: 60px}
a {text-decoration: none;}
a:LINK {color: white;}
a:VISITED {color: white;}
.active {color: #FFBB00}
.center {position: absolute; top: 400px; left: 800px}
</style>
</head>
<body>
<div class="header">
	<a href="managerIndex.jsp" class="a" >
		<img src="<c:url value="/resources/img/arino.png"/>" class="main"></a>
	<ul id="ul1">
	<li><div><a href="cusOrder.jsp" >매상관리</a></div></li>
	<li><div><a href="shoppingList.jsp">메뉴관리</a></div></li>
	<li><div><a href="#" style="font-size: 20pt; position: absolute; left: 800px;">한정메뉴<br>수량관리</a></div></li>
	<li><div><a href="#" style="font-size: 20pt; position: absolute; left: 1035px;">결제내역<br>관리</a></div></li>
	<li><div><a href="#">이벤트관리</a></div></li>
	<li><div><a href="#">회원관리</a></div></li>
	<li><div><a href="#" style="font-size: 20pt; position: absolute; left: 1730px;">직원,테이블<br>아이디관리</a></div></li>
	</ul>
</div>

<div class="center">
	<img src="<c:url value="/resources/img/arino.jpg"/>">
</div>



</body>
</html>