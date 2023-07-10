package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassInfoController {
	public List<Map<String,String>> getClassInfoList(Map<String,String> param){
		ClassInfoService ciService=new ClassInfoService();
		return ciService.getClassInfoList(param);
	}
	
	public int insertClassInfo(Map<String,String> classInfo) {
		ClassInfoService ciService=new ClassInfoService();
		return ciService.insertClassInfo(classInfo);
	}
	
	public int deleteClassInfo(Map<String,String> classInfo) {
		ClassInfoService ciService=new ClassInfoService();
		return ciService.deleteClassInfo(classInfo);
	}
	
	public static void main(String[] args) {
		ClassInfoController ciController=new ClassInfoController();
		Map<String,String> param=new HashMap<>();

		
		List<Map<String,String>> classInfoList=ciController.getClassInfoList(param);
		System.out.println("번호\t과목이름\t과목설명\t");
		
		for(Map<String,String> classInfo : classInfoList) {
			System.out.println(classInfo.get("ciNum")+"\t"+classInfo.get("ciName")+"\t"+classInfo.get("ciDesc")+"\t");			
		}
		
		param.put("ciNum","1");
		int result=ciController.deleteClassInfo(param);
		System.out.println(result);
	}

}
