package p07;

class Mother {
	public void work() {
		System.out.println("어머니가 집안일을 하십니다.");
	}
}

class Daughter extends Mother {
	public void work() {
		System.out.println("딸이 출근을 합니다.");
	}
	public void work(String job) {
		System.out.println("딸이 "+job+"을 합니다.");
	}
}

public class Overriding2 {
	public static void work(Mother[] ms) {
		for(int i=0;i<ms.length;i++) {
			Mother m=ms[i];
			//m이 daughter라고 불리울 수 있다면 딸이 개발을 합니다 출력
			if(m instanceof Daughter) {
				Daughter d=(Daughter)m; //캐스팅
				d.work("개발");
				}
			}
			
					
		}
	
	public static void main(String[] args) {
		Daughter d = new Daughter(); //Daughter로 메모리 생성
		d.work();
		d.work("개발");
		
		//Mother m=new Daughter();//Daughter로 메모리 생성 -> Daughter의 work 실행 (오버라이딩)
		//m.work();
		
		Mother m=new Mother();
		System.out.println(d instanceof Mother); //변수 d를 Mother라고 불러도 되니? true
		System.out.println(m instanceof Mother); //변수 m을 Mother라고 불러도 되니? true
		
		System.out.println(d instanceof Daughter); //변수 d를 Daughter라고 불러도 되니? true
		System.out.println(m instanceof Daughter); //변수 m을 Daughter라고 불러도 되니? false
		
		//메모리 생성을 Daughter로 했으면 가능
		//Mother m=new Daughter();
		//System.out.println(m instanceof Daughter); //변수 m을 Daughter라고 불러도 되니? true
		
		Mother[] ms=new Mother[2];
		ms[0]=d;
		ms[1]=m;
		work(ms);
		
		
	}
}
