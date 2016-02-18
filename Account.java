import java.text.NumberFormat;

public class Account{
	private final double RATE = 0.035; // interest rate of 3.5%
	
	private long acctNumber; //make up the account using names balances and account numbers
	private double balance;
	private String name;
	
	public Account(String owner, long account, double initial){
		name = owner;
		acctNumber = account;
		balance = initial; 
	}
	//deposit the amount into account
	
	public double deposit (double amount){
		balance = balance + amount;
		return balance;
	}
	public double withdraw (double amount, double fee){
		balance = balance - amount - fee;
		return balance;
	}
	//adds interst to the account and returns new balance 
	public double addInterest(){
		balance += (balance * RATE);
		return balance;
	}
	//returns the current balance 
	public double getBalance(){
		return balance;
		
	}
	//returns a one lined description of the account as a string 
	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
		
	}
	
}