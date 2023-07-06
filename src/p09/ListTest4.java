package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest4 {
	public static void main(String[] args) {
		List<Integer> numList=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 3개를 ,를 기준으로 입력: ");
		String numStr=sc.nextLine();
		
		String[] strs=numStr.split(",");
		
		for(int i=0;i<strs.length;i++) {
			int num=Integer.parseInt(strs[i]);
			numList.add(num);			
		}
				
		for(int i=0;i<numList.size();i++) {
			System.out.println(numList.get(i));
		}
		
		/*
		 * numStr을 ,를 기준으로 배열을 만든 후 numList에 맞는 게 몇 개 있는지 출력 -> 중복되는 숫자를 찾는 것과 같음
		 */
		
		System.out.print("숫자 3개를 ,를 기준으로 입력: ");
		numStr=sc.nextLine();
		
		strs=numStr.split(",");
		
		int cnt=0;
		for(int i=0;i<strs.length;i++) {
			int num=Integer.parseInt(strs[i]);
			for(int j=0;j<numList.size();j++) {
				if(num==numList.get(j)) {
							cnt++;	
				//위와 같음
				//if(numList.indexOf(num) != -1){
				//			cnt++;
				//}
			}
		}
			
	}
		System.out.println("맞춘 개수: "+cnt);
		

	}

}
