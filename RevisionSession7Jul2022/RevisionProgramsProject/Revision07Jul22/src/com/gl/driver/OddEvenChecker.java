package com.gl.driver;

import java.util.Scanner;

import com.gl.addition.CheckOddEvenNo;

public class OddEvenChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reply = "yes";
		Scanner scan1 = new Scanner(System.in);
		CheckOddEvenNo checkN = new CheckOddEvenNo();
		while(reply.equals("yes"))
		{
				
			int num;
			System.out.println("Enter a Number ");
			num = scan1.nextInt();
			checkN.checkIfEven(num);
			checkN.checkIfOdd(num);
			
			System.out.println("Do You wish to continue yes/no");
			reply = scan1.next();
		}
		System.out.println("You are out of loop");
		

	}

}
