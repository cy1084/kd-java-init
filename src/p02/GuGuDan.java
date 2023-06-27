package p02;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("1~9까지 숫자 입력: ");
		
		String numStr=sc.nextLine(); //엔터 치면 저장, 형 변환 연습 위해 nextLine으로 
		System.out.println("니가 입력한 숫자: "+numStr);
		
		/*
		 *2x1=2
		 *2x2=4
		 *...
		 *2x9=18 
		*/
		int num=Integer.parseInt(numStr);
		for(int i=1;i<10;i++) {
			
			System.out.println((numStr+"")+"x"+i+"="+num*i);
		}

	}

}
