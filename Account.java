import java.util.Scanner;

public class Account {
    int accountNumber;
    int balance;
    String accountHolderName;

    Account(int accountNumber, int balance, String accountHolderName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(int amount){
        System.out.println("Your previous balance: "+this.balance);
        this.balance += amount;
        System.out.println("Your new balance: "+this.balance);
    }
    public void withdraw(int amount){
        System.out.println("Your previous balance: "+this.balance);
        this.balance -= amount;
        System.out.println("Your new balance: "+this.balance);
    }
    public void checkBalance(){
        System.out.println("Your balance: "+this.balance);
    }
    public void transfer(){
        System.out.println("Please enter account number you would like to send money to: ");
        Scanner scanner = new Scanner(System.in);
        int targetAccount = scanner.nextInt();

        System.out.println("Please enter the amount you would like to send: ");
        int amount = scanner.nextInt();

        System.out.println("Confirmation:\n You would like to send money to: "+targetAccount+"\nThe amount: "+amount+"\n");

    }
}
