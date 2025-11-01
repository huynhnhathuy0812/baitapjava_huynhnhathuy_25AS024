package baitap34;

public class TestMain {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Thời gian hiện tại: " + time);

        time.nextSecond();
        System.out.println("Sau nextSecond: " + time);

        time.previousMinute();
        System.out.println("Sau previousMinute: " + time);

        time.nextHour();
        System.out.println("Sau nextHour: " + time);
    }
}