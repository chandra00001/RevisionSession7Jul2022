package com.gl.addition;

public class ScoreTester {
	
	public void checkScore(int score1)
	{
		if ((score1 >=0) &&(score1 <=100))
		{
			if((score1 >= 50) && (score1 < 60))
			{
				System.out.println(" Good You Passed..");
			}
			else if((score1 >= 60) && (score1 < 70))
			{
				System.out.println(" Very Good You Secured First Class");
			}
			else if((score1 >= 70)&&(score1 <= 100))
			{
				System.out.println("Excellent You Secured Distinction..");
			}
			else
			{
				System.out.println("Sorry Try again");
			}
		}
		else
		{
			System.out.println("Sorry Valid Range of Score is 0-100");
		}
		
		
	}

}
