package p07;

public class School {
	public String name;
	public String address;
	
	public void printInfo() {
		System.out.println("학교 이름: "+this.name);	//this. -> 안 붙여도 됨
		System.out.println("학교 주소: "+this.address);
	}

}
