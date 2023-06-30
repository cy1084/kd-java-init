package p05;

public class MinMax {

	public static void main(String[] args) {
		int[] nums = new int[] { 10, 22, 5, 8, 25 };

		// int max=0; //int 배열의 값들이 반드시 양수 값이라는 전제 하에만 max=0으로 초기화 가능
		int max = nums[0];
		int min = nums[0];
		int maxIndex=0;
		int minIndex=0;
		
		for (int i = 1; i < nums.length; i++) { // i=1 -> max=nums[0]이므로 자기 자신과는 비교할 필요 없으니까 1부터
			if (max < nums[i]) {
				max = nums[i];
				maxIndex=i;
			}
			
			if (min > nums[i]) {
				min = nums[i];
				minIndex=i;
			}
			
		}
			System.out.println("최댓값: " + max+", index: "+ maxIndex);
			System.out.println("최솟값: " + min+", index: "+ minIndex);

		}

	}

