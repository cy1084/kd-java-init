package p03;
//쪽지시험 여기서 최소 3문제 
import java.util.Random;
import java.util.Scanner;

public class Lotto5 {

	// 6개의 난수
	// ,를 기준으로 나눠 몇개 맞았는지 출력
	public static void main(String[] args) {
		Random r = new Random();
		int[] lotto = new int[6];
		int[] lotto2 = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
		}

		System.out.println("1부터 45까지의 숫자 6개 입력: ");
		Scanner scanner = new Scanner(System.in);

		String lottoStr = scanner.nextLine();
		String[] strs = lottoStr.split(",");

		for (int i = 0; i < lotto.length; i++) {
			lotto2[i] = Integer.parseInt(strs[i]);
			//
			
		}

		int count = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto2.length; j++) {
				if (lotto[j] == lotto2[j])
					//if(str[i].equals(lottoString)){}
					//if(lotto[i]==strNum){}
					count++;
				//==은 주소값 비교
				//equals는 문자 비교
				
				
				//다 같은 방법
				//String lottoString=Integer.toString(lotto[i]);
				//lottoString=lotto[i]+"";
				//lottoString=String.valueOf(lotto[i]);
				
				
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("로또 번호: "+lotto[i]);
		}
		for (int i = 0; i < lotto2.length; i++) {
			System.out.println("내가 입력한 값: "+lotto2[i]);
		}
		System.out.println(count + "개 맞추셨습니다.");

	}

}
