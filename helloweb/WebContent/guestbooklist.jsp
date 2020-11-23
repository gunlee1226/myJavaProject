<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import=" helloJSP.myservlets.GuestBookDAO"%>
<%@ page import=" helloJSP.myservlets.GuestBookVO"%>
<%@ page import="java.util.List"%>

<%
	GuestBookDAO dao = new GuestBookDAO();
	List<GuestBookVO> list = dao.getList();
	System.out.println(list.toString());
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메일 리스트에 가입되었습니다.</h1>
	<p>입력한 정보 내역입니다.</p>
	<!-- 메일정보 리스트 -->
	<%-- list에서 하나씩 빼서 테이블를 채운다--%>
	<%
		for (GuestBookVO vo : list) {
	%>
	<table border="1" cellpadding="5" cellspacing="2">
		<tr>
			<td align=right width="110">No:</td>
			<td width="170"><%=vo.getNo()%></td>
		</tr>
		<tr>
			<td align=right">Name:</td>
			<td><%=vo.getName()%></td>
		</tr>
		
		<tr>
			<td align=right">pass</td>
			<td><%=vo.getPassword()%></td>
		</tr>
		
		<tr>
			<td align=right">getContent</td>
			<td><%=vo.getContent()%></td>
		</tr>

	</table>
	<br>
	<%
		}
	%>
	<p>
		<a href="guestform.jsp?no">추가메일 등록</a>
	</p>
	<p>
		<a href="guestform.jsp?no">기존 가입된 메일 삭제</a>
	</p>
	<br>
</body>
</html>