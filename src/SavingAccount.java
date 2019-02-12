
public class SavingAccount {
	
	private  double annual_interest_rate;
	private double balance;
	private double monthlyInterest;
	
	public void withdraw(double userAmount) {
		balance -= userAmount;
	}
	
	public void deposit(double userAmount) {
		balance += userAmount;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public double addMonthyinterest() {
		double monthlyInterest= ((annual_interest_rate/12)*balance);
		
		balance +=monthlyInterest;
		return monthlyInterest;
	}
	public void setAnnualInterestRate(double newRate) {
		annual_interest_rate =newRate;	
	}
	public SavingAccount(double startingBalance) {
		balance = startingBalance;
		annual_interest_rate=0;
	}

}
