package p04;

import java.util.Random;

public class MethodTest2 {

	public static int getRandomNum(int max) {
		Random r=new Random();
		return r.nextInt(max)+1; 

		//int rNum=r.nextInt(45);
		//rNum += 1;
		//return rNum;
	}
	public static void main(String[] args) {
		java.lang.System.out.println(getRandomNum(50));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
	}

}
