import  java.util.*;
public class BankApp {
	 static int i = 0;
	public static void main(String[] args) {
		 
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Available Bank Operation:\n\n"+"\n1. Withdraw \n2. GetBalance \n3. Deposit \n4. Exit\n\n ");
	System.out.println("Enter Your Name To Perform Bank Operation:");
	String name = sc.next();
	System.out.println("Welcome "+name+" To ACN Bank");
	for(i = 1; i <= 4; i++) {
	System.out.println("Enter OperationType:");
	String operation = sc.next(); 

	Bank bank = new Bank();
	bank.setName(name);
	bank.setAmount(10000);
    Factory fact = new Factory();
	fact.ATMInterface(operation);
	
	
	String a = i == 4 ? "Limited Trials Reached, Try Again!\nThanks For Using ACN Bank App": "";
	System.out.println(a);
}
}
}