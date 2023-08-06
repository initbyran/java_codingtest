package exam;

import java.util.Scanner;

public class exam1244 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] onOff = new int[N];
		for(int i=0; i<N; i++) {
		    onOff[i]=sc.nextInt();
		}

		int sNum = sc.nextInt();

		for(int j=0; j<sNum; j++) {
            int sex = sc.nextInt();
         
			if(sex==1) {
				int boyNum = sc.nextInt();
				
				for(int k=1; k<=(N/boyNum); k++ ) {
					
		        	int status = onOff[boyNum*k-1];
		        	
		        	if(status == 1) {
		        	   onOff[boyNum*k-1]=0;
		        	  
		        	} else {
		        	   onOff[boyNum*k-1]=1;
		        	   
		        	}
		        }
				
			} else {
				int girlNum = sc.nextInt();
				
		        int max = 1;
				for(int k=1; k<girlNum; k++) {
		        	if(onOff[girlNum-k]==onOff[girlNum+k]) {
		        		max = k;
		        	} else {
		        		max = 0;
		        	}
		        }
				
				for(int t=(girlNum-max); t<=(girlNum+max); t++) {
					if(onOff[t-1] == 1) {
						onOff[t-1] = 0;
					} else {
						onOff[t-1] = 1;
					}
				}
			}
			
		}
		for(int i=0; i<N; i++) {
			System.out.print(onOff[i] + " ");
		}
	}

}
