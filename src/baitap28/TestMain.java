package baitap28;

public class TestMain {
        public static void main(String[] args) {
            MyCircle c1 = new MyCircle(1, 2, 5);
            MyCircle c2 = new MyCircle(new MyPoint(4, 6), 10);

            System.out.println(c1);
            System.out.println("Area: " + c1.getArea());
            System.out.println("Circumference: " + c1.getCircumference());
            System.out.println("Distance between centers: " + c1.distance(c2));
        }


}
