package p02;

import java.util.Scanner;

public class GuGuDan2 {

	public static void main(String[] args) {
		/* input:4
		 * 1x4=4
		 * 2x4=4
		 * ...
		 * 9x4=36
		 * */
		Scanner sc= new Scanner(System.in);
		System.out.print("1~9까지 숫자 입력: ");
		
		String numStr=sc.nextLine();
		System.out.println("숫자 입력: "+numStr);
		
		int num=Integer.parseInt(numStr);
		
		for(int i=1;i<10;i++) {
			System.out.println(i+"x"+(numStr+"")+"="+num*i);
		}
	}

}
