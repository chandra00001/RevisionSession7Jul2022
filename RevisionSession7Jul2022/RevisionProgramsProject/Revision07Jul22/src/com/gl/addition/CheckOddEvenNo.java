package com.gl.addition;

public class CheckOddEvenNo {
	
	//200 % 10 =0  231 % 10 == 1
	public void checkIfOdd(int num1)
	{
		if( num1 % 2 == 1)
		{
			System.out.println(" Num1 "+num1+" Is Odd");
			
		}
		else
		{
			System.out.println(" Num1 "+num1+"Is Not Odd");
		}
	}
	public void checkIfEven(int num1)
	{
		if( num1 % 2 == 0)
		{
			System.out.println("NUm1 "+num1+" is Even");
		}
		else
		{
			System.out.println("Num1 is "+num1+" Is Not Even");
		}
	}

}
