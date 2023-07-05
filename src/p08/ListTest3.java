package p08;

import java.util.ArrayList;
/*
 * Collection Framework
 * List, Map, Set -> 인터페이스
 */
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>(); 
		List<String> strList2 = new ArrayList<>();	//1.7 버전 이상부터 String 생략 가능
													//ArrayList도 List 라고 부를 수 있기 때문에 이렇게도 가능
		strList2.add("안녕");
		System.out.println(strList2.get(0));
		strList2.remove(0);
		//System.out.println(strList2.get(0)); //없는 배열의 원소를 가져오라고 하기 때문에 에러
		
		
	}

}
