package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class examEngShiritori {

	public static void main(String[] args) {
		
		int n = 3;
		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };

		// 지는 경우 ; 앞에 등장한 단어를 다시 말한 경우, 앞 단어의 끝 글자와 뒷 단어의 앞 글자가 다른 경우

		int k = 0;
		for (int i = 0; i < words.length - 1; i++) {
			if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
				k = i + 2;
				break;
			}
		}
		System.out.println(k);

		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			map.put(i, words[i]);
		}

		String str = "";
		int m = 0;
		Arrays.sort(words);
		for (int i = 0; i < words.length - 1; i++) {
			if (words[i].equals(words[i + 1])) {
				str = words[i];
				List<Integer> list = new ArrayList<>();
				for (Map.Entry<Integer, String> entry : map.entrySet()) {
					if (entry.getValue().equals(str)) {
						list.add(entry.getKey() + 1);
					}
				}
				Collections.sort(list);
				m = list.get(1);
			}
		}

		int looser = 0;
		if (k == 0 && m != 0) {
			looser = m;
		} else if (m == 0 && k != 0) {
			looser = k;
		} else {
			looser = Math.min(k, m);
		}
		System.out.println(looser);

		int[] answer = new int[2];
		if (looser % n == 0 && looser != 0) {
			answer[0] = n;
			answer[1] = (looser / n);
		} else if (looser == 0) {
			answer[0] = 0;
			answer[1] = 0;
		} else {
			answer[0] = looser % n;
			answer[1] = (looser / n) + 1;
		}
		
		
	}

}
