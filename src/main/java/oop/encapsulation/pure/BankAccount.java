package oop.encapsulation.pure;

public class BankAccount {

    private final String accountNumber;   // immutable
    private double balance;               // protected state

    public BankAccount(String accountNumber, double initialBalance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number required");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // READ-ONLY access (no setter)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // CONTROLLED state changes
    public void deposit(double amount) {
        validateAmount(amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        validateAmount(amount);

        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }

        balance -= amount;
    }

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}

