package p09;

import java.util.ArrayList;
import java.util.List;

public class ListTest5 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(1);
		numList.add(35);
		numList.add(17);
		numList.add(4);

		for (int i = 0; i < numList.size(); i++) {
			for (int j = i + 1; j < numList.size(); j++) {
				if (numList.get(i) > numList.get(j)) {
					int tmp = numList.get(i);
					numList.set(i, numList.get(j)); // i번째에 numList.get(j) 값 대입
					numList.set(j, tmp);

				}
			}
		}
		/*
		 * Collections.sort(numList); 
		 * List, Map, Set -> Collection Framework
		   sort는 static 메소드이기 때문에 메모리 생성하지 않아도 사용 가능!!!!
		   ex)System.out.println 
		 */

		System.out.println(numList);
	}

}
