package p03;

import java.util.Scanner;

public class Lotto4 {

	public static void main(String[] args) {
		//사용자에게 1~45까지의 6개의 숫자를 입력받음 
		//숫자들은 lottoStr에 등어가고 ,를 기준으로 split 
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("1부터 45까지의 숫자 6개를 입력하세요: ");
		String lottoStr=scanner.nextLine();
		String[] strs=lottoStr.split(",");
		
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}

	}

}

