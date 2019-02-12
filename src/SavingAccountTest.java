import java.time.Month;
import java.util.Scanner;;
public class SavingAccountTest {
public static void main(String [] args) {
Scanner scanner =new Scanner(System.in);

double userAnnualInterestrate;
double userStartingBalance;
int userNumberOfMonths;
double depositAmount;
double withdrawAmount;
double totalDeposits=0;
double totalWithdrawals=0;
double totalInterestearned=0;

System.out.println("Please enter the annual interest rate");
userAnnualInterestrate = scanner.nextDouble();

System.out.println("Please enter the starting balance:");
userStartingBalance = scanner.nextDouble();

System.out.println("Please enter the number of months:");
userNumberOfMonths =scanner.nextInt();

SavingAccount account1= new SavingAccount(userStartingBalance);
account1.setAnnualInterestRate(userAnnualInterestrate);

for(int currentMonth = 1; currentMonth <= userNumberOfMonths; currentMonth++) {
	System.out.println("How much did you deposit during month" + currentMonth);
	depositAmount = scanner.nextDouble();
	totalDeposits += depositAmount;
	
	account1.deposit(depositAmount);
	
	System.out.println("How much did you withdraw during month" +currentMonth);
	withdrawAmount =scanner.nextDouble();
	totalWithdrawals +=withdrawAmount;
	
	account1.withdraw(withdrawAmount);
	
	totalInterestearned += account1.addMonthyinterest();
	
}
System.out.printf("The final balance at the end of %d month is %f,.2f\n The total amount of deposits: $%, .2f\n" + 
"The total amount of withdrawals: $%,.2f\n The totalInterestearned: $%, .2f",userNumberOfMonths,
account1.getbalance(),totalDeposits,totalWithdrawals,totalInterestearned);

}
}