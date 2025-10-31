package baitap18;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time();
        System.out.println(t1);   // toString()

        // Bộ thiết lập và bộ lấy thử nghiệm
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);   // toString()
        System.out.println("Giờ: " + t1.getHour());
        System.out.println("Phút: " + t1.getMinute());
        System.out.println("Giây: " + t1.getSecond());

        // Kiểm tra setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);   // toString()

        // Kiểm tra nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        // Kiểm tra previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }

}
