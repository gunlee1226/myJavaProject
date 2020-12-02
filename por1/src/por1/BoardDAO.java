package por1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BoardDAO {

	public int insert(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0 ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(url, "gunlee", "0000");
			
			String query ="insert into board values (B_NO_SEQ.nextval,?,sysdate,0,0,?,?,20004)";
			pstmt = conn.prepareStatement(query);	
			
			pstmt.setString(1, vo.getB_title());
			pstmt.setString(2, vo.getB_contents());
			pstmt.setString(3, vo.getB_comment());
			
		
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
	
	/*
	public void delete(String no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0 ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(url, "gunlee", "0000");
			
			String query ="delete from Board where b_no =?";
			pstmt = conn.prepareStatement(query);	
			pstmt.setString(1, no);
				

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
	
	*/
	public List<BoardVO> getList() {

		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardVO> list = new ArrayList<BoardVO>();

		try {
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(url, "gunlee", "0000");
			
			// 3. SQL문 준비 / 바인딩 / 실행
			String query = "select b_no, b_title, b_date, b_view, b_commview, b_contents, b_comment, MEM_CODE from board order by b_no asc";
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			// 4.결과처리
			while(rs.next()) {
				int b_no = rs.getInt("b_no");
				String b_title = rs.getString("b_title");
				String b_date = rs.getString("b_date");
				int b_view = rs.getInt("b_view");
				int b_commview = rs.getInt("b_commview");
				String b_contents = rs.getString("b_contents");
				String b_comment = rs.getString("b_comment");
		
						
				BoardVO vo = new BoardVO(b_no, "b_title", "b_date", b_view, b_commview, "b_contents", "b_comment");
				
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
