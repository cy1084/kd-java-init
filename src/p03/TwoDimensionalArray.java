package p03;

//2차원 배열
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] numsArray = new int[3][3];	//데이터 타입: int 배열배열, numsArray[0]의 데이터 타입: int 배열,  numsArray[0][0]의 데이터 타입: int
		//System.out.println(numsArray.length);//3

		for(int i=0;i<numsArray.length;i++) {
			for(int j=0;j<numsArray[i].length;j++) {
				numsArray[i][j]=1;
			}
		} //2차원 배열 모두 1
		
		for(int i=0;i<numsArray.length;i++) {
			for(int j=0;j<numsArray[i].length;j++) {
				System.out.println(numsArray[i][j]);
			}
		} 
	}

}
