package p07;

public class FinalTest {
	//main 영역이 아니기 때문에 선언만 가능, 실행 x
	//이 영역에서 final을 쓸 경우 무조건 대문자!(rule)
	final int NUM=1;
	final int NUM_TEST=1; //가독성을 위해 두 단어 사이 언더바

	public static void main(String[] args) {
		//int int; //에러 - int는 예약어(갈색)이기 때문에 변수명으로 사용 못함
		//int for; //에러
		//int class; //에러
		//int final //에러
		
		//변수 앞에 final을 붙이면 상수가 됨
		final int num=1;
		//num=2; //값 바꿀 수 없으므로 에러
		
	

	}

}
