package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc_test3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		학번 이름 학과를 입력 받아서
//		insert 및 select로 출력
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
			
			while(true){
				System.out.println("(1) 입력, (2) 출력, (3)삭제, (4) 종료");
				int num = s.nextInt();
				if(num == 1){
					System.out.print("학번 입력 : ");
					String stu_no = s.next();
					System.out.print("이름 입력 : ");
					String stu_name = s.next();
					System.out.print("학과 입력 : ");
					String stu_dept = s.next();
					stmt.executeUpdate("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
					printTable(stmt, stu_name);
				} else if(num == 2){
					System.out.println("검색할 이름을 입력해주세요.");
					printTable(stmt, s.next());
				} else if(num == 3){
					System.out.println("삭제할 이름을 입력해주세요.");
					stmt.executeQuery("delete from student where stu_name = '" + s.next() + "'");
				} else {
					System.out.println("종료되었습니다.");
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}

	}
	
	
	

	private static void printTable(Statement stmt, String stu_name) throws SQLException {
		ResultSet srs =  stmt.executeQuery("select * from student where stu_name = '" + stu_name + "'");
		if(srs.next()){
			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" +  srs.getString("stu_dept"));
		} else {
			System.out.println("데이터 없음");
		}
	}

}
