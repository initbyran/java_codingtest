package exam;

import java.util.HashMap;
import java.util.Map;

public class examNumStringVoca {

	public static void main(String[] args) {
		
		String s = "one4seveneight";

		Map<String, String> map = new HashMap<>();
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		map.put("four", "4");
		map.put("five", "5");
		map.put("six", "6");
		map.put("seven", "7");
		map.put("eight", "8");
		map.put("nine", "9");
		map.put("zero", "0");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
		
			s = s.replace(entry.getKey(), entry.getValue());
		}
		
		int answer = Integer.parseInt(s);
		
	} 

}
