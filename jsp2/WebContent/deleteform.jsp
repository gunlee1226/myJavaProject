<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>방명록</title>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type='hidden' name="id" value="">
	<table>
		<form action="delete.jsp" method="post">
		<tr>
			<td> 비밀번호 입력 </td>
			<td><input type="password" name="no"></td>
			<td>
			<input type="submit" value="삭제" name = "no">
			</td>
				
			<td><a href="list.jsp">목록으로 이동하기</a></td>
				</form>
		</tr>
	</table>

</body>
</html>
			
			
			
			
			
			
			