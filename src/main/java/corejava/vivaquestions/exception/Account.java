package corejava.vivaquestions.exception;

public class Account 
{
	int balance;
	public Account(int balance)
	{
		this.balance=balance;
	}
	
	public void withdraw(int ammount) throws InsufficiantBalanceException
	{
		if(ammount>(balance-1000))
		{
			throw new InsufficiantBalanceException("Insufficiant Balance");
		}
		
	}
	
}
	