package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {
		Map<String, String> m1=new HashMap<>();
		m1.put("상품","포카칩");
		m1.put("가격","1000원");
		
		Map<String, String> m2=new HashMap<>();
		m2.put("상품","바나나킥");
		m2.put("가격","980원");
		
		Map<String, String> m3=new HashMap<>();
		m3.put("상품","초코송이");
		m3.put("가격","850원");
		
		Map<String, String> m4=new HashMap<>();
		m4.put("상품","치토스");
		m4.put("가격","900원");
		
		List<Map<String,String>> mapList=new ArrayList<>();
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);
		System.out.println(mapList);
		
		for(int i=0;i<mapList.size();i++) {
			Map<String, String> map=mapList.get(i);
			Iterator<String> it= map.keySet().iterator();
			
			while(it.hasNext()) {
				String key=it.next();
				System.out.print(key + " : " + map.get(key) + ", ");
			}
			System.out.println();
		}
		
		
		

	}

}
