package p11;

import java.util.List;
import java.util.Map;

public class UserInfoService {
	/*
	 * public List<Map<String,String>> getUserInfoList(String uiName){
		UserInfoRepository uiRepo=new UserInfoRepository();	//nonstatic이므로 사용하기 위해선 메모리 생성 필수
		List<Map<String, String>> userInfoList=uiRepo.getUserInfoList();
		return userInfoList;
	*/
		
		  public List<Map<String,String>> getUserInfoList(Map<String,String> param){
		   UserInfoRepository uiRepo=new UserInfoRepository();	
		   return uiRepo.getUserInfoList(param);
		  }
		  
		  public int insertUserInfo(Map<String,String> userInfo) { 
			  UserInfoRepository uiRepo=new UserInfoRepository();	//nonstatic이므로 메모리 생성
			  return uiRepo.insertUserInfo(userInfo);

		  }
		  public int deleteUserInfo(Map<String,String> userInfo) {
			  UserInfoRepository uiRepo=new UserInfoRepository();
			  return uiRepo.deleteUserInfo(userInfo);
		  }

	

}
