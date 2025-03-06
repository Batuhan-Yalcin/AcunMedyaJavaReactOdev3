package BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("Batuhan Yalçın", 1000.0);
        BankAccount checking = new CheckingAccount("Muhammed İnan", 500.0);


        savings.calculateInterest();
        checking.calculateInterest();
    }
}
