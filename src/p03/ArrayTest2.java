package p03;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] ages = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] tmp = ages;
		ages = new int[20];
//다시
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		System.out.println();
		for (int i = 0; i < tmp.length; i++) { // 더 큰 것을 길이의 기준으로
			ages[i] = tmp[i];
		}
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);

		}

	}

}
