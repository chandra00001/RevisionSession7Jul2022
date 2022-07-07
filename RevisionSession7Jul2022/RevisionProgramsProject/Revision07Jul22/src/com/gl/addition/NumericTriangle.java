package com.gl.addition;

public class NumericTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		int rows1 = 5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
