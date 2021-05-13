package dev;
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 


public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 5;row >= 1;row--) {
			for(int col = 5;col>=1;col--) {
				res+=col+" ";
			}
			res+="\n";
		}
		System.out.println(res);

	}

}
