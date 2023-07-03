package p06;

public class GuGuDan {

	//for 문은 무조건 공통점 찾기!!!!
	public static void main(String[] args) {
		/*
		  for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + i * j);
				if (j != 9) {
					System.out.print(", ");
				}
			}
			System.out.println("");
		}
		*/
		
		/*
		 for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + i * j);
				if (j == 9) {
					System.out.print();
				}else{
					System.out.print(", ");
				}
			}
			System.out.println("");
		}
		  */
		
		
		//가로로 출력 다시
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(j + "x" + i + "=" + i * j+", ");
				if (j == 9) {
					System.out.println(j + "x" + i + "=" + i * j);
				}				
			}			
		}
	}
}
 