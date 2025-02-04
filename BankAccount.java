public class BankAccount{

	static String bankName = "Bank of India";
	private String accountHolderName;
	private final int accountNumber;
	static int TotalAccounts =0;

	public BankAccount(String accountHolderName, int accountNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		TotalAccounts++;
	}
	public static void getTotalAccounts(){
		System.out.println("The total number of Accounts :- "+ TotalAccounts);
	}

	public void displayDetails(){
		if(this instanceof BankAccount){
			System.out.println("Bank Name"+ bankName);
			System.out.println("The name of account holder : "+ accountHolderName);
			System.out.println("The account number : "+ accountNumber);
		}
	}

	public static void main(String[] args) {
		BankAccount User1 = new BankAccount("Divyanshu", 68789);
		BankAccount User2 = new BankAccount("prince", 28273);
		User1.displayDetails(); // display the details of User 1 
		User2.displayDetails(); // display the details of User 2
		BankAccount.getTotalAccounts(); // give the total number of Bank account
	}
}
