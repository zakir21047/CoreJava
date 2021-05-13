package dev;

public class Pattern25 {

	public static void main(String[] args) {
		for(int row = 1;row <= 5;row++) {
			for(int col = 1;col <= 5;col++) {
				/*if(col == row  ) {
					System.out.print(0+" "+1+" "+0+" "+1+" "+0+" ");
				}
				else {
					System.out.println(1+" "+0+" "+1+" "+0+" "+1+" ");
				}*/
				if((row+col) % 2 == 0) {
					System.out.print(0 +" ");
				}
				else {
					System.out.print(1+" ");
				}
				
			}
			System.out.println();
		}

	}

}
