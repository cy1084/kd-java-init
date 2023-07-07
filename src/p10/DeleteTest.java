package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd", "root", "kd1824java");
			String sql="DELETE FROM USER_INFO WHERE UI_NUM=4";
			Statement stmt=con.createStatement();
			int resultCnt=stmt.executeUpdate(sql);
			System.out.println("반영된 행 갯수: "+resultCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
