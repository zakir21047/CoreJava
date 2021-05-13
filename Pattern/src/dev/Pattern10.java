package dev;
//5 5 5 5 5 
//4 4 4 4 4 
//3 3 3 3 3 
//2 2 2 2 2 
//1 1 1 1 1 


public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res ="";
		// TODO Auto-generated method stub
		for(int row = 5;row >= 1;row--) {
			for(int col = 5;col >= 1;col--) {
			//System.out.print(row);
				res = res + row+" ";
		}
			
			//System.out.println();
			res = res+ "\n";
		}
		System.out.println(res);


	}

}
