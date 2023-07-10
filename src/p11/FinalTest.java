package p11;

//final
//변수 앞
//메소드 앞
//클래스 앞
class Test{
	public void test() {
		System.out.println("난 Test꺼!");
	}
	/*
	public final void test() {
	}
	*/
	//메소드에 final이 붙을 경우 overriding 불가!
}

/*
class Test1 extends String{	
}
*/
//String은 final이므로 상속(extends) 불가! 확장 불가!

public class FinalTest extends Test{
	public void test() {
		System.out.println("난 FinalTest꺼!");
	}
	public static void main(String[] args) {
		
	}

}
