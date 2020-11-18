package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(dburl, "gunlee", "0000");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버 로드 실패!");
		}
		return conn;
	}

	public List<MemberVO> getList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 데이터 전송을 위한 리스트
		List<MemberVO> list = new ArrayList<>();

		try {
			conn = getConnection();

			String sql = "    select id,\r\n" + "    name,\r\n" + "    email,\r\n" + "    password,\r\n"
					+ "    gender\r\n" + "    from member ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				MemberVO memberVO = new MemberVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
				list.add(memberVO);
			}
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		}

		return list;
	}

}
