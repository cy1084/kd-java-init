package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		List<Integer> numList=new ArrayList<>();
		
		/*
		 * numList의 size가 50이 될 때까지 값 추가(1-200 랜덤값)
		 * 중복 안됨
		 * 값이 홀수일 경우에만 추가
		*/
		
		Random r=new Random();
		while(numList.size()<50) {
			int rNum=r.nextInt(200)+1;
			if(rNum % 2 != 0 && numList.indexOf(rNum)==-1) { //&& 앞 뒤 순서도 생각!, 값을 빨리 찾을 수 있는 방법으로 
			//if(rNum % 2 == 0 && numList.indexOf(rNum)!=-1) continue;  --> 조건이 맞으면 continue(아래 코드 실행 안하고 다시 조건문)
				numList.add(rNum);
			}
		}
		System.out.println(numList);

	}

}
