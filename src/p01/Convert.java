package p01;

public class Convert {

	public static void main(String[] args) {
		int i=1;
		String s="1";
		String s1=i+""; //문자열
		System.out.println(s.equals(s1));
		
		int i1=Integer.parseInt(s);//String->int
		System.out.println(i==i1);
		
		String str="백이십";
		int i2=Integer.parseInt(str);
		System.out.println(i2); //error
	}

}
