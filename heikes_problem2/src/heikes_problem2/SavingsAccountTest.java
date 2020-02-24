package heikes_problem2;

public class SavingsAccountTest 
{
	public static void main(String[] args)
	{
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		SavingsAccount.modifyInterestRate(.04);
		
		for (int i = 1; i <= 12; i++)
		{
			System.out.println("Saver1 - Month " + i + " - balance: " + saver1.calculateMonthlyInterest());
		}
		System.out.println();
		for (int i = 1; i <= 12; i++)
		{
			System.out.println("Saver2 - Month " + i + " - balance: " + saver2.calculateMonthlyInterest());
		}
		
		SavingsAccount.modifyInterestRate(.05);
		
		System.out.println();
		System.out.println("Saver1 - Month 13 - balance: " + saver1.calculateMonthlyInterest());
		System.out.println("Saver2 - Month 13 - balance: " + saver1.calculateMonthlyInterest());
	}
}
