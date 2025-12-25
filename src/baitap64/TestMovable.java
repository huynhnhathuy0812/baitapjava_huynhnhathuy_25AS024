package baitap64;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println("Trước khi di chuyển (Point): " + m1);
        m1.moveLeft();
        System.out.println("Sau khi di chuyển sang trái: " + m1);

        Movable m2 = new MovableCircle(10, 10, 5, 5, 20);
        System.out.println("\nTrước khi di chuyển (Circle): " + m2);
        m2.moveDown();
        m2.moveRight();
        System.out.println("Sau khi di chuyển xuống và sang phải: " + m2);
    }
}
