class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws LowBalanceException {
        if(amount > balance) {
            throw new LowBalanceException("Insufficient balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class LAB6 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(6000);
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
