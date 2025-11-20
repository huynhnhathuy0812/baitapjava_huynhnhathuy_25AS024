package baitap51;

public class TestLine {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        Line line1 = new Line(p1, p2);

        System.out.println(line1);  // Line[begin=(1,2), end=(4,6)]
        System.out.println("Length: " + line1.getLength());

        Line line2 = new Line(0, 0, 3, 4);
        System.out.println(line2);  // Line[begin=(0,0), end=(3,4)]
        System.out.println("Length: " + line2.getLength());  // 5.0
    }
}