package p04;

public class MethodTest4 {
	public static int[] getLotto() {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = MethodTest2.getRandomNum(45);
			for (int j=0; j<i; j++) {
				if (lotto[j]==lotto[i]) {
					i--;
					break; 
				}
			}
		}
		
		return lotto;
	}
	
	public static void printLotto(int[] lotto) {
		for(int i=0;i<lotto.length;i++) {
			System.out.println("lotto["+i+"]: "+lotto[i]);
		}
		
	}

	public static void main(String[] args) {
		/*
		 * String[] str = new String[1]; // new 할 때만 공간이 생성, str이 한 공간을 가리킴 String[]
		 * str2 = str; // str2도 위에 생성된 공간을 가리킴 -> str과 str2는 가리키는 공간이 같음 
		 * str[0] = "안녕";
		 * str = null; // -> str은 이제 위에 생성된 공간을 가리키지 않음
		 * 
		 * System.out.println(str2[0]); // 안녕
		 */
		
		int[] lotto=getLotto();
		printLotto(lotto);

		
	}

}
