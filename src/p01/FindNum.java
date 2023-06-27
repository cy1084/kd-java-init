package p01;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int rNum = r.nextInt(3)+1;
		Scanner sc=new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			String str=sc.nextLine();
			int num=Integer.parseInt(str);
			
			if(rNum==num) {
				System.out.println("맞춤");
			}else {
				System.out.println("틀림");
			}
			
		}
	}

}
