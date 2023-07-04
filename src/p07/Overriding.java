package p07;

class Coffee{
	public String name;
	public int price;
	
	public String toString() { //Object의 toString과 똑같은 메소드 만들어 놓음
		return "name: "+name+", price: "+price;
	}
}
public class Overriding {
	public static void main(String[] args) {
		Coffee c1=new Coffee();
		//Coffee c2=c1;
		//Object obj=c1;
		
		c1.name="아이스 아메리카노";
		c1.price=2000;
		
		//String str=c1.toString(); //toString이란 메소드가 없는데도 오류 안남-> toString은 Object 거기 때문에 
		//System.out.println("메뉴: "+c1.name+", 가격: "+c1.price);

	}

}
