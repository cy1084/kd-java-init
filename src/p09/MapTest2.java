package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<>();
		m1.put("name", "김홍균");
		m1.put("age", "27");
		m1.put("address", "서울");

		Map<String, String> m2 = new HashMap<>();
		m2.put("name", "김진수");
		m2.put("age", "25");
		m2.put("address", "서울");

		Map<String, String> m3 = new HashMap<>();
		m3.put("name", "김아영");
		m3.put("age", "28");
		m3.put("address", "부산");

		Map<String, String> m4 = new HashMap<>();
		m4.put("name", "이왕균");
		m4.put("age", "22");
		m4.put("address", "광주");

		// map이 여러개이므로 list로 묶기
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);
		System.out.println(mapList); // 데이터 12개가 담김

		
		//이중 for문
		for (int i = 0; i < mapList.size(); i++) {
			Map<String, String> map = mapList.get(i);
			Iterator<String> it = map.keySet().iterator();

			while (it.hasNext()) {
				String key = it.next();
				System.out.print(key + " : " + map.get(key) + ", ");
			}
			System.out.println();
		}

	}

}
