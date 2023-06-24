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
    public int transfer(int amount, Account targetAccount, Account currentAccount){

        System.out.println("Confirmation:\nYou would like to send money to: "+targetAccount+"\nThe amount: "+amount+"\n");

        targetAccount.balance += amount;
        currentAccount.balance -= amount;

        return targetAccount.balance;

    }
}
