package baitap16;

public class Account {
    public String id, name;
    public int balance = 0;
    public Account (String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Account(String id, String name) {
        this(id, name, 0);
    }
    public String id () {
        return id;
    }
    public String name () {
        return name;
    }
    public int balance () {
        return balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        this.balance += amount;
        return balance;
    }
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;

        }
        else {
            System.out.println("Amount exceeded blance");

        }
        return balance;
    }
    public String toString(){
        return "Account[id= " + id + ", name= " + name + ", balance= " + balance + "]";
    }

    public String getID() {
    }
}
