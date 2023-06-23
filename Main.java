import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String [] atmLocations = {"Istanbul", "Ankara", "Izmir"};

        int randCity = new Random(). nextInt(0, atmLocations.length);

        boolean randCashAvailable = new Random().nextBoolean();

        int randAtmId = new Random().nextInt(1, 20);

        Atm no1 = new Atm(atmLocations[randCity], randCashAvailable, randAtmId);

        System.out.println(no1.atmId);
        System.out.println(no1.getLocation());
        System.out.println(no1.cash_available);

        int accountNumGenerate = accountNumGenerate();
        int balance = 0;

        Account account1 = new Account(accountNumGenerate, balance, "Omer");
        int newAccountNum = accountNumGenerate();
        Account account2 = new Account(newAccountNum, 500000, "Ali");

        System.out.println("Account1 account number: "+account1.accountNumber);
        System.out.println("Account2 account number: "+account2.accountNumber);

        account1.transfer();

    }

    public static int accountNumGenerate(){
        return new Random(). nextInt(100000, 999999);
    }
}

