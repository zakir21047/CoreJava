package dev;
//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5 


public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = ""    ;
		for(int row = 1;row <= 5;row++ ) {
			for(int col = 1;col <= row;col++) {
				res+=row+" ";
			}
			res+= "\n";
		}
		System.out.println(res);

	}

}
