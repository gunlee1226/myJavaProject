package helloJSP.myservlets;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GuestBookDAO {

	public int guestinsert(GuestBookVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0 ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(url, "gunlee", "0000");
			
			String query ="insert into emaillist values (seq_guest_no.nextval, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);	
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getContent());
			
		
			count = pstmt.executeUpdate();
			
			System.out.println(count + "건 등록");
			
		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}
		return count;
	}
	
	public void guestdelete(String no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0 ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(url, "gunlee", "0000");
			
			String query ="delete guestbook where no = ?";
			pstmt = conn.prepareStatement(query);	
			
			pstmt.setInt(1, Integer.parseInt(no));

			count = pstmt.executeUpdate();
			
			System.out.println(count + "건 삭제");
			
		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}
	
	}
	
	
	public List<GuestBookVO> getList() {

		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<GuestBookVO> list = new ArrayList<GuestBookVO>();

		try {
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(url, "gunlee", "0000");
			
			// 3. SQL문 준비 / 바인딩 / 실행
			String query = "select no,name, password, content, reg_date from guestbook order by no desc" ;
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			// 4.결과처리
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String content = rs.getString("content");
				
				
				GuestBookVO vo = new GuestBookVO(no, name, password, content);
				list.add(vo);
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			// 5. 자원정리
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}

		}

		return list;
	}

}
