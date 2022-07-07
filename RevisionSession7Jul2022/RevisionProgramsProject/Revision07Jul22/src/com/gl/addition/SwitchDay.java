package com.gl.addition;

public class SwitchDay {
	
	public void switchDay(String day)
	{
		switch(day)
		{
			case "one":
			{
				System.out.println("The Day is Sunday ");
				break;
			}
			case "two":
			{
				System.out.println("The Day is Monday ");
				break;
			}
			case "three":
			{
				System.out.println("The Day is Tuesday ");
				break;
			}
			case "four":
			{
				System.out.println("The Day is Wednesday ");
				break;
			}
			case "five":
			{
				System.out.println("The Day is Thursday ");
				break;
			}
			case "six":
			{
				System.out.println("The Day is Friday ");
				break;
			}
			case "seven":
			{
				System.out.println("The Day is Saturday ");
				break;
			}
			default:
			{
				System.out.println("Valid Range is 1-7 ");
				break;
			}
		}
	}

}
