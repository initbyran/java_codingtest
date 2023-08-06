package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class examPersonalInformation {

	public static void main(String[] args) {
		// input
		String today = "2020.01.01";
		String[] terms = { "Z 3", "D 5" };
		String[] privacies = { "2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z" };

		int todayNum = Integer.parseInt(today.replace(".", ""));

		// 약관 정보 파싱
		Map<String, Integer> map = new HashMap<>();
		for (String t : terms) {
			String type = t.split(" ")[0];
			int month = Integer.parseInt(t.split(" ")[1]);
			map.put(type, month);
		}

		// 만료된 인덱스만 list에 저장
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < privacies.length; i++) {
			System.out.println("@ " + i + "번째");
			String p = privacies[i];
			String pStyle = p.split(" ")[1];
			String pDate = p.split(" ")[0];

			int pYear = Integer.parseInt(pDate.split("\\.")[0]);
			int pMonth = Integer.parseInt(pDate.split("\\.")[1]);
			int pDay = Integer.parseInt(pDate.split("\\.")[2]);

			int dueMonth = map.get(pStyle);

			// 해를 넘겼는지 아닌지 판단
			if (dueMonth <= (12 - pMonth)) {
				// 해를 넘기지 않은
				int expireMonth = dueMonth + pMonth;
				int expireDate = pYear * 10000 + expireMonth * 100 + pDay;
				System.out.println("!! " + expireDate + " ; " + i);
				if (expireDate <= todayNum) {
					list.add(i + 1);
				}
			} else  {
				// 해를 넘어가야하는 경우
				// 만료 월 : (기존 월 + 유효 기간) % 12
				int expireMonth = (dueMonth - (12 - (pMonth))) % 12;
				// 만료 년 : 기존 년 + (유효기간 / 12) + 1
				int expireYear = (dueMonth - (12 - (pMonth))) / 12 + 1;
				System.out.println("@@ " + expireYear + ", " + expireMonth);

				//
				if (expireMonth == 0) {
					int expireDate1 = (pYear + expireYear) * 10000 + 1200 + pDay;
					System.out.println("## " + expireDate1 + " ; " + i);
					if (expireDate1 <= todayNum) {
						list.add(i + 1);
					}
				} else {
					int expireDate2 = (pYear + expireYear) * 10000 + expireMonth * 100 + pDay;
					System.out.println("@!@ " + expireDate2 + " ; " + i);
					if (expireDate2 <= todayNum) {
						list.add(i + 1);
					}
				}
			}
		}
		Collections.sort(list);

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
			System.out.println(answer[i]);
		}

	}

}
