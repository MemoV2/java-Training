package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1= new BankAccount("465329874", 1000);
		BankAccount acc2= new BankAccount("879746131", 2000.50);
		BankAccount acc3= new BankAccount("159375198", 3000);
		BankAccount acc4= new BankAccount("951147845", 4000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}
class BankAccount implements IInterest {
	// properties of back account
	private static int ID = 1000; // internal ID
	private String AccountNumber; //ID + 2 random digit Num + first 2 of the ssn
	static private final String RoutingNumber = "005400657";
	private String Name;
	private String Ssn;
	private Double Balance;
	
	//constructor
	public BankAccount(String Ssn, double initDeposit){
		Balance = initDeposit;
		this.Ssn = Ssn;
		ID++;
		setAccountNumber();
	}
	private void setAccountNumber(){
		int random = (int) (Math.random() * 100 + 1);		
		AccountNumber = ID+ "" + random + Ssn.substring(0,2);
		System.out.println("Account number is: " + AccountNumber);
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public String getName(){
		return Name;
	}
	public void payBill(double amount){
		Balance = Balance - amount;
		System.out.println("Paying bill of: " + amount);
		showBalance();
	}
	public void makeDeposit(double amount){
		Balance = Balance + amount;
		System.out.println("Making deposit of: " + amount);
		showBalance();
	}
	public void showBalance(){
		System.out.println("Current balance is: " + Balance);
	}
	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		Balance = Balance * (1 + rate/100);
		showBalance();
	}
	@Override
	public String toString(){
		return "[Name: " + Name + "]\n[Account Number: " + AccountNumber + "]\n" + "[routing number: " + RoutingNumber + "]\n" + "[Balance: " +  Balance + "]";
	}
}