package exam;

public class examNextBigNum {

	public static void main(String[] args) {
		
		int n = 78;

		String binary = "";
		for (int i = n; i > 0; i /= 2) {
			binary = String.valueOf(i % 2) + binary;
		}
		
		
		while(true) {
			n = n+1;
			if(countOne(Integer.toBinaryString(n))==countOne(binary)) {
				binary = Integer.toBinaryString(n);
				break;
			}
		}	
		
	}

    static int countOne(String string) {
		int count = 0;
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)=='1') {
				count++;
			}
		}
		return count;
	}

}




//if (!binary.contains("0")) {
//	binary = "10" + binary.substring(1, binary.length());
//} else if (binary.contains("01")) {
//	String[] arr = binary.split("01");
//	if(arr.length==1) {
//		binary = arr[0]+"10";
//	} else {
//	char[] cha = new char[arr[1].length()];
//	for (int i = 0; i < arr[1].length(); i++) {
//		cha[i] = arr[1].charAt(i);
//	}
//	Arrays.sort(cha);
//	String end = "";
//	for (char character : cha) {
//		end += String.valueOf(character);
//	}
//	binary = arr[0] + "10" + end;
//	}
//} else if (binary.contains("10") && !binary.contains("01")) {
//	binary = binary.substring(0, binary.length() - 1) + "1";
//  
//}int answer = Integer.parseInt(binary, 2);
