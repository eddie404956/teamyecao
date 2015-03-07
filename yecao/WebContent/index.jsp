<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-1.11.2.min.js"></script>

<script src="js/jquery.masonry.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<style type="text/css">
.line {
	border-bottom: solid;
	padding: 2px;
	margin: 2px;
}

.container-fluid {
	padding: 2px;
}

.box {
	margin-bottom: 20px;
	float: left;
	width: 390px;
}

.box img {
	max-width: 100%
}
</style>
<script type="text/javascript">
	$(function() {

		var $container = $('#masonry');

		$container.imagesLoaded(function() {

			$container.masonry({

				itemSelector : '.box',

				gutterWidth : 20,

				isAnimated : true

			});

		});

	});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-5"></div>
			<div class="col-md-2 ">
				<h3 class="center-block">
					寰市集
					</h1>
			</div>

		</div>
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<div class="line"></div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<ul class="nav nav-tabs ">
					<li role="presentation" class="active"><a href="#">首页</a></li>
					<li role="presentation"><a href="#">我要买</a></li>
					<li role="presentation"><a href="#">我要卖</a></li>
					<li role="presentation"><a href="#">团购</a></li>
				</ul>
			</div>
		</div>
		<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8" style="margin-left:15px;margin-right:auto;padding-top: 200px;background:url(images/Desert.jpg);background-size:80% 240px;"></div>
		</div>
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8" >
				<div class="input-group" style="padding:1px;">
					<input type="text" class="form-control" placeholder="点击输入你想要的.."
						aria-describedby="basic-addon2"> <span
						class="input-group-addon " id="basic-addon2"><span
						class="glyphicon glyphicon-search" aria-hidden="true"></span>搜索</span>
				</div>
			</div>
			<div class="col-md-2"></div>
		</div>
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<div class="line"></div>
			</div>
		</div>
		<div id="masonry row" class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<div class="box ">
					<a href="#" class="thumbnail"> <img
						src="images/Chrysanthemum.jpg">
						<div class="caption ">菊花</div> </a>
				</div>


				<div class="box">
					<a href="#" class="thumbnail"><img src="images/Desert.jpg">
						<div class="caption">荒漠</div> </a>
				</div>

				<div class="box">
					<a href="#" class="thumbnail"><img src="images/Hydrangeas.jpg">
						<div class="caption">植物</div> </a>
				</div>

				<div class="box">
					<a href="#" class="thumbnail"><img src="images/Jellyfish.jpg">
						<div class="caption">水母</div> </a>
				</div>

				<div class="box">
					<a href="#" class="thumbnail"><img src="images/Koala.jpg">
						<div class="caption">树熊</div> </a>
				</div>
				<div class="box">
					<a href="#" class="thumbnail"><img src="images/Lighthouse.jpg">
						<div class="caption">城堡</div> </a>
				</div>
				<div class="box">
					<a href="#" class="thumbnail"><img src="images/Penguins.jpg">
						<div class="caption">企鹅</div> </a>
				</div>
				<div class="box">
					<a href="#" class="thumbnail"><img src="images/Tulips.jpg">
						<div class="caption">黄色的花</div> </a>
				</div>

			</div>
			<div class="col-md-2"></div>

		</div>
	</div>
	<div class="row">
		<div class="col-md-5"></div>
		<div class="col-md-7">
			<nav>
			<ul class="pagination">
				<li><a href="#" aria-label="Previous"> <span
						aria-hidden="true">&laquo;</span> </a></li>
				<li><a href="#">1</a>
				</li>
				<li><a href="#">2</a>
				</li>
				<li><a href="#">3</a>
				</li>
				<li><a href="#">4</a>
				</li>
				<li><a href="#">5</a>
				</li>
				<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</ul>
			</nav>
		</div>
	</div>

</body>
</html>