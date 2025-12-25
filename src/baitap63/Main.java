package baitap63;

public class Main {
    public static void main(String[] args) {
        Movable p1 = new MovablePoint(0, 0, 5, 10);
        System.out.println("Bắt đầu: " + p1);

        p1.moveUp();
        System.out.println("Sau khi moveUp: " + p1);

        p1.moveRight();
        System.out.println("Sau khi moveRight: " + p1);

        p1.moveDown();
        p1.moveLeft();
        System.out.println("Kết quả cuối cùng: " + p1);
    }
}
