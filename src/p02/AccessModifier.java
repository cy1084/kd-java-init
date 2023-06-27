package p02;

//접근 제어자
public class AccessModifier { //클래스에는 선언,초기화만 가능하며 실행은 안됨
	int b=10;
	
	public static void main(String[] args) {//메인에서 실행 가능
		int i=1;
		System.out.println(i); //접근 가능
		//System.out.println(b);//접근 불가능, static이기 때문, b가 있는 위치를 알려줘야 함 
		
		AccessModifier am=new AccessModifier();// AccessModifier 첫글자 대문자-> 참조형 데이터 타입, am은 AccessModifier 클래스에 접근 가능		
		System.out.println(am.b);// 접근 가능
		
		AccessModifier am1=new AccessModifier();
		System.out.println(am1.b);
		
		

	}

}
