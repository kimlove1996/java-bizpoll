<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<style type="text/css">
 body input, span{
 	display: block;
}
#a{
	display: none;
}
#b{
	display: none;
}
#c{
	display: none;
}

</style>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">

// $(document).ready(function(){
/*	var id = $("#id").val();
	var pw = $("#pw").val();
	
	if(id != ${bDto.id}){
		$("#a").css("display","block")
	}
	if(id != ${bDto.pw}){
		$("#b").css("display","block")
	}
}); */







</script>
</head>
<body>
	<form action="PrintMEM" method="POST" name="frm1">
		아이디 : <input id="id" name="id">
		패스워드 : <input id="pw" name="pw">
		<input type="submit" value="로그인" id="d">
		<span id="a">아이디가 일치하지 않습니다.</span>		
		<span id="b">패스워드가 일치하지 않습니다.</span>		
		<span id="c">김성위님 반갑습니다.</span>
		
		<input style="display: none;" value="kim가을" name="name">		
		<input style="display: none;" value="" name="nick">		
		<input style="display: none;" value="오치2동주공아파트" name="addr">		
		<input style="display: none;" value="" name="email">		
		<input style="display: none;" value="" name="bitrh">		
		<input style="display: none;" value="1" name="status">		
	</form>
	
</body>
</html>