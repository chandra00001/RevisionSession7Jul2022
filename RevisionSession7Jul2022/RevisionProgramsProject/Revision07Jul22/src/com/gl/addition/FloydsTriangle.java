package com.gl.addition;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4, number = 1;
		
		for(int i=1;i<= rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(number+" ");
				++number;
			}
			System.out.println();
		}
		

	}

}
