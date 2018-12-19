<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-1.9.0.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	成功了！
</body>
<script type="text/javascript">
//获取要显示的所有属性
var shopcarts;
	$.ajax({
		url:"http://localhost:8080/SSM/getData.do",
		type:"get",
		dataType:"json",
		data:{
			name:"zhangsan"
		},
		async:false,
		success:function(data){
			shopcarts=data;
		}
	});
console.log(shopcarts);
</script>
</html>