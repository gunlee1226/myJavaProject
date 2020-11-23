<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import=" helloJSP.myservlets.GuestBookDAO"%>
<%@ page import=" helloJSP.myservlets.GuestBookVO"%>

<% 
	request.setCharacterEncoding("UTF-8");
	String no = request.getParameter("no");
	
	
	out.println(no);
	
	GuestBookVO vo = new GuestBookVO();
	GuestBookDAO dao = new GuestBookDAO();
	dao.guestdelete(no);

	response.sendRedirect("guestbooklist.jsp");
%>

