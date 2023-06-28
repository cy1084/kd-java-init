package p03;

//영역 - 같은 영역에서는 이름이 같은 변수 선언 불가
public class AreaTest {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			
		} //for문이 끝나면 변수 i가 죽으므로 다시 선언 가능 
		int i=0; //변수 선언
		
		
		System.out.println("-------------------");
		
		int j=1;
		for(;j<10;j++) {
			
		}
		System.out.println(j);//j=10
		
		if(i==10) {
			int b=1;
		}
		int b=1;
		

	}

}
