package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "06999";
		//acc1.name = "Memo";
		//with encapsulation: public API methods
		acc1.setName("Roger hue");
		acc1.setSsn("0699788");		
		System.out.println(acc1.getName());
		System.out.println("Ssn is: " + acc1.getSsn());
		
		acc1.balance = 10000;
		
		acc1.setRate();
		acc1.increaseRate();
		acc1.deposit(500);
		/*
		acc1.deposit(9000);
		acc1.deposit(6000);
		acc1.withDraw(10000);
		*/
		
		//Polymorphism thru overriding
		System.out.println(acc1.toString());
		
		//Polymorphism thru overloading
		BankAccount acc2 = new BankAccount("checking Account");
		BankAccount acc3 = new BankAccount("Savings Account" , 5000);
		/*
		acc3.checkBalance();
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "Cd Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
	}

}
