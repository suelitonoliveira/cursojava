package application;

import entities.Account;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		/*
		 * Account acc = new Account(1001, "Alex", 1000.0); acc.withdraw(200.00);
		 * System.out.println(acc.getBalance());
		 * 
		 * Account acc2 = new SavingAccount(1002, "maria", 1000.0, 0.01);
		 * acc2.withdraw(200.0); System.out.println(acc2.getBalance());
		 * 
		 * 
		 * Account acc3 = new BussinessAccount(1003, "Bob", 1000.0, 500.0);
		 * acc3.withdraw(200.0); System.out.println(acc3.getBalance());
		 */
		
		
		
		/*
		 * // upcasting
		 * 
		 * Account acc1 = bacc; Account acc2 = new BussinessAccount(1003, "Bob", 0.0,
		 * 200.0); Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
		 * 
		 * // downcasting
		 * 
		 * BussinessAccount acc4 = (BussinessAccount)acc2; acc4.loan(100.0);
		 * 
		 * 
		 * // verifica se é instancia de BussinessAccount if (acc3 instanceof
		 * BussinessAccount) { BussinessAccount acc5 = (BussinessAccount)acc3;
		 * acc5.loan(200.0); System.out.println("Loan!"); }
		 * 
		 * if (acc3 instanceof SavingAccount) { SavingAccount acc5 =
		 * (SavingAccount)acc3; acc5.updateBalance(); System.out.println("Update!"); }
		 */
	}
		

}
