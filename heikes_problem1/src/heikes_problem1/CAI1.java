package heikes_problem1;

import java.io.Console;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 
{
	private static Scanner scanner = new Scanner(System.in);
	private static SecureRandom RNG = new SecureRandom();
	
	public static void main(String[] args) 
	{
		quiz();
	}
	
	private static void quiz()	
	{
		int numOne = RNG.nextInt(10);
		int numTwo = RNG.nextInt(10);
		
		do 
		{
			askQuestion(numOne, numTwo);
		} 
		while (!isAnswerCorrect(readResponse(), numOne, numTwo));
		
		
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
		System.out.println("Very good!");
	}
	
	private static void displayIncorrectResponse()
	{
		System.out.println("No. Please try again.");
	}
	
}
