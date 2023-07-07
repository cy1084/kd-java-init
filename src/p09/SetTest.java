package p09;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		System.out.println(set.size()); //0
		set.add(1);
		set.add(1);
		set.add(1); //set은 중복 안됨 -> 안 들어감
					//따라서 set으로 중복 제거 기능도 가능
		set.add(2); 
		System.out.println(set.size()); //2

	}

}
