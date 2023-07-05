package p08;

public class TVRemocon extends Remocon{
	//TVRemocon, Remocon, Remote(상속), Object라 불릴 수 있음
	
	public void on() {
		System.out.println("TV를 킵니다.");	
	}
	public void off() {
		System.out.println("TV를 끕니다.");	
	}
	public void chUp() {
		System.out.println("TV 채널을 올립니다.");	
	}
	public void chDown() {
		System.out.println("TV 채널을 내립니다.");
	}

}
