package baitap37;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;
    private Ball ball;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0; // mặc định đứng trên mặt đất
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp) {
        z += zDisp;
    }

    public boolean near(Ball ball) {
        float dx = x - ball.getX();
        float dy = y - ball.getY();
        float dz = z - ball.getZ();
        double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
        return distance < 8;
    }

    public void kick(Ball ball) {
        if (near(ball)) {
            ball.setXYZ(ball.getX() + 10, ball.getY(), ball.getZ()); // đá bóng đi 10 đơn vị
            System.out.println("Player #" + number + " kicked the ball!");
        } else {
            System.out.println("Player #" + number + " is too far to kick the ball.");
        }
    }

    public String toString() {
        return String.format("Player #%d at (%.2f, %.2f, %.2f)", number, x, y, z);
    }
}

