package exam;

import java.util.Scanner;

public class exam1459 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			long x = sc.nextLong();
			long y = sc.nextLong();
			long w = sc.nextLong();
			long s = sc.nextLong();

			long wCountMax = x + y;
			long sCountMax = 0;
			if (x < y) {
				sCountMax = x;
			} else {
				sCountMax = y;
			}

			long min = 0;
			for (int i = 0; i <= sCountMax; i++) {
				long wCount = 0;
				long wTime = 0;
				long sCount = 0;
				long sTime = 0;
				long totalTime = 0;

				wCount = wCountMax - (i * 2);
				sTime = i * s;
				wTime = wCount * w;

				totalTime = sTime + wTime;

				if (min == 0 ) {
					min = totalTime;
				} else {
					if (min > totalTime) {
						min = totalTime;
					}
				}
			}

			System.out.println(min);

		
	}
}
