package dev;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 1;row <= 5;row++) {
			for(int col = row;col <= row;col++) {
				res+=row+" ";
				
			}
			res+='\n';
			//row++;
		}
		System.out.println(res);

	}

}
