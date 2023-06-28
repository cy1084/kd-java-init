package p03;

//배열의 크기가 변경되어도 오류 나지 않게
public class ArrayTest3 {

	public static void main(String[] args) {
		int[] ages = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// 10
		int[] tmp = ages;
		ages = new int[5];
		int max = ages.length;

		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		System.out.println();

		if (tmp.length < ages.length) {
			max = tmp.length;
		}
		for (int i = 0; i < max; i++) {
			ages[i] = tmp[i];

			/*
			 * = if (tmp.length < ages.length) { 
			 * 		for (int i = 0; i < tmp.length; i++) {
			 * 			ages[i] = tmp[i]; 
			 * 	} 
			 * }else if (tmp.length > ages.length) { 
			 * 		for (int i = 0; i< ages.length; i++) { 
			 * 			ages[i] = tmp[i]; 
			 * } 
			 *}
			 */
		}
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);

		}

	}

}

