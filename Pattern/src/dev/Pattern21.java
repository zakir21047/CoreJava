package dev;

public class Pattern21 {

	public static void main(String[] args) {
		int n = 5,x;
		/*for(int row = 1;row <= 5;row++) {
			for(int col = 1;col <= 5;col++) {
				System.out.print(x+ " ");
				x = x + 5;
			}
			x = row+1;
			System.out.println();
		}*/
		for(int i = 1;i <= n;i++) {
			x = i;
			for(int j = 1;j <= n;j++) {
				System.out.print(x+" ");
				x += n;
			}
			System.out.println();
		}

	}

}
/*1 6 11 16 21 
2 7 12 17 22 
3 8 13 18 23 
4 9 14 19 24 
5 10 15 20 25 
*/
