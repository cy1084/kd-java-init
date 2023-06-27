package p01;

public class StringTest {

	public static void main(String[] args) {
		String str="1234567890";
		char c= str.charAt(5); //at 위치
		System.out.println(c);
		
		String s1="1";
		String s2="1";
		System.out.println(s1==s2);//메모리 주소가 같음, 같은 곳을 바라봄
		String s3=new String("1");//new 해줬기 때문에 s1과 메모리 주소가 다름 
		System.out.println(s1==s3);
		
		String s4=new String("1");
		System.out.println(s3==s4);
		
		System.out.println(s3.equals(s4));
		
		str=str.replace("1","one");
		System.out.println(str);
		
		String name="hwang";
		name=name.toUpperCase();
		System.out.println(name);
		
		name=name.toLowerCase();
		System.out.println(name);

	}

}
