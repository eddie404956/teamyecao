<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.header {
	border-bottom-style: solid;
}

.title {
	text-align: center;
	font-size: 20px;
}

.body {
	
}

.footer {
	
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
}

li {
	margin: 1px;
	float: right;
}

.body a:link,a:visited {
	display: block;
	width: 120px;
	font-weight: bold;
	color: #FFFFFF;
	background-color: #bebebe;
	text-align: center;
	padding: 4px;
	text-decoration: none;
	text-transform: uppercase;
}

.body a:hover,a:active {
	background-color: #cc0000;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<p class="title">YeCao</p>
	</div>
	<div class="body">
		<ul>
			<li><a href="#home">发布</a></li>
			<li><a href="#news">编辑</a></li>


		</ul>
		<form>
		<p class="title">标题：<input type="text" name="title"/></p>
		<p class="title">内容：<input type="text" name="content"/></p>
		<p class="title">图片：<input type="file" name="pic"/></p>
		</form>
	</div>
	<div class="footer"></div>
</body>
</html>