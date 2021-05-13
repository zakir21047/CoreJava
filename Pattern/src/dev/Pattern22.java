package dev;

public class Pattern22 {
	public static void main(String[] args) {
		int x = 5 ;
		for(int row = 5;row >= 1 ;row--) {
			for(int col = 5;col >= 1;col--) {
				System.out.print(x+ " ");
				x = x + 5;
			}
			x = row - 1;
			System.out.println();
		}
	}

}
