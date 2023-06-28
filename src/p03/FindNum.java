package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {

		// for -> 시작과 끝이 명확할 때
		// while -> 시작과 끝이 명확하지 않을 때
		// do while -> 조건이 안맞아도 무조건 한번은 실행

		Scanner sc = new Scanner(System.in);
		boolean correct = false; // 일단 false로 초기화

		Random r = new Random();
		int rNum = r.nextInt(10) + 1;// 1-10
		int count = 0;

		/*
		 * while(correct) { System.out.println("맞췄다!"); correct=false; } //맞췄다 한번 출력 후
		 * correct= false로 바뀌므로 그 후 실행 x
		 * 
		 */
		while (!correct) {
			System.out.println("1~10까지의 숫자를 입력하세요: ");
			int inputNum = Integer.parseInt(sc.nextLine());

			// =if(inputNum==rNum) {
			// count++;
			// }
			correct = rNum == inputNum;
			count++;
		}
		System.out.println(count + "번만에 맞췄다");

	}

}
