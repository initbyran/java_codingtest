package exam;

public class exam2016 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 7;
		
		String answer = "";
		String[] day = {"THU","FRI", "SAT", "SUN", "MON", "TUE", "WED"};
		
		int days = b;
		//31dyas, 30 days, 29days

        for(int i=1; i<a; i++) {
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12 ) {
                days = days + 31;
            } else if (i==2) {
                days = days + 29;
            } else {
                days = days + 30;
            }
        }

		
        answer = day[days%7];
		
		
		
	}

}
