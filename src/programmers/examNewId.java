package exam;

public class examNewId {

	public static void main(String[] args) {
		
		String new_id = "abcdefghijklmn.p";
		
		new_id = new_id.toLowerCase();
		    
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		
		while(new_id.contains("..")) {
	    new_id = new_id.replace("..", ".");
		}


	    if(new_id.startsWith(".")) {
	    	new_id = new_id.substring(1);
	    }
	  
	    if(new_id.endsWith(".")) {
	    	new_id = new_id.substring(0, new_id.length()-1);
	    }
	    
	    if(new_id.isEmpty()) {
	    	new_id = "a";
	    }
	    
		if(new_id.length()>=15) {
			new_id = new_id.substring(0,15);
		}
		System.out.println(new_id);
		if(new_id.endsWith(".")) {
			 new_id = new_id.substring(0, new_id.length()-1);
	    }
		System.out.println(new_id);
		 if(new_id.length()<=2) {
			 char ch = new_id.charAt(new_id.length()-1);
			 while(new_id.length()!=3) {
				 new_id += ch;
			 }
		 }
		 
		
		
		System.out.println(new_id);
		
		
	}

}
