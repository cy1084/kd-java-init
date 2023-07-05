package p08;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		float[] fls = new float[3];
		fls[0] = 1.1f;
		fls[1] = 22.1f;
		fls[2] = 0.111f;

		char[] chars = new char[3];
		chars[0] = 'a';
		chars[1] = 'b';
		chars[2] = 'c';

		String[] strs = new String[3];
		strs[0] = "우리";
		strs[1] = "모두";
		strs[2] = "화이팅!";

		
		ArrayList<Float> floatList = new ArrayList<Float>();
		for (int i = 0; i < fls.length; i++) {
			floatList.add(fls[i]);
		}
		for (int i = 0; i < fls.length; i++) {
			System.out.println(fls[i]);
		}

		ArrayList<Character> charList = new ArrayList<Character>();
		for (int i = 0; i < chars.length; i++) {
			charList.add(chars[i]);
		}
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}

		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < strs.length; i++) {
			strList.add(strs[i]);
		}
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}

	}

}
