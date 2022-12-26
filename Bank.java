import  java.util.*;
import java.util.regex.*;
public class Bank implements ATM {
	
 private static int newbalance;
	private static int i = 0;
	private static int newb;
	private static char dot;
	private static int newam;
	private static int newbalance1;
	private static int newamount;
	private static int deposit;
	private static String newname;
	private static String acct;
	private static String newacct ;
	private static int amount;
	private static int amount1;
	private static int cash;
	private static int newbalance2;
	static private Date date = new Date();
	Bank() {
    }
	public void setAmount(int newamount) {
	  newamount = newamount;	
		newbalance = newamount;
	}
	public void setName(String name) {
		newname = name;
	}
	@Override
	public void withdrawCash()
	{
		String acc = "0549933017";
		String replacement = "******";
		Pattern p = Pattern.compile("[0-9]{6}");
		Matcher m = p.matcher(acc);
		boolean found = m.find();
		if(found) {
			newacct = m.group();
			acct = acc.replaceFirst(newacct,replacement);
			newacct = acct;
		}
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Your Withdrawal Amount: $:");
		amount = sc.nextInt();
		newam = amount;
		if(deposit == 0 && amount1 == 0) {
	    cash = newbalance - amount;
	    }
		else {
	    newb = getBalance();
		cash = newb - amount;
		}
	    System.out.println(
	         "Name: "+newname+"\nAcct Num: "+acct+"\nAmount Withdrawed: $"+newam+"\nBalance: $"+cash+"\nDate & Time : "+ date.toString());
		  System.out.print("Connecting To Server");
		  char[] arr = new char[]{'.','.','.','.','.'};
		   for(i = 0; i < arr.length;i++) {
			dot = arr[i];
			List<Character> lsut = new ArrayList<>();
			lsut.add(dot);
			for(char c : lsut) {
			 try {
				System.out.print(c);
			  
		    Thread.sleep(700);}catch(Exception e) {
			 }
			 }
			 }
			 System.out.println("\nCash Withdrawal Successfully!");
	         newbalance1 += cash;
}
	@Override
	public void deposit()
	{  
		 Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Your Deposit Amount: $:");
		amount1 = sc.nextInt();
		if(newbalance1 != 0) {
		deposit = amount1 + newbalance1;
		newbalance2 = deposit;
		System.out.println("Deposit Amount $: "+amount1 +"\nBalance $: "+newbalance2+ "\nDate & Time: "+date.toString());
		System.out.print("Connecting To Server");
		char[] arr = new char[]{'.','.','.','.','.'};
		for(i = 0; i < arr.length;i++) {
			dot = arr[i];
			List<Character> lsut = new ArrayList<>();
			lsut.add(dot);
			for(char c : lsut) {
				System.out.print(c);
			}  
		try{Thread.sleep(700);}catch(Exception e) {}
		}
		System.out.println("\nTransaction Successful!!");
	  }
	  else {
		  deposit = amount1 + newbalance;
		  newbalance2 = deposit;
		  System.out.println("Deposit Amount $: "+amount1 +"\nBalance $: "+newbalance2+ "\nDate & Time: "+date.toString());
		  System.out.print("Connecting To Server");
		  char[] arr = new char[]{'.','.','.','.','.'};
		  for(i = 0; i < arr.length; i++) {
			  dot = arr[i];
			  List<Character> lsut = new ArrayList<>();
			  lsut.add(dot);
			  for(char c : lsut) {
				  System.out.print(c);
			  }  
			  try{Thread.sleep(700);}catch(Exception e) {}
		  }
		  System.out.println("\nTransaction Successful!!");
		  
	  }
	}
	@Override
	public int getBalance()
	{
		if(amount1 != 0 && newbalance1 == 0) {
		   System.out.println("Acct Name:"+newname);
			 System.out.println("Date & time: "+date.toString());
			 return newbalance2;
		}
		else if(amount != 0 && newbalance2 == 0) {
	  	System.out.println("Acct Name:"+newname);
			System.out.println("Date & time: "+date.toString());
		  return newbalance1;
		}
		else if(amount1 != 0 && newbalance1 != 0) {
		   System.out.println("Acct Name:"+newname);
			 System.out.println("Date & time: "+date.toString());
			return newbalance1;
		}
		else {
			}
		 return -1;
		}
	}
