package p03;

public class ThreeSixNine2 {

	public static void main(String[] args) {
		String str="13";
		System.out.println(str.length());//2
		System.out.println(str.indexOf("3"));//1
		System.out.println(str.indexOf("6"));//-1 , 나올 수 없는 값
		System.out.println(str.contains("3"));//true
		
		for(int i=1;i<=100;i++){
			String str1=i+"";
			if(str1.contains("3")||str1.contains("6")||str1.contains("9")) {
				System.out.println("짝");
			}else {
				System.out.println(str1);
			}
			
		}
		

	}

}
