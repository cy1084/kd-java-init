package p07;

public class Game {
	String name;
	int price;
	String genre;
	
	public void start() {
		System.out.println(name+"를 시작합니다.");
	}
	public void playing() {
		System.out.println(name+"를 플레이 하는 중입니다.");
	}
	public void stop() {
		System.out.println(name+"를 종료합니다.");
	}
	
}
