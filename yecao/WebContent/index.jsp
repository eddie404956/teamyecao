<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<script src="js/jquery-1.11.2.min.js"></script>

<script src="js/jquery.masonry.min.js"></script>
<style type="text/css">
.container-fluid {
	padding: 20px;
}

.box {
	margin-bottom: 20px;
	float: left;
	width: 500px;
}

.box img {
	max-width: 100%
}
</style>
<script type="text/javascript">
$(function(){
	
	    var $container = $('#masonry');
	
	    $container.imagesLoaded( function(){
	
	        $container.masonry({
	
	            itemSelector : '.box',
	
	            gutterWidth : 20,
	
	            isAnimated: true
	
	        });
	
	    });
	
	});

	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="masonry" class="container-fluid">

		<div class="box">
			<img src="images/1.jpg">
		</div>

		<div class="box">
			<img src="images/2.jpg">
		</div>

		<div class="box">
			<img src="images/3.jpg">
		</div>

		<div class="box">
			<img src="images/4.jpg">
		</div>

		<div class="box">
			<img src="images/5.jpg">
		</div>

	</div>

</body>
</html>