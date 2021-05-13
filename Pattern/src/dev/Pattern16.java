package dev;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     String res = "";
	     for(int row = 1;row <= 5;row++) {
	    	 for(int col = 1;col <= row;col++) {
	    		 res+= row*2+" ";
	    	 }
	    	 res+= "\n";
	     }
	     System.out.println(res);

	}

}
