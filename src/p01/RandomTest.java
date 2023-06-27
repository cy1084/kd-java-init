package p01;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r= new Random();
		int[] array = new int[3];
		
		array[0]=r.nextInt(10)+1;		
		array[1]=r.nextInt(10)+1;		
		array[2]=r.nextInt(10)+1;
		
		
		for(int i=0;i<3;i++) {
			System.out.println(array[i]);
		}

	}

}
