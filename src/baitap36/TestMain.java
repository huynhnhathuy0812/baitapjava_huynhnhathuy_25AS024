package baitap36;

public class TestMain {
    public static void main(String[] args) {
        Ball ball = new Ball(50.0f, 50.0f, 10, 5, 45);
        System.out.println("Vị trí ban đầu: " + ball);

        ball.move();
        System.out.println("Sau khi di chuyển: " + ball);

        ball.reflectHorizontal();
        ball.move();
        System.out.println("Sau khi phản chiếu ngang và di chuyển: " + ball);

        ball.reflectVertical();
        ball.move();
        System.out.println("Sau khi phản chiếu dọc và di chuyển: " + ball);
    }
}
