package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbc_test1 {
	private static void printData(ResultSet srs, String col1, String col2,
			String col3) throws SQLException  {
		System.out.print(col1);
		System.out.print("|\t"+col2);
		System.out.println("\t\t|\t"+col3);
		while (srs.next()) {
			System.out.print(srs.getString(col1));
			System.out.print("\t|\t" + srs.getString(col2));
			System.out.println("\t|\t" + srs.getString(col3));
		}
	}

//--------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL 드라이버 로드
			String db_url = "jdbc:oracle:thin:@localhost:1522:xe";
			String db_id = "system";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url,db_id,db_pw);
			System.out.println("DB 연결 완료");	
			stmt = conn.createStatement();
			ResultSet srs = stmt.executeQuery("select*from student");
			printData(srs,"stu_name","stu_no","stu_dept");
			srs = stmt.executeQuery("select stu_name, stu_no"
					+ ", stu_dept from student where stu_name='옥한빛'");			
		} catch (ClassNotFoundException e){
			System.out.println("JDBC 드라이버 로드 오류");
		} catch(SQLException e){
			System.out.println("DB 연결 오류");
		}		
		
		
		
		
		
	}
	

}
