public class Factory extends Bank {
	 Bank bank = new Bank();
	public void ATMInterface(String OperationType) {
	if(OperationType.equalsIgnoreCase("Withdraw")) {
       bank.withdrawCash();
	}
	else if(OperationType.equalsIgnoreCase("getBalance")) {
	  System.out.println( "Acct Balance: $"+bank.getBalance());
	}
	else if(OperationType.equalsIgnoreCase("deposit")) {
		bank.deposit();
	}
	else if(OperationType.equalsIgnoreCase("Exit")) {
		System.out.println("Exiting.....");
		try{Thread.sleep(1000);}catch(Exception e) {}
		System.out.println("Thanks For Using ACN Bank App!");
		try{Thread.sleep(1000);}catch(Exception e) {}
	 	System.exit(0);
	}
	else {
	 System.out.println( "Invalid Operation Type");
	 }
	}
	}	
