package baitap37;

public class TestMain {
    public static void main(String[] args) {
        Ball ball = new Ball(50.0f, 50.0f, 0.0f);
        Player player1 = new Player(10, 45.0f, 50.0f);
        Player player2 = new Player(7, 30.0f, 30.0f);

        System.out.println(ball);
        System.out.println(player1);
        System.out.println(player2);

        player1.kick(ball);
        System.out.println(ball);

        player2.move(15, 20);
        player2.jump(1.5f);
        player2.kick(ball);
        System.out.println(ball);
    }
}
