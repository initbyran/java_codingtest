package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam2164 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	      
	      int N = sc.nextInt();
	      
	      List<Integer> numList = new ArrayList<Integer>();
	      for(int i=1; i<=N; i++) {
	    	  numList.add(i);
	      }
	      
	      int t = 0;
	      while(t<N-2) {
	
	    	  int n = numList.get(1);
	    	  numList.add(n);
	    	  numList.remove(0);
	    	   
	    	  t++;
	      }
       
	      numList.remove(0);
	      
	      System.out.println(numList.get(0));
	}

}
