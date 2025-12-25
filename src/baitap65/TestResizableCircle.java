package baitap65;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle rc = new ResizableCircle(100.0);
        System.out.println("Ban đầu: " + rc);
        System.out.println("Diện tích: " + rc.getArea());
        
        rc.resize(50);
        System.out.println("\nSau khi resize 50%:");
        System.out.println(rc);
        System.out.println("Bán kính mới: " + rc.radius);
        System.out.println("Diện tích mới: " + rc.getArea());
    }
}
