package p02;

public class Lotto {

	public static void main(String[] args) {
		
		int[] lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++) {
		//int rNum=(int)Math.random(); //random은 double형-> int로 바꿔줌, 0~0.9999999..
		//최소값:0, 최대값:0.9*10 -> 0~9 +1 ->1~10
		//최소값:1, 최대값:45 -> ; 
		double db=Math.random();
		db *= 45; //0~44.9999999..
		db += 1; //1~45.9999999..
		int rNum=(int)db; //1~45
		lotto[i]=rNum;
		}
		
		for(int i=0;i<lotto.length;i++){
			System.out.println(lotto[i]);
		}
		
		

	}

}
