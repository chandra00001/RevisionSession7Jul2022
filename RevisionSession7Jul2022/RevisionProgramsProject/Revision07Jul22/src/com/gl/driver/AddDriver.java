package com.gl.driver;

import java.util.Scanner;

import com.gl.addition.Adder;

public class AddDriver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan1 = new Scanner(System.in);
		int x,y;
		System.out.println("Enter The First Number");
		x = scan1.nextInt();
		
		System.out.println("enter the Second Number");
		y = scan1.nextInt();
		
		Adder adder = new Adder();
		adder.addNumber(x, y);
		

	}

}
