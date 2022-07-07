package com.gl.driver;

import java.util.Scanner;

import com.gl.addition.Calculator;

public class CalculatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		Calculator calci = new Calculator();
		
		/*public void accept()
		{
			
		}*/
	
		
		
		String reply = "yes";
		//() || (reply.equals("YES"))
		
		
		
		int result;
		while( (reply.equals("yes")) || (reply.equals("YES")))
		{
			System.out.println("----------MAIN MENU------------");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Division");
			System.out.println("4.Multiplication");
			int choice;
			System.out.println("Enter Your choice");
			choice = scan1.nextInt();
			switch(choice)
			{
				case 1:
				{
					int num1,num2;
					System.out.println("Enter the First Number ");
					num1 = scan1.nextInt();//200
					
					System.out.println("Enter the Second Number");
					num2 = scan1.nextInt();//50
					result = calci.add(num1, num2);
					System.out.println("Sum is "+result);
					break;
				}
				case 2:
				{
					int num1,num2;
					System.out.println("Enter the First Number ");
					num1 = scan1.nextInt();//200
					
					System.out.println("Enter the Second Number");
					num2 = scan1.nextInt();//50
					result = calci.subtract(num1, num2);
					System.out.println("Difference is "+result);
					break;
				}
				case 3:
				{
					int num1,num2;
					System.out.println("Enter the First Number ");
					num1 = scan1.nextInt();//200
					
					System.out.println("Enter the Second Number");
					num2 = scan1.nextInt();//50
					result = calci.divide(num1, num2);
					System.out.println("Dividend is "+result);
					break;
				}
				case 4:
				{
					int num1,num2;
					System.out.println("Enter the First Number ");
					num1 = scan1.nextInt();//200
					
					System.out.println("Enter the Second Number");
					num2 = scan1.nextInt();//50
					result = calci.multiply(num1, num2);
					System.out.println("Product is "+result);
					break;
				}
				default:
				{
					System.out.println("Sorry Valid Range of choice is 1-4");
					break;
				}
			
			}
			System.out.println("Do You wish to continue yes/no");
			reply = scan1.next();
		
		}
		System.out.println("You are out of loop..");
		
	}

}
