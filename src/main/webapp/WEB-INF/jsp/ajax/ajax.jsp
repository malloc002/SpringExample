<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax 테스트</title>

<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>

</head>
<body>
	<h1>Ajax 테스트</h1>
	
	<div id="text">
	
	</div>
	
	<script>
		$(document).ready(function(){
			$.ajax({
				type:"get"
				, url:"/ajax/request"
				//, data:{}
				, success:function(data){
					//console.log(data.name);
					$("#text").text(data.name + " " + data.age);
				}
				, error:function(){
					alert("요청 에러!!");
				}
			});
		});
	</script>
</body>
</html>