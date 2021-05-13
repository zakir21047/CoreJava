package dev;

public class Pattern27 {

	public static void main(String[] args) {
		for(int row = 1;row <= 5;row++) {
			for(int col = 1;col <= 5;col++) {
				System.out.print(((row + col)/2)+" ");
				/*if(col == 1 || col == 3 || col == 5) {
					System.out.print("1" + "0" + "1"+ "0"+ "1");
					//System.out.print("hello "+ "");
				}
				else {
					System.out.print("0" + "0" + "0"+ "0"+ "0");
				}*/
				/*if(row == 1) {
				System.out.println("1 " + "0 " + "1 "+ "0 "+ "1 ");
				}
				else if(row == 3) {
					System.out.println("1 " + "0 "  + "1 "+ "0 "+ "1 " );
				}
				else if(row == 5) {
					System.out.println("1 " + "0 " + "1 "+ "0 "+ "1 ");
				}
				else {
					System.out.println("0 " + "0 " + "0 "+ "0 "+ "0 ");
				}*/
		}
		System.out.println();

	}
}
}


