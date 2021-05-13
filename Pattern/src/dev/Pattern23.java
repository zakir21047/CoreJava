package dev;

public class Pattern23 {

	public static void main(String[] args) {
		int x = 1;
		for(int row = 1;row <= 5;row++) {
			for(int col = 1;col <= 5;col++) {
				System.out.print(x+" ");
				x++;
			}
			x = row+1;
			System.out.println();
		}

	}

}
