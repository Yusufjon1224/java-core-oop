package oop.encapsulation.pure;

public class Customer {

    private final String name;
    private final BankAccount account;

    public Customer(String name, BankAccount account) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name required");
        }
        if (account == null) {
            throw new IllegalArgumentException("Account required");
        }

        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    // NO direct balance manipulation
    public double getBalance() {
        return account.getBalance();
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}

