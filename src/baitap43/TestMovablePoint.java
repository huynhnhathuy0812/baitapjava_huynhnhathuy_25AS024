package baitap43;

public class TestMovablePoint {
    public static void main(String[] args) {

        MovablePoint p1 = new MovablePoint(2.5f, 3.5f, 1.0f, 2.0f);
        System.out.println("Before move: " + p1);


        p1.move();
        System.out.println("After move 1: " + p1);

        p1.move().move();
        System.out.println("After move 3 times: " + p1);
    }
}

