package dev;

public class Pattern20 {

	public static void main(String[] args) {
		int x = 0;
		// TODO Auto-generated method stub
		for(int row = 1;row <= 5;row++) {
			for(int col = 1;col <= 5;col++) {
				/*if(row == 1) {
					System.out.print(col+" ");
				}
				else if(row == 2) {
					System.out.print(2*col+" ");
				}
				else if(row == 3) {
					System.out.print(3*col+" ");
				}
				else if(row == 4) {
					System.out.print(4*col+" ");
				}
				else {
					System.out.print(5*col+" ");
				}*/
				System.out.print(row*col+" ");
			}
			System.out.println();
		}

	}

}
/*1 2 3 4 5 
2 4 6 8 10 
3 6 9 12 15 
4 8 12 16 20 
5 10 15 20 25 
*/
