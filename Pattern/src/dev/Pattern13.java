package dev;
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 


public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = ""    ;
		for(int row = 1;row <= 5;row++ ) {
			for(int col = 1;col <= row;col++) {
				res+=col+" ";
			}
			res+= "\n";
		}
		System.out.println(res);


	}

}
