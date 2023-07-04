package p06;

import java.util.Random;
import java.util.Scanner;

//숫자 야구 게임
public class BaseBall {

	public static void main(String[] args) {
		int[] nums = new int[3];
		Random r = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(10);
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		System.out.println("");

		// nums=new int[] {5,0,1};
		int strike = 0;
		int ball = 0;

		Scanner sc = new Scanner(System.in);
		
//while문 다시
		
			System.out.println("니가 생각하는 숫자를 ,를 기준으로 3개만 말해봐: ");
		while (strike != 3) {
			String numStr = sc.nextLine();
			String[] numStrs = numStr.split(",");

			int[] compNums = new int[numStrs.length];
			for (int i = 0; i < numStrs.length; i++) {
				compNums[i] = Integer.parseInt(numStrs[i]); // int 배열로
			}

			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < compNums.length; j++) { // 3개를 입력하지 않은 사람들은 걸러내야 하기 때문에 compNums의 길이만큼 돌림
					if ((nums[i] == compNums[j]) && (i == j)) {
						strike++;
					} else if ((nums[i] == compNums[j]) && (i != j)) {
						ball++;
					}
					break;
				}
			}

			System.out.println(strike + " strike, " + ball + " ball.");
			if (strike == 3) {
				System.out.println("정답입니다.");
				break;
			}
			
		}

	}

}
