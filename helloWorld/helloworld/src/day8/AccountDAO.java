package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {
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

	public void depositAccount(AccountVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();

			String query = " INSERT INTO ACCOUNT(account_id,deposit, withdraw,tr_date,balance)\r\n"
					+ "select id_seq.NEXTval, ? , 0 ,SYSDATE, balance+? from account\r\n"
					+ "where account_id  = (select max(account_id) from account)";
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, vo.getDeposit());
			pstmt.setInt(2, vo.getDeposit());
			
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {

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

	}

	public void withdrawAccount(AccountVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {

			conn = getConnection();

			String query =  " INSERT INTO ACCOUNT(account_id,deposit, withdraw,tr_date,balance)\r\n"
					+ "select id_seq.NEXTval, 0 , ? ,SYSDATE, balance-? from account\r\n"
					+ "where account_id  = (select max(account_id) from account)";
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, vo.getWithdraw());
			pstmt.setInt(2, vo.getWithdraw());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {

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
	}

	
	
	public List<AccountVO> getListAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<AccountVO> AList = new ArrayList<>();

		try {
			conn = getConnection();

			String query = "select account_id, deposit, withdraw, tr_date, balance from account order by account_id desc";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				AccountVO vo = new AccountVO();
				int account_id = rs.getInt(1);
				int deposit = rs.getInt(2);
				int withdraw = rs.getInt(3);
				String tr_date = rs.getString(4);
				int balance = rs.getInt(5);
				
				vo.setAccount_id(account_id);
				vo.setDeposit(deposit);
				vo.setWithdraw(withdraw);
				vo.setTr_date(tr_date);
				vo.setBalance(balance);
				
				AList.add(vo);
			}

		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
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
		
		return AList;
	}

	public int getBalance(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int current = 0;
		
		try {
			conn = getConnection();

			String query = "select balance from account\r\n"
					+ "where account_id = (select max(account_id) from account)";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				AccountVO vo = new AccountVO();
				current = rs.getInt(1);
								
				}

		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
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
		
		return current;
	}

	public List<AccountVO> fordate(String date1) {
		
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;		
		List<AccountVO> Adate = new ArrayList<>();
		
		try {
			conn = getConnection();
		
			String query = "SELECT account_id, deposit, withdraw, to_char(tr_date ,'YYYYMMDD'),  balance \r\n"
					+ "FROM  account WHERE to_char(tr_date, 'YYYYMMDD') =?";
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, date1);
			rs = pstmt.executeQuery();
	
			
			
			
			while (rs.next()) {
				AccountVO vo = new AccountVO();
				int account_id = rs.getInt(1);
				int deposit = rs.getInt(2);
				int withdraw = rs.getInt(3);
				String tr_date = rs.getString(4);
				int balance = rs.getInt(5);
				
				vo.setAccount_id(account_id);
				vo.setDeposit(deposit);
				vo.setWithdraw(withdraw);
				vo.setTr_date(tr_date);
				vo.setBalance(balance);
				
				Adate.add(vo);
			}
			
			
			

		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
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
		
		return Adate;
	}
	
	
}
