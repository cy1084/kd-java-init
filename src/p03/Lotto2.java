package p03;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		Random r= new Random();
		int[] lotto=new int[7];
		
		for(int i=0;i<lotto.length;i++) {
			int rNum=r.nextInt(40)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
			if(lotto[i]==0) {
				lotto[i]=rNum;
			}
		}	
		for(int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}
	}

}


