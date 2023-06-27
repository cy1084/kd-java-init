package p02;

public class ForLoop {

	public static void main(String[] args) {
		
		String[] strs=new String[10];
		
		for(int i=1;i<10;i++) {
			System.out.println(1+"x"+i+"="+i);
		}
		
		System.out.println("");
		for(int i=1;i<10;i++) {
			System.out.println(i+"x"+1+"="+i);
		}
		
		System.out.println("");
		
		for(int i=9;i>=1;i--) {
			System.out.println(i+"x"+1+"="+i);
		}

	}

}
