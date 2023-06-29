package p04;

public class GuGuDan {
	public static void printGuGuDan(int firstDan, int secondDan) {

		for (int i = 1; i <= firstDan; i++) {
			for (int j = 1; j <= secondDan; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		//printGuGuDan(2);
		//printGuGuDan(5);
		printGuGuDan(7,8);

	}

}


