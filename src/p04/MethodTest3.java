package p04;

public class MethodTest3 {
	public static void test() {
	}
	public static int getNum() {
		return 1;
		//return (int)1.1 ;
	}
	
	public static void main(String[] args) {
		//int i=test(); //i의 데이터 타입은 int이고 test의 데이터 타입은 void이므로 오류
		
		int num=getNum(); //1
		System.out.println(num);
		

	}

}
