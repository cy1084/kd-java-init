package p06;

public class NullTest {
	
	String str3="45";
	String str4; //초기화 안했기 때문에 자바가 대신 null로 초기화 해줌 -> 18번 라인에서!
	
	public static void main(String[] args) {
		/*System.out.println("프로그램 시작");
		String str1=null;
		String str2="123";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("프로그램 종료");
		
		//9번 라인 실행하려다가 오류 -> 9번부터 실행 안됨

		*/
		
		NullTest nt=new NullTest(); //인스턴스화
		System.out.println(nt.str4); //null
	}

}
