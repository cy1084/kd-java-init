package p03;

public class ThreeSixNine {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			/*
			 * if(i%5==0) { System.out.println("5의 배수"); } else
			 * if((i==3||i==6||i==9)||(i%10==3||i%10==6||i%10==9)||(i/10==3||i/10==6||i/10==
			 * 9)){ System.out.println("짝"); } else System.out.println(i); }
			 */

			int num = i % 10; // 나머지
			int num2 = i / 10; // 몫
//복습하기!!
			if ((num != 0 && num % 3 == 0) || (num2 != 0 && num2 % 3 == 0)) {
				System.out.println("짝");
			} else
				System.out.println(i);
		}
	}

}
