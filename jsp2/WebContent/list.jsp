<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page import=" jsp2.GuestRoomDAO"%>
<%@ page import=" jsp2.GuestRoomVO"%>
<%@ page import="java.util.List"%>

<%
	request.setCharacterEncoding("UTF-8");


	GuestRoomDAO dao = new GuestRoomDAO();
	List<GuestRoomVO> list = dao.getList();
	System.out.println(list.toString());
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>

	
	<form action="add.jsp" method="post">
	<table border=1 width=500>
		<tr>
			<td>이름</td><td><input type="text" name="in"></td>
			<td>비밀번호</td><td><input type="password" name="ip"></td>
		</tr>
		<tr>
			<td colspan=4><textarea name="ic" cols=60 rows=5></textarea></td>
		</tr>
		<tr>
			<td colspan=4 align=right><input type="submit" VALUE=" 확인 " name = "add"></td>
		</tr>
	</table>
	</form>
	<br/>

	
		<% 
		for(GuestRoomVO vo : list) {
	%>
	<table width=510 border=1>
		<tr>
			<td>작성자: <%=vo.getName() %> </td>
			<td> [<%=vo.getNo() %>] </td>
			<td> <%=vo.getReg_date() %> </td>
			</tr>
			
			<tr>
			<td><textarea cols=60 rows=5> <%=vo.getContent() %></textarea>
			
			<td><a href="deleteform.jsp">삭제</a></td>
			
		</tr>
        <br/>
	</table>
	<%		
		}
	%>

</body>
</html>