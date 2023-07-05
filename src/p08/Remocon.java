package p08;

//인터페이스 Remote를 바라보는 Remocon 클래스는 on과 off를 반드시 구현해야 한다.

//Remocon, Remote, Object라 불릴 수 있음
public class Remocon implements Remote{
	
	@Override
	//오버라이드 -> 메모리를 뭘로 생성하느냐에 따라 그 메소드 실행, 위에 덮임, 상속이나 구현 시에만
	public void on() {
		System.out.println("킵니다.");		
	}

	@Override
	public void off() {
		System.out.println("끕니다.");		
	}

}
