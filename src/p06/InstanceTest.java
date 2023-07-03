package p06;

//같은 패키지 안에 Animal 클래스가 존재하므로 오류
//class Animal{	
//}		

class Car{
	public String name;
	public static String type; //->static이므로 Car라는 공간에 들어가지 않음..!
}

public class InstanceTest {
	public static void main(String[] args) {
		Car.type="승용차";
		//Car.name="소나타";	//오류 -> name은 nonstatic이기 때문에 반드시 메모리 생성
		
		Car sonata=new Car(); 
		System.out.println(sonata.name);
		
		sonata.name="소나타";
		System.out.println(sonata.name);
		
		
		
		Car c=null;
		System.out.println(c); //null
		System.out.println(c.name); //NullPointerException
		c=new Car(); //메모리 생성 o, 초기화x
		System.out.println(c.name); //null
		
		
		c=new Car(); //한 번 더 메모리 생성
		c.name="소나타"; //그 이름을 소나타로 바꿈
		c=new Car(); //다시 한번 메모리 생성
		System.out.println(c.name); //그것의 c.name 출력 -> null/ 위의 두 개의 메모리는 필요 없어졌으므로 garbage collection에 등록 
		
		
		Car c1=new Car();
		c1.name="소나타";
		Car c2=new Car();
		c2.name="아반떼"; 
		//c1, c2는 다른 애 

	}

}
