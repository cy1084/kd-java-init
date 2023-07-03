package p06;

public class AreaTest {

	public static void main(String[] args) {
		int[] nums=new int[]{10,22,11,7};
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
//nums는 main 메소드인 6라인에서 태어나고 11라인에서 죽음
//파라미터 사용!!
}


/*
 	메소드 사용 시 =>
 	public static void main(String[] args) {
		int[] nums=new int[]{10,22,11,7};
	}
	
	public static void printNum(int[] nums){
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

 
 */


/*

	public static void main(String[] args) {
	 String[] nums=new String[]{"1","2"};
	 printNums(nums); //오류 -> 데이터 타입이 같지 않음!!!!!
	}
	
	public static void printNum(int[] nums){
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}


 * */
 