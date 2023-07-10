package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoController {
	public List<Map<String,String>> getUserInfoList(Map<String,String> param){ //여러가지 파라미터를 받기 위함
		UserInfoService uiService=new UserInfoService();
		return uiService.getUserInfoList(param);
		/* =
		 * public List<Map<String,String>> getUserInfoList(){
		   UserInfoService uiService=new UserInfoService();
		   return uiService.getUserInfoList();
		 * 
		 * 데이터 타입이 같으므로 return 가능
		 * */
	}
	
	public int insertUserInfo(Map<String,String> userInfo) { //변수들을 받기 위해 Map으로
		UserInfoService uiService=new UserInfoService();
		return uiService.insertUserInfo(userInfo);

	}
	public int deleteUserInfo(Map<String,String> userInfo) {
		UserInfoService uiService=new UserInfoService();
		return uiService.deleteUserInfo(userInfo);
	}

	public static void main(String[] args) {
		UserInfoController uiController=new UserInfoController();
		Map<String,String> param=new HashMap<>(); //Map은 인터페이스이므로 HashMap으로 Map 구현
		param.put("uiName","동");
		
		//List<Map<String,String>> userInfoList=uiController.getUserInfoList("동"); -> 파라미터 한 개만 받을 때
		List<Map<String,String>> userInfoList=uiController.getUserInfoList(param);
		//System.out.println("번호\t이름\t아이디\t비밀번호\t");
		
		//List<Map<String,Integer>> getUserInfoList=uiController.getUserInfoList();
		//데이터 타입이 맞지 않으므로 오류
		
		for(Map<String,String> userInfo : userInfoList) {
			//System.out.println(userInfo.get("uiNum")+"\t"+userInfo.get("uiName")+"\t"+userInfo.get("uiId")+"\t"+userInfo.get("uiPwd")+"\t");			
			//System.out.println(userInfo);
		}
	/*
		param.put("uiName","영희1");
		param.put("uiId","cssss");
		param.put("uiPwd","1111");

		int result=uiController.insertUserInfo(param);
		System.out.println("실행 결과: "+result);
	*/	
		param.put("uiNum","5");
		int result1=uiController.deleteUserInfo(param);
		System.out.println("실행 결과: "+result1);


	}

}
