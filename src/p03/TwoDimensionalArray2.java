package p03;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {
		int[][] numsArray = new int[3][3];
		int num=1;

		for (int i = 0; i < numsArray.length; i++) {
			for (int j = 0; j < numsArray[i].length; j++) {
				/*numsArray[i][j] = num;
				num++;

				= numsArray[i][j] = num++;
				num=1이 먼저 numsArray에 대입되고 그 다음 ++
				*/
				
				//열의 length에 따라 값들의 차이가 달라짐 
				//7 8 9
				//4 5 6
				//1 2 3
				//새로로 3씩 차이
				
			
				numsArray[i][j]=num;
				
				
				
			}
		}

		for (int i = 0; i < numsArray.length; i++) {
			for (int j = 0; j < numsArray[i].length; j++) {
				System.out.println(numsArray[i][j]);
			}
		}
	}

}
