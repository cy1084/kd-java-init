package p07;

class Test {
	public static void main(String[] args) {
		// test(); // 같은 클래스가 아니므로 에러
		OverLoading.test();
		// OverLoading.test2(); //에러
	}
}

public class OverLoading {
	// 오버로딩-> 같은 영역이어야 함/ 메소드 명이 같아야 함/ 파라미터 개수, 데이터 타입, 순서가 달라야 함

	public static void test() {
		System.out.println("test() 호출");
	} // public-> 다른 패키지에서 접근 가능

	public void test(byte b) {
		System.out.println("test(byte b) 호출");
	}

	public void test(short s) {
		System.out.println("test(short s) 호출");
	}

	public void test(int num) {
		System.out.println("test(int num) 호출");
	}

	public void test(long l) {
		System.out.println("test(long l) 호출");
	}

	public void test(float f) {
		System.out.println("test(float f) 호출");
	}

	public void test(double d) {
		System.out.println("test(double d) 호출");
	}

	public void test(char c) {
		System.out.println("test(char c) 호출");
	}

	public void test(boolean bool) {
		System.out.println("test(boolean bool) 호출");
	}

	public void test(String str) {
		System.out.println("test(String str) 호출");
	}

	// 파라미터의 순서가 다르므로 다른 메소드
	public void test(String str, int num) {
	}

	public void test(int num, String str) {
	}

	private static void test2() {
	} // private-> 같은 클래스 안에서만 접근 가능, 상속 불가능

	static void test3() {
	} // default-> 같은 패키지 안에서 접근 가능

	public static void main(String[] args) {
		// void -> 리턴은 되지만, 리턴 값이 없는 것!!

		OverLoading ol = new OverLoading(); // static이 아니므로 메모리 생성 필수
		ol.test();
		ol.test(2);
		ol.test((short)2);
		ol.test(2l);
		ol.test("2");
		ol.test(2.2);
		ol.test(2.2F);
		ol.test('3');
		ol.test(true);
		
	


	}

}
