package p06;

public class SortTest {

	public static void main(String[] args) {
		int[] nums = new int[] { 10, 7, 15, 1, 4 }; // 10을 기준으로 다른 값들과 비교(0번째를 기준으로 하므로 0번째와는 비교할 필요 없음)

		/*
		 * //다시 for(int i=0;i<nums.length;i++) { int min=nums[i]; for(int
		 * j=i+1;j<nums.length;j++) { System.out.print(min+"이랑 ");
		 * System.out.print(nums[j]+"비교, "); } System.out.println(""); }
		 */
		
		
		// 선택 정렬
		for (int i = 0; i < nums.length; i++) {
			int min = nums[i];
			int idx = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (min > nums[j]) {
					min = nums[j];
					idx = j;
				}
			}
			int tmp = nums[i];
			nums[i] = nums[idx];
			nums[idx] = tmp;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
