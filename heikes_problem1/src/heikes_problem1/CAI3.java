package heikes_problem1;

import java.io.Console;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 
{
	private static Scanner scanner = new Scanner(System.in);
	private static SecureRandom RNG = new SecureRandom();
	
	public static void main(String[] args) 
	{
		quiz();
	}
	
	private static void quiz()	
	{
		int numOne;
		int numTwo;
		int numCorrect = 0;
		
		for (int i = 0; i < 10; i++)
		{
			numOne = RNG.nextInt(10);
			numTwo = RNG.nextInt(10);
			
			askQuestion(numOne, numTwo);
			if (isAnswerCorrect(readResponse(), numOne, numTwo))
			{
				numCorrect++;
			}
		}
		
		displayCompletionMessage(numCorrect);
		
		System.out.println("Do you want to continue? Enter \"yes\" to continue or \"no\" (or anything else) to quit.");
		
		
		scanner.nextLine();
		String continueResponse = scanner.nextLine();
		
		if (continueResponse.equalsIgnoreCase("yes"))
		{
			quiz();
		}
		
		
	}
	
	private static void askQuestion(int numOne, int numTwo) 
	{
		System.out.println("How much is " + numOne + " times " + numTwo + "?");
	}
	
	private static int readResponse()
	{
		return scanner.nextInt();
	}
	
	private static boolean isAnswerCorrect(int response, int numOne, int numTwo)
	{
		if ((numOne * numTwo) == response)
		{
			displayCorrectResponse();
			return true;
		}
		else
		{
			displayIncorrectResponse();
			return false;
		}
	}
	
	private static void displayCorrectResponse()
	{
		switch (RNG.nextInt(4) + 1)
		{
			case 1:	System.out.println("Very good!"); break;
			case 2:	System.out.println("Excellent!"); break;
			case 3:	System.out.println("Nice work!"); break;
			case 4:	System.out.println("Keep up the good work!"); break;
		}
		
	}
	
	private static void displayIncorrectResponse()
	{
		switch (RNG.nextInt(4) + 1)
		{
			case 1:	System.out.println("No. Please try again."); break;
			case 2:	System.out.println("Wrong. Try once more."); break;
			case 3:	System.out.println("Don�t give up!"); break;
			case 4:	System.out.println("No. Keep trying."); break;
		}
	}
	
	private static void displayCompletionMessage(int numCorrect)
	{
		double percentCorrect = (((double)numCorrect)/10.0 * 100.0);
		System.out.println("Your score is: " + percentCorrect + "%");
		
		if (percentCorrect >= 75.0)
		{
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else
		{
			System.out.println("Please ask your teacher for extra help.");
		}
	}
	
}
