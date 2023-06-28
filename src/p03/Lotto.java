package p03;

import java.util.Random;

//중복 제거
public class Lotto {

	public static void main(String[] args) {
		Random random= new Random();
		
		int[] lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=random.nextInt(45)+1;
			//i 값에 따라 비교해야 하는 경우의 수가 늘어남
			
			for (int j=0; j<i; j++) {
				if (lotto[j]==lotto[i]) {
					i--;
					break; //비교할 게 없으면 for문을 돌 필요가 없으므로 빠져 나오기 위함
				}
			}
		}
		 
			
			
		for(int i=0;i<lotto.length;i++) {
			System.out.println("lotto["+i+"]: "+lotto[i]);
		}

	}

}
