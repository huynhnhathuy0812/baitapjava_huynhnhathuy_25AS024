package baitai21;

public class TestMain {
    public static void main(String[] args) {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(a1);

        Book b1 = new Book("Java for Dummy", a1, 19.95, 1000);
        System.out.println(b1);

        b1.setPrice(29.95);
        b1.setQty(888);
        System.out.println("name: " + b1.getName());
        System.out.println("price: " + b1.getPrice());
        System.out.println("qty: " + b1.getQty());
        System.out.println("author: " + b1.getAuthor());
        System.out.println("author's name: " + b1.getAuthor().getName());
        System.out.println("author's email: " + b1.getAuthor().getEmail());
    }
}
