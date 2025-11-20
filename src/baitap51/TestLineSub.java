package baitap51;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub line1 = new LineSub(1, 2, 4, 6);
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());

        Point newBegin = new Point(0, 0);
        Point newEnd = new Point(3, 4);
        line1.setBegin(newBegin);
        line1.setEnd(newEnd);
        System.out.println("Updated: " + line1);
        System.out.println("New Length: " + line1.getLength());
    }
}