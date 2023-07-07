package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static final String DRIVER_CLASS = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://localhost:3306/kd";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "kd1824java";

	
	static {	// 즉시 실행 영역 -> main 메소드에 아무 것도 안 써져 있어도 main 메소드만 실행하면 실행 됨. = new DBCon();
		try {
			Class.forName(DRIVER_CLASS);
			//System.out.println("내가 나오면 드라이버 잘 찾은거임.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon(){ //데이터 타입 Connection
		try {
			Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; //try catch 문이 실행되지 않을 때의 반환 값
	}

	public static void main(String[] args) {
		//new DBCon();
	}

}
