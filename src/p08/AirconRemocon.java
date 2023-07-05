package p08;

public class AirconRemocon extends Remocon{
	
	//데이터 타입이 붙으면 생성자 아님
	//생성자 - 데이터 타입이 없음, 클래스 이름과 같음
	public void AirconRemocon() { 
		System.out.println("에어컨 리모콘에 배터리 넣음");		
	}
	public void on() {
		System.out.println("에어컨을 킵니다.");	
	}
	public void off() {
		System.out.println("에어컨을 끕니다.");	
	}
	public void tempUp() {
		System.out.println("에어컨 온도를 높입니다.");
	}
	public void tempDown() {
		System.out.println("에어컨 온도를 낮춥니다.");
	}

}
