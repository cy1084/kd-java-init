package p07;

public class ThisClass {
	String name="경동대";
	
	public void printName() {
		String name="민국대"; 
		System.out.println(name); //민국대
		System.out.println(this.name); //경동대 , this-> 같은 변수 명으로도 다른 영역에 있는 변수를 사용할 수 있게끔
		
		
	}
	
	public static void main(String[] args){
		ThisClass tc=new ThisClass(); //static이 아닌 클래스의 메모리를 생성하기 위함
		tc.printName(); //'민국대' 출력 , String name="민국대"; 를 선언하기 전엔 '경동대' 출력
	}

}
