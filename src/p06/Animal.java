package p06;

public class Animal {
	public String name;
	public String type;
	public char trans;
	public String address;
	
	public void eat() {	//static이 붙지 않음(nonstatic 메소드), name이란 변수가 없는데도 사용 했음 -> static을 붙이면 오류
		System.out.println(name+"가 먹는다.");
	}
	
	public void run() {
		System.out.println(name+"가 달린다.");
	}
	
	public void hunt() {
		System.out.println(name+"가 사냥한다.");
	}
	public void hunt(String target) {
		System.out.println(name+"가 "+target+"을 사냥한다.");
	}
	
	public void fly() {
		System.out.println(name+"가 난다.");
	}
	
	
	/*
	public static void print() { //static 메소드		
	}
	*/

	public static void main(String[] args) {
	

	}

}
