public class StudentAccount extends Account{

    boolean isStudent = true;
    StudentAccount(int accountNumber, int balance, String accountHolderName, boolean isStudent) {
        super(accountNumber, balance, accountHolderName);
        this.isStudent = isStudent;
    }

}
