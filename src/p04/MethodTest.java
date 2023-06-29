package p04;

//함수-> 반복적인 작업을 안하기 위함

class Test{
	public static int getNum() {
		return 1;
	}
}
//영역이 다르므로 같은 이름의 getNum 메소드 가능


public class MethodTest {
	int getNum; //변수의 getNum
	public static int getNum(){ //기본형(int), 메소드의 getNum 
		return 0; 
		//반드시 int 값 리턴
	}
	public static String getStr() { //참조형(String)
		return "";
	}
	
	public static void test() {
		return; 
		//void-> return은 되지만 무언가를 return 할 수는 없다
		//return 1;(x)
	}

	public static void main(String[] args) {
		int a = 1;
		int b = getNum(); //getNum의 데이터 타입과 b의 데이터 타입이 같으므로 오류 안남
		int c = Test.getNum();//Test 클래스의 getNum
		String str = getStr();

	}

}
