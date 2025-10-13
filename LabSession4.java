abstract class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void deposit(double amount) {
        balance += amount;
        balance += balance * interestRate / 100;
    }

    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance");
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) balance -= amount;
        else System.out.println("Exceeded overdraft limit");
    }
}

public class LabSession4.java {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount("S001", 5000, 5);
        Account a2 = new CurrentAccount("C001", 2000, 1000);

        a1.deposit(1000);
        a1.withdraw(2000);
        a2.deposit(500);
        a2.withdraw(2500);

        a1.displayBalance();
        a2.displayBalance();
    }
}

