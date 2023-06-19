package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL 드라이버 로드
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "system";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url,db_id,db_pw);
			System.out.println("DB 연결 완료");			
		} catch (ClassNotFoundException e){
			System.out.println("JDBC 드라이버 로드 오류");
		} catch(SQLException e){
			System.out.println("DB 연결 오류");
		}
			
		
		
		
	}

}
