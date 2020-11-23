<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메일 리스트 가입</h1>
	<p>
		메일 리스트에 가입하려면,<br> 아래 항목을 기입하고 submit 버튼을 클릭하세요.
	</p>
	<form action="guestinsert.jsp" method="post">
		name(이름): <input type="text" name="in" value=""><br>
		password(비밀번호): <input type="text" name="ip" value=""><br>
		contents(내용): <input type="text" name="ic" value=""><br>
		<input type="submit" value="등록">
	</form>
	
	
	<br>
	
		<form action="guestdelete.jsp" method="post">
		회원번호: <input type="text" name="no" value=""><br>
				<input type="submit" value="삭제">
	</form>
	<p>
		<a href="guestbooklist.jsp">리스트 바로가기</a>
	</p>
</body>
</html>