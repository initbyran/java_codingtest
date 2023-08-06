package exam;

public class examJumpAndTeleport {

	public static void main(String[] args) {
		
		int n = 5000;
		int ans = 1;
	
		while(n!=1) {
			if(n%2==0) {
				n = n/2;
			} else {
				ans ++;
				n = n-1;
			}
		}
		
		System.out.println(ans);
	}

}
