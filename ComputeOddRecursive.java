//Developed by Aemun Ahmar
//CSCI 185-M03: Spring 2017
//Professor Hakkan Peckan
//Classwork 5: Compute Odd Digits in a Number
//March 30, 2017

import java.util.Scanner;

public class ComputeOddRecursive 
{
	public static int oddDigits(int n)
	{
		int oddCounter;
		
		if(n <= 0)
		{
			oddCounter = 0;
		} else if(n%2 == 1)
		{
			oddCounter = oddDigits(n/10) + 1;
		} else
		{
			oddCounter = oddDigits(n/10);
		}
		
		return oddCounter;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int num = Integer.parseInt(input.nextLine());
		
		System.out.println("Total number of odd digits: " + oddDigits(num));
		
		input.close();
	}
}
