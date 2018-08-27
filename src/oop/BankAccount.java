package oop;

public class BankAccount implements IRate {
	//Define Variables
	String accountNumber;
	
	//static >> belongs to the CLASS, not the object instance
	//final  >> Constant (often static final)
	private static final String routingNumber = "012345";
	
	//instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	//Constructor definitions
		//1. define/ set up/ initialize properties of an object
		//2. constructors are IMPLICITY called upon INSTATIATION
		//3. the same name as the class itself
		//4. constructors have no return type at all
	BankAccount (){
		System.out.println("New account created");
	}
	BankAccount (String accountType){
		System.out.println("New Account: " + accountType);
	}
	BankAccount (String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all local variables
		System.out.println("New Account: " + accountType);
		System.out.println("Initial deposit of: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000){			
			Msg = "Error: minimum deposit must be of $1,000.00";			
		}
		else {
			Msg = "Thanks for your initial deposit of $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	//getters / and setters
	
	//allow the user to define a name
	
	public void setName(String name){
		this.name = "Mr. " +  name;
	}
	
	public String getName(){
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	
	//interface methods
	public void setRate(){
		System.out.println("setting rate");
	}
	
	public void increaseRate(){
		System.out.println("increasing rate");
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	//Overloading call same methods  with different arguments 
	

	//define methods
	public void deposit(double amount){
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	
	void withDraw(double amount){
		balance = balance + amount;
		showActivity("withDraw");
	}
	//private: can only be called within the class 
	private void showActivity(String activity){
		System.out.println("Recent transaction is: " + activity);
		System.out.println("Your new balance is: $" + balance);
	}
	
	void checkBalance(){		
		System.out.println("current balance is :" + balance); 
	}
	void getStatus(){
		
	}
	@Override
	public String toString(){
		return "[ Name: " + name + ". Account#" + accountNumber + ".Routing #" +routingNumber + ". Balance: $" + balance + " ]";
	}
}
