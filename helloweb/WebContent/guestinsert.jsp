<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import=" helloJSP.myservlets.GuestBookDAO"%>
<%@ page import=" helloJSP.myservlets.GuestBookVO"%>

<% 
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("in");
	String password = request.getParameter("ip");
	String content = request.getParameter("ic");
	
	GuestBookVO vo = new GuestBookVO(name, password, content);
	
	GuestBookDAO dao = new GuestBookDAO();
	dao.guestinsert(vo);

	response.sendRedirect("guestbooklist.jsp");
	
%>
