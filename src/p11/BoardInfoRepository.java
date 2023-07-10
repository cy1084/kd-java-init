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

public class BoardInfoRepository {
	public List<Map<String,String>> getBoardInfoList(Map<String,String> param){
		List<Map<String,String>> boardInfoList=new ArrayList<>();
		Connection con=DBCon.getCon();
		try {
			Statement stmt=con.createStatement();
			String sql="SELECT * FROM BOARD_INFO";
			
			if(param != null) {
				if(param.get("biTitle") != null) {
					sql +=" WHERE BI_TITLE LIKE '%" + param.get("biTitle")+"%'";
				}
			}
			ResultSet rs=stmt.executeQuery(sql); //실행, 데이터 타입 -> ResultSet
			while(rs.next()) {
				Map<String,String> boardInfo=new HashMap<>();
				boardInfo.put("biNum",rs.getString("BI_NUM"));
				boardInfo.put("biTitle",rs.getString("BI_TITLE"));
				boardInfo.put("biContent",rs.getString("BI_CONTENT"));
				boardInfo.put("biWriter",rs.getString("BI_WRITER"));
				boardInfo.put("biCredat",rs.getString("BI_CREDAT"));
				boardInfo.put("biCnt",rs.getString("BI_CNT"));
				boardInfoList.add(boardInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boardInfoList;
	}
	
	public int insertBoardInfo(Map<String,String> boardInfo) {
		Connection con=DBCon.getCon();
		try {
			Statement stmt=con.createStatement();
			String sql="INSERT INTO BOARD_INFO(BI_TITLE, BI_CONTENT, BI_WRITER, BI_CREDAT, BI_CNT)";
			sql += " VALUE('"+boardInfo.get("biTitle")+"','"+boardInfo.get("biContent")+"','"+boardInfo.get("biWriter")+"','"+boardInfo.get("biCredat")+"','"+boardInfo.get("biCnt")+"',";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteBoardInfo(Map<String,String> boardInfo) {
		Connection con=DBCon.getCon();
		try {
			Statement stmt=con.createStatement();
			String sql="DELETE FROM BOARD_INFO WHERE BI_NUM="+boardInfo.get("biNum");
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateBoardInfo(Map<String,String> boardInfo) {
		Connection con=DBCon.getCon();
		try {
			Statement stmt=con.createStatement();
			String sql="UPDATE BOARD_INFO SET";
			if(boardInfo.get("biTitle") != null) {
				sql += " BI_TITLE='" + boardInfo.get("biTitle")+"',";
			}
			if(boardInfo.get("biContent") != null) {
				sql += " BI_CONTENT='" + boardInfo.get("biContent")+"',";
			}
			if(boardInfo.get("biWriter") != null) {
				sql += " BI_WRITER='" + boardInfo.get("biWriter")+"',";
			}
			if(boardInfo.get("biCnt") != null) {
				sql += " BI_CNT='" + boardInfo.get("biCnt")+"',";
			}
			//기본키인 biNum과 현재 시간이 자동으로 생성되는 biCredat는 건드리면 안됨	
			
			sql= sql.substring(0,sql.length()-1); 
			//update 문의 마지막 줄엔 쉼표가 안 나오도록
			sql += " WHERE BI_NUM="+boardInfo.get("biNum");	//where 조건문은 if문의 대상이 아님
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		BoardInfoRepository biRepo=new BoardInfoRepository();
		Map<String,String> param=new HashMap<>();
		List<Map<String,String>> boardInfoList=biRepo.getBoardInfoList(param);
		for(Map<String,String> boardInfo : boardInfoList) {
			//System.out.println(boardInfo);
			System.out.println("번호\t제목\t\t내용\t글쓴이\t글쓴 시간\t\t\t조회수\t");
			System.out.println(boardInfo.get("biNum")+"\t"+boardInfo.get("biTitle")+"\t"+boardInfo.get("biContent")+"\t"+boardInfo.get("biWriter")+"\t"+boardInfo.get("biCredat")+"\t"+boardInfo.get("biCnt")+"\t");			
		}
		
		//insert 다시!!!
		Map<String,String> boardInfo=new HashMap<>();
		boardInfo.put("biTitle","안녕1");
		boardInfo.put("biContent","안녕하세요.");
		boardInfo.put("biWriter","황채영");
		boardInfo.put("biCredat","NOW()");
		boardInfo.put("biCnt","2");
		int result=biRepo.insertBoardInfo(boardInfo);
		System.out.println("실행 결과: "+result);
		
		/*
		Map<String,String> boardInfo=new HashMap<>();
		boardInfo.put("biNum","1");
		boardInfo.put("biCnt","1");
		int result=biRepo.updateBoardInfo(boardInfo);
		System.out.println("실행 결과: "+result);
		*/
	}

}
