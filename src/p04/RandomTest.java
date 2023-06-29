package p04;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static String getRock() {
		Random r = new Random();
		int rNum = r.nextInt(3);
		if (rNum == 0) {
			return "가위";
		}
		if (rNum == 1) {
			return "바위";
		}
		if (rNum == 2) {
			return "보";
		}
		return "";
		// 자바가 보기엔 0,1,2 외의 경우도 있기 때문에 그 외의 경우를 생각해서 빈 문자열을 return 해야 한다.
	}

	public static void main(String[] args) {
		String rock = getRock();
		Scanner sc = new Scanner(System.in);
		System.out.print("가위,바위,보: ");
		String urRock = sc.nextLine();

		if (rock.equals("가위") && (urRock.equals("보")) || rock.equals("바위") && urRock.equals("가위")
				|| rock.equals("보") && urRock.equals("바위")) {
			System.out.println("컴퓨터:" + rock + ", 나:" + urRock);
			System.out.println("졌습니다.");
		} else if (rock.equals("바위") && (urRock.equals("보")) || rock.equals("보") && urRock.equals("가위")
				|| rock.equals("가위") && urRock.equals("바위")) {
			System.out.println("컴퓨터:" + rock + " , 나:" + urRock);
			System.out.println("이겼습니다.");
		} else {
			System.out.println("컴퓨터:" + rock + " , 나:" + urRock);
			System.out.println("비겼습니다.");
		}
	}

}
