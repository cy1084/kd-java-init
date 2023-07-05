package p08;

//인터페이스 -> 선언만 하고 body는 없음, 메모리 생성 x, 데이터 타입으로만 사용 가능 
//접근 제어자 안 쓰면 public/ 일반 클래스에서는 안 쓰면 default
public interface Remote {
	public void on();
	public void off();
}
