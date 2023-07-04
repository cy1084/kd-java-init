package p07;

public class SyntaxAndRule {

	public static void main(String[] args) {
		//------------rule------------
		int num; //영어, 한글 등 언어 상관 없지만 영어가 보편적
		int n1; //첫 글자 제외 숫자 포함 가능
		int n1n; 
		int numStr; //두 단어가 합쳐질 경우 두 번째 단어의 첫 글자는 대문자로
		
		//패키지 명, 메소드 명-> 숫자 불가능, 무조건 소문자만!
	
		
		
		//-----------syntax------------
		//int 1n; //첫 글자 숫자 - 에러
		//int !n; //특수 문자 - 에러
		//int @n;
		
		//클래스 명-> 첫 글자 반드시 대문자/ 한글, 한문 등 쓰지 않음
		
		
		//특수 문자 중 예외 케이스(고급 개발자가 될 때까지 쓸 일 없음) 
		int _n;
		int $n;
		
		String str;
		String[] strs; //복수
		

	}

}
