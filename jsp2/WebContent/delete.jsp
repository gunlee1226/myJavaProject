<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import=" jsp2.GuestRoomDAO"%>
<%@ page import=" jsp2.GuestRoomVO"%>

<%
	request.setCharacterEncoding("UTF-8");

String no = request.getParameter("no");

GuestRoomDAO dao = new GuestRoomDAO();

dao.delete(no);
response.sendRedirect("list.jsp");
%>