<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>

<%!Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "gunlee";
	String pass = "0000";

	String sql = "select author_id, author_name, author_desc from author";%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="800" border="1">
		<tr>
			<th>저자번</th>
			<th>저자</th>
			<th>설명</th>
		</tr>
		<%
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				out.print("<tr>");
				out.print("<td>" + rs.getInt("author_id") + "</td>");
				out.print("<td>" + rs.getString("author_name") + "</td>");
				out.print("<td>" + rs.getString("author_desc") + "</td>");
				out.print("</tr>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
			rs.close();
				if (pstmt != null)
			pstmt.close();
				if (conn != null)
			conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		%>
	</table>
	

</body>
</html>