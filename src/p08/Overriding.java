package p08;

/*
오버라이딩 
1. 무조건 상속, 구현이 전제 조건
2. 메소드의 이름과 데이터 타입이 반드시 같아야 함
*/

class Father{
	public void work() {
		System.out.println("아버지가 건물을 짓습니다.");
	}
}
class Son extends Father{
	public void work() {
		System.out.println("아들이 개발을 합니다.");
	}
	public int work(int i) {	//이건 오버로딩
		return 1;
	}
	/*
	public int work() {
		return 1;
	}					//무조건 데이터 타입이 같아야 함 -> 그래야 son이 father라고 불릴 수 있기 때문
	*/
}

public class Overriding {
	public static void main(String[] args) {
		Father f=new Son(); //son은 father라고 불릴 수 있음
		f.work();

	}

}
