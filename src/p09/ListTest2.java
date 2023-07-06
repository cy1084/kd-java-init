package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		
		/*
		 * numList의 size가 20이 될때까지 랜덤값을 1-100까지 추가
		 * 중복 안됨
		 * 반복문 사용
		 * 숫자에 3,6,9가 있을 경우 짝 출력
		 */
		
		List<Integer> numList = new ArrayList<>();
		Random r=new Random();
		
		while(numList.size()<20) {	//중복 제거도 가능
			int rNum = r.nextInt(100) + 1;
			if (numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}
		}
		System.out.println(numList);

	//이걸로 다시해보기!!! 
	//선생님껀 사진
		for(int i=1;i<numList.size();i++) {
			
			int num=numList.get(i)%10; //나머지, 1의 자리
			int num2=numList.get(i)/10; //몫, 10의 자리
			int cnt=0;
			
			if (num != 0 && num % 3 == 0) {
				System.out.println(num+": 짝");
				cnt++;
			}
			if (num2 != 0 && num2 % 3 == 0) {
				System.out.println(num2+": 짝");
				cnt++;
			}
			if(cnt==2) {
				System.out.println("짝짝");
			}else if(cnt==1) {
				System.out.println("짝");
			}else {
				System.out.println(numList.get(i));
			}
		}
		
		//toString으로도 활용 가능
		//위엔 사진에 나와있는 코드
		for(int i=1;i<numList.size();i++) {
			String numStr=numList.get(i).toString();
			numStr=numStr.replace("3","짝"); //numStr이 가지고 있는 원래 값은 바뀌지 않음 -> 짝으로 바뀐 결과 값을 다시 numStr에. 
			numStr=numStr.replace("6","짝"); //
			numStr=numStr.replace("9","짝");
			System.out.println(numList.get(i)+" : "+numStr);
		}
		
		
	
	
}
}
