package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL 드라이버 로드
			String db_url = "jdbc:oracle:thin:@localhost:1522:xe";
			String db_id = "system";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();
			
			stmt.executeUpdate("insert into student(stu_no,stu_name,stu_dept) values('12345678','유재석','기계')");
			printTable(stmt);
			stmt.executeUpdate("update student set stu_dept ='컴퓨터정보' where stu_name='유재석'");
			printTable(stmt);
			stmt.executeUpdate("delete from stud"
					+ "ent where stu_name ='유재석'");
			printTable(stmt);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}

	}
	
	
	

	private static void printTable(Statement stmt) throws SQLException {
		ResultSet srs = stmt.executeQuery("select * from student where stu_name ='유재석'");
		while (srs.next()) {
			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" + srs.getString("stu_dept"));
		}
	}

}
