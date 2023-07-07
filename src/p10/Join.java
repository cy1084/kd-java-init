package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID: ");
		String uiId = sc.nextLine();
		System.out.println("PASSWORD: ");
		String uiPwd = sc.nextLine();
		System.out.println("NAME: ");
		String uiName = sc.nextLine();

		String sql = "INSERT INTO USER_INFO(UI_ID, UI_PWD, UI_NAME) ";
		sql += " VALUES('" + uiId + "' ,'" + uiPwd + "','" + uiName + "')";

		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			int resutlCnt = stmt.executeUpdate(sql);
			if (resutlCnt == 1) {

				System.out.println(uiName + "님 회원가입이 완료되었습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
