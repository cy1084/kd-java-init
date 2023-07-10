package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;

public class UserInfoRepository {

	/*
	 * 디비 접속하기 위해서는 -> 디비 주소 커넥터 드라이버(jdbc 드라이버) 아이디, 비밀번호
	 */

	public List<Map<String, String>> getUserInfoList(Map<String, String> param) {
		List<Map<String, String>> userInfoList = new ArrayList<>();
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM USER_INFO";

			if (param != null) { // 검색어 입력 -> 쿼리문 바껴야 됨
				if (param.get("uiName") != null) {
					sql += " WHERE UI_NAME LIKE '%" + param.get("uiName") + "%'";
				}
			}
			// statement로 해당 쿼리 실행 -> executeUpdate(INSERT, DELETE, UPDATE),
			// executeQuery(SELECT)
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) { // 데이터가 있는 그 곳까지 내려!
				Map<String, String> userInfo = new HashMap<>();
				userInfo.put("uiNum", rs.getString("UI_NUM"));
				userInfo.put("uiId", rs.getString("UI_ID"));
				userInfo.put("uiPwd", rs.getString("UI_PWD"));
				userInfo.put("uiName", rs.getString("UI_NAME"));
				userInfoList.add(userInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfoList;
	}

	public int insertUserInfo(Map<String, String> userInfo) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO USER_INFO(UI_ID, UI_PWD, UI_NAME)";
			sql += " VALUES('" + userInfo.get("uiId") + "','" + userInfo.get("uiPwd") + "',";
			sql += " '" + userInfo.get("uiName") + "')"; // 가독성을 위해 두 줄
			return stmt.executeUpdate(sql); // 반영된 행 개수 반환

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteUserInfo(Map<String, String> userInfo) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM USER_INFO WHERE UI_NUM=" + userInfo.get("uiNum");
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
