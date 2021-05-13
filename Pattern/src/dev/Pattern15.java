package dev;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 1;row <= 5;row++) {
			for(int col = 1;col <= 5;col++) {
				if(row == 1||row == 5||col == 1||col == 5) {
				res+= 1+" ";
				}
				else {
					res+="  ";
				}
				
			}
			res+='\n';
			//row++;
		}
		System.out.println(res);


	}

}
