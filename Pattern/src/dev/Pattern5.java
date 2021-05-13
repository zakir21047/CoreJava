package dev;
/*
A 
B C
D E F
G H I J
K L M N O*/

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 65;
		for(int i = 1;i<=5;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				char c = (char) a;
				System.out.print(c+" ");
				a++;
			}
			System.out.println();
		}

	}

}
