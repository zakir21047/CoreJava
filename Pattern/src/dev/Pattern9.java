package dev;
//1 1 1 1 1 
//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4 
//5 5 5 5 5 


public class Pattern9 {

	public static void main(String[] args) {
		String res ="";
		// TODO Auto-generated method stub
		for(int row = 1;row <= 5;row++) {
			for(int col = 1;col <= 5;col++) {
			//System.out.print(row);
				res = res + row+" ";
		}
			
			//System.out.println();
			res = res+ "\n";
		}
		System.out.println(res);

	}

}
