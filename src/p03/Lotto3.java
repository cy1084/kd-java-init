package p03;

public class Lotto3 {

	public static void main(String[] args) {
		String lottoStr="1,32,44,15,17";
		String[] strs=lottoStr.split(","); //,를 기준으로 자름-> 값 하나하나씩 방에 들어감
		
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}

	}
	

}
