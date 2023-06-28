package p03;

//swap
public class ArrayTest {

	public static void main(String[] args) {
		int[] ages = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		/*
		 * 배열의 단점 
		 * - 같은 데이터 타입만 가능 
		 * - 배열 크기를 정해야 하며, 바꿀 수 없음
		 */
		
		//다시
		int[] tmp = ages; // 0~9, length:10
		
		ages = new int[5];// 값이 날라가고 다시 0으로 초기화
		
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		for (int i = 0; i < ages.length; i++) {
			ages[i] = tmp[i];
		}
			for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]); //밀려서?
 
		}

	}

}
