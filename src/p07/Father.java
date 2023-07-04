package p07;

//상속은 확장의 개념 -> 아빠보다는 아들이 더 큼(변수 더 많음)
//Father-> 2가지 이름으로 불릴 수 있다 -> Father, Object!!

public class Father { //extends Object 생략
	public String name;
	public int age;
	public String job;
	
	public void printJob() {
		System.out.println(name+"님의 직업은 "+job+"입니다.");
	}
	
}
