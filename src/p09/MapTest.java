package p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
//E(element),K(key),V(value)
	
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap(); //key, value 두 개씩 들어감 -> put
		map.put("age",33);
		map.put("like number",7);
		map.put("rank",8);
		//map.size()=3;
		
		//map -> index 개념 없음 -> 출력이 넣은 순서대로 되지 않음
		
		//값을 가져오려면 반드시 key를 알아야 함
		System.out.println(map.get("age"));
		//System.out.println(map.get("likenumber"));//blank x -> null
		System.out.println(map.get("like number"));
		System.out.println(map.get("rank"));
		
		//Set<String> keySet=map.keySet();  //key가 String이므로 Set<String>
		//Iterator<String> it=keySet().iterator();
		Iterator<String> it=map.keySet().iterator();
		
		
		while(it.hasNext()) { //hasNext -> 다음 거 가지고 있니?
			String key=it.next();
			System.out.println("key: "+key+", value: "+map.get(key));
			
		}
		

	}

}
