package baitap25;

public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Tan Ah Teck", 'm');
        System.out.println(c1);

        Account a1 = new Account(1001, c1, 888.8);
        System.out.println(a1);

        a1.deposit(100.0);
        System.out.println(a1);

        a1.withdraw(200.0);
        System.out.println(a1);

        a1.withdraw(2000.0);
    }
}
