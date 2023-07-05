package p08;

class Test {
	public void test() {// NoneExtend class의 test()와 하나도 관련 없음, 그냥 별도 메소드

	}
}

/*
오버로딩이 성립하기 위한 조건
1. 같은 영역
2. 같은 메소드 명
3. 매개변수 개수 달라야 함
4. 매개변수 개수가 달라도 데이터 타입이 달라야 함
*/
class NoneExtend {
	public void test() {

	}
	public int test(int i) {
		return 1;
	}
	public String test(String str) {
		return "황채영";
	}
	/*
	 * public int test() {} return 1; }//오버로딩은 return 타입과 관련 없음, 같은 이름의 test 메소드가 있기 때문에 에러
	 */

	public class Overloading {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
}
