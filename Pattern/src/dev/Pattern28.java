package dev;

public class Pattern28 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a = 25,b = 42;
//		int c = add(a,b);
//		System.out.println("Square of the number:"+c);
//		//System.out.println("Hello");
		for(int row = 1;row <= 5;row++) {
			for(int col = 1;col <= 5;col++) {
				System.out.print(row % col+" ");
			}
			System.out.println();
		}
	}

}
