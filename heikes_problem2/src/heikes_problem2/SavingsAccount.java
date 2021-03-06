package heikes_problem2;

public class SavingsAccount 
{
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount(double SB)
	{
		savingsBalance = SB;
	}
	
	public double calculateMonthlyInterest()
	{
		savingsBalance = savingsBalance + ((savingsBalance * annualInterestRate) / 12);
		return savingsBalance;
	}
	
	public static void modifyInterestRate(double AIR)
	{
		annualInterestRate = AIR;
	}
}
