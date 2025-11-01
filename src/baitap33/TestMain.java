package baitap33;

public class TestMain {
    public static void main(String[] args) {
        MyDate date = new MyDate(2024, 2, 28);
        System.out.println("Ngày hiện tại: " + date);

        date.nextDay();
        System.out.println("Sau nextDay: " + date);

        date.previousMonth();
        System.out.println("Sau previousMonth: " + date);

        date.nextYear();
        System.out.println("Sau nextYear: " + date);
    }
}
