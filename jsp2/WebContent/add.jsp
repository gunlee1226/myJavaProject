<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import=" jsp2.GuestRoomDAO"%>
<%@ page import=" jsp2.GuestRoomVO"%>

<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("in");
	String password = request.getParameter("ip");
	String content = request.getParameter("ic");

		
	GuestRoomVO vo = new GuestRoomVO(name, password, content);

	GuestRoomDAO dao = new GuestRoomDAO();
	dao.insert(vo);

	response.sendRedirect("list.jsp");
%>