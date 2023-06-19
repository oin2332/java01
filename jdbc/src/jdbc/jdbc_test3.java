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
//		�й� �̸� �а��� �Է� �޾Ƽ�
//		insert �� select�� ���
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL ����̹� �ε�
			String db_url = "jdbc:oracle:thin:@localhost:1522:xe";
			String db_id = "system";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB ���� �Ϸ�");
			stmt = conn.createStatement();
			
			while(true){
				System.out.println("(1) �Է�, (2) ���, (3)����, (4) ����");
				int num = s.nextInt();
				if(num == 1){
					System.out.print("�й� �Է� : ");
					String stu_no = s.next();
					System.out.print("�̸� �Է� : ");
					String stu_name = s.next();
					System.out.print("�а� �Է� : ");
					String stu_dept = s.next();
					stmt.executeUpdate("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
					printTable(stmt, stu_name);
				} else if(num == 2){
					System.out.println("�˻��� �̸��� �Է����ּ���.");
					printTable(stmt, s.next());
				} else if(num == 3){
					System.out.println("������ �̸��� �Է����ּ���.");
					stmt.executeQuery("delete from student where stu_name = '" + s.next() + "'");
				} else {
					System.out.println("����Ǿ����ϴ�.");
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
		}

	}
	
	
	

	private static void printTable(Statement stmt, String stu_name) throws SQLException {
		ResultSet srs =  stmt.executeQuery("select * from student where stu_name = '" + stu_name + "'");
		if(srs.next()){
			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" +  srs.getString("stu_dept"));
		} else {
			System.out.println("������ ����");
		}
	}

}
