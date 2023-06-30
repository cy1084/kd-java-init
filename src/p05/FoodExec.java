package p05;

//food를 활용한 실행 파일
//내용 파일과 실행 파일 별도로
public class FoodExec {
	
	public static void printFood(Food[] foods) {
	//public static void printFood(Food f) {
		
		for(Food f:foods) {
		System.out.println("음식: "+f.name);
		System.out.println("가격: "+f.price);
		System.out.println("종류: "+f.type);
		}
	}
	public static void main(String[] args) {
		Food f=new Food(); //f가 Food 방을 바라봄
		System.out.println(f.name);//null
		//new로 메모리 생성 시 클래스 안에 있는 변수의 초기화가 안되어 있으면 자바가 알아서 초기화 해줌
		
		f.name="삼겹살";
		f.price=15000;
		f.type="한식";
		//printFood(f);
				
		Food f1=new Food();
		f1.name="마라탕";
		f1.price=15000;
		f1.type="중식";
		//printFood(f1);
		
		Food f2=new Food();
		f2.name="짜장면";
		f2.price=7000;
		f2.type="중식";
		//printFood(f2);
		
		Food f3=new Food();
		f3.name="닭갈비";
		f3.price=20000;
		f3.type="한식";
		//printFood(f3);
		
		Food f4=new Food();
		f4.name="부대찌개";
		f4.price=10000;
		f4.type="한식";
		//printFood(f4);
		
		
		
		Food[] foods=new Food[5]; //2차원 배열
		//foods 배열에서 foods[0] 데이터 타입-> Food --> 변수 3개 가지고 있음 ---> 2차원 배열
		foods[0]=f;
		foods[1]=f1;
		foods[2]=f2;
		foods[3]=f3;
		foods[4]=f4;
		printFood(foods);
		
		/*
		foods[0]=f; //foods[0]이 f가 바라보는 Food를 바라봄
	
		f.name="치킨";
		System.out.println(foods[0].name);//치킨
		
		f=null; //f가 null을 바라봄
		System.out.println(foods[0].name);//치킨
		
		*/
		

	}

}
