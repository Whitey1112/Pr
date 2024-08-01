package com.pr.pr01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {
	
	//필드
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/work_db";
	private String id = "admin";
	private String pw = "admin";
	
	//db 연결 메소드
	private void getConnection() {
		try {
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName(driver);

			// 2. Connection 얻어오기
			conn = DriverManager.getConnection(url, id, pw);

		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);

		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
	}
	// 자원정리 메소드
		private void close() {
			// 5. 자원정리
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
		
		public int insertUserVo(String empid, String name, String daprtment_name, String loginId, String loginpw, String email, String address, String hp, String hire_date) {
			int count = -1;
			this.getConnection();

			try {

				// 3. SQL문 준비 / 바인딩 / 실행
				// *sql문 준비
				String query = "";
				query += " insert into employees ";
				query += " values(null,?, ?, ?, ?, ?, ?, ?, ?) ";

				// *바인딩
				pstmt = conn.prepareStatement(query);
				
		
				pstmt.setString(1, name);
				pstmt.setString(2, daprtment_name);
				pstmt.setString(3, loginId);
				pstmt.setString(4, loginpw);
				pstmt.setString(5, email);
				pstmt.setString(6, address);
				pstmt.setString(7, hp);
				pstmt.setString(8, hire_date);
				

				// *실행
				count = pstmt.executeUpdate();

				// 4.결과처리
				System.out.println(count + "건 등록되었습니다.");

			} catch (SQLException e) {
				System.out.println("error:" + e);
			}

			this.close();

			return count;
		}
}
