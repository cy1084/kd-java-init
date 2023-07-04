package p07;

class Song{
	public int rank;
	public String title="하입보이";
	public void printTitle(){
		System.out.println("노래 제목: "+title);
	}
	/*
	public static void printSomething() {
		System.out.println("노래 제목: "+title);
	}	//에러
	
	public void printTitle() {
		System.out.println("노래 제목: "+title);
	}	//에러안남	
	*/
	
	//static은 static 영역에서밖에 못 씀(static은 완전히 다른 영역!!)
	//nonstatic은 static, nonstatic 둘 다 쓸 수 있음
}
public class SonExec {
	public static void main(String[] args) {
		
		Object o=new Son();
		Object o1=new String("123");
		
		Son s=new Son();
		s.name="동동";
		s.job="개발자";
		s.age=30;
		s.hobby="게임";
		s.printJob();	//상속이기 때문에 가능
		s.printHobby();
		
		
		
		Father f1= new Father();//-> 아들로 메모리를 생성하지 않고 아빠로 생성했으므로 f.hobby 불가능
		f1.name="동동이";
		//f.hobby="낚시"; //에러
		
		Father f=new Son(); 
		//데이터 타입 Father -> 아빠는 아들이 무슨 변수를 가지고 있는지 모름, father이 가지고 있는 변수만 사용 가능
		//f는 hobby 사용 못함
		//f.hobby="투자"; //에러
		
		f.name="같은거임";
		//데이터 타입 강제 변환 -> 캐스팅
		Son s2=(Son)f; //-> 위에서 아들로 메모리를 생성했으므로 가능
		s2.hobby="투자";
		System.out.println(s2.name);//s2와 f는 같은 것

		
		
		Song song=new Song();
		//song.name="하입보이"; //에러 - 변수 name 선언x
		
		song.printTitle();
		
		
		//Son < Father < Object
		//object를 확장 시킨 게 father, father를 확장 시킨 게 son
		//하나의 클래스는 하나의 클래스만 상속, 바라봄 

	}

}
