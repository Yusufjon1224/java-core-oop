package oop.encapsulation.pure;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC123", 1000);
        Customer customer = new Customer("Ali", account);

        customer.deposit(500);
        customer.withdraw(200);

        System.out.println(customer.getBalance()); // 1300
    }
}
