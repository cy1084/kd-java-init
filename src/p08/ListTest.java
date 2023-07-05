package p08;

import java.util.ArrayList;

//List -> 인터페이스!/ 크기 자유자재로
public class ListTest {

	public static void main(String[] args) {
		String str1 = "안녕, ";
		String str2 = "내 소개를";
		String str3 = " 하지.";
		String str4 = " 내 직업은";
		String str5 = " 개발자.";

		String[] strs = new String[5];

		strs[0] = str1;
		strs[1] = str2;
		strs[2] = str3;
		strs[3] = str4;
		strs[4] = str5;

		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]);
		}
		System.out.println();
		System.out.println(strs);	//배열의 주소 출력
		System.out.println();

		
		ArrayList<String> strList = new ArrayList<String>(); //String만 저장 가능한 ArrayList -> 순차적으로 입력, 출력할 때 사용
		// <>에는 기본형 데이터 타입 못 들어감-> <int> x
		// 숫자인 ArrayList 만들고 싶으면 <Integer>
		
		//add 하기 전까지는 공간만 존재
		System.out.println(strList.size());
		
		strList.add("1"); //문자+""=문자, ""+문자=문자, 문자+문자=문자
		System.out.println(strList.size());
		strList.add("가");
		strList.add("a");
		System.out.println(strList.size());
		System.out.println(strList); 	//배열의 값 출력 ->ArrayList 어딘가에 toString이 있기 때문에 값이 출력, 원래는 주소 출력
		
		
		strList.remove(0);	//0번째 제거
		System.out.println(strList.size());
		
		for(int i=0;i<strList.size();i++) { 	// ArrayList-> length가 아닌 size로!!
			System.out.println(strList.get(i)); // get으로 가져옴
		}
		
		ArrayList<Integer> intList=new ArrayList<Integer>();
		intList.add(10);
		
	}

}
