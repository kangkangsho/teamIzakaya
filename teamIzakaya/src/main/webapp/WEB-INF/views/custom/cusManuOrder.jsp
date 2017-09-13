<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
@import url(http://fonts.googleapis.com/earlyaccess/hanna.css);

.header ul li{display:inline; float: left;}
.header div{margin-top:-13px;text-align:center;border: 1px outset ;background-color:#4C4C4C ; border-radius: 5px 5px 5px 5px; width:253px; height:50px ;float:left; font-size: 28pt; text-align: center;font-family: 'Hanna';padding-top: 8px;}
.header img {margin-top:-13px;width: 240px; height: 60px ;float: left; }
a {text-decoration: none;}


.category {clear:left ;background-color: blue; width: 18%}
#ul2 li{border-radius: 5px 5px 5px 5px; margin-left:-47px;list-style-type: none; border: 1px solid black; background-color: #FFBB00; color:#662500;  width:240px; text-align: center; font-size: 30pt; font-family: 'Hanna';padding-bottom: 10px; padding-top: 10px;}
#ul2 li:HOVER {color: red;}
a:LINK {color: white;}
a:VISITED {color: white;}
.active {color: #FFBB00}

.center {float:right; width: 81%; height: 510px; background-color: pink;}
</style>
</head>

<script src='/jquery-3.2.1.js'>
</script>

<script>
$(function(){
	$(window).ready(function(){
		console.log("good!");
	})	
})
</script>


<body>
<div class="header">
	<a href="cusMain.jsp" ><img src="../pic/캡처.PNG"></a>
	<ul id="ul1">
	<li><div><a href="cusOrder.jsp" >메뉴주문</a></div></li>
	<li><div><a href="shoppingList.jsp">장바구니</a></div></li>
	<li><div><a href="#">주문내역</a></div></li>
	<li><div><a href="#">직원호출</a></div></li>
	</ul>
</div>

<div class="center">
	aaa
</div>


<div class="category">
	<ul id="ul2">
		<li><a>주류</a></li>
		<li><a>음료</a></li>
		<li><a>음식</a></li>
		<li><a>한정메뉴</a></li>
		<li><a>인기메뉴</a></li>
	</ul>
</div>

</body>


</html>