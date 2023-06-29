package p04;

import java.util.Random;
import java.util.Scanner;

/*
 * rNum과 numStr이 같은 값이라면 맞췄다 출력 
 * rNum이 numStr의 값보다 더 크다면 Up 
 * rNum이 numStr의 값보다 더 작다면 Down
 */

public class UpAndDown {

	public static int getRandomNum() {
		Random r = new Random();
		return r.nextInt(50) + 1;// 1-50
	}

	public static boolean match(int num1, int num2) {
		if (num1 == num2) {
			return true;
		}
		if (num1 > num2) {
			System.out.println("Up!");
		} else if (num1 < num2) {
			System.out.println("Down!");
		}
		return false;
	}

	public static void main(String[] args) {

		int rNum = getRandomNum();

		// boolean correct = false;
		Scanner sc = new Scanner(System.in);

		/*
		 * while (!correct) { 
		 * 	System.out.println("1-50 입력: "); 
		 * 	String numStr =sc.nextLine(); 
		 * 	int inputNum = Integer.parseInt(numStr);
		 * 
		 * 	if (rNum == inputNum) { 
		 * 		System.out.println("맞췄다!"); 
		 * 		break;
		 * 	}else if (rNum > inputNum) { 
		 * 		System.out.println("Up!"); 
		 * 	} else
		 * 		System.out.println("Down!"); 
		 * 	}
		 */

		int num = 0;
		while (!match(rNum, num)) {
			System.out.println("1-50 입력: ");
			String numStr = sc.nextLine();
			num = Integer.parseInt(numStr);
		}
		System.out.println("맞췄다!");

	}

}
