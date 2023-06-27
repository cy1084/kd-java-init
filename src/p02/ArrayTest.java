package p02;

public class ArrayTest {

	public static void main(String[] args) {
		/*String[] strs; //변수의 선언
		String[] strs2=new String[2];
		
		System.out.println(strs2[0]);
		System.out.println(strs2[1]);
		strs2[0]="1";
		
		System.out.println(strs2[0].length());
		System.out.println(strs2[1].length());
		
		String str="1";
		System.out.println(str.length());//error null
		*/
		
	/*	String[] strNums=new String[] {"0","1","2","3","4","5","6","7","8","9"};
		int[] intNums=new int[10];
		//0->1
		//1-2
		//2->3
		//9->10
		
		for(int i=1;i<10;i++) {
			intNums[i-1]=Integer.parseInt(strNums[i]);
			System.out.println(strNums[i]);
		}*/
		
		String[] strNums=new String[10];
		
		for(int i=0;i<10;i++) {
			strNums[i]=i+1+"";//문자로
		}
		for(int i=0;i<10;i++) {
			System.out.println(strNums[i]);
		}
	}

}
