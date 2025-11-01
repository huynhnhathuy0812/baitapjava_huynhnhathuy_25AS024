package baitap210;

public class TestMain {
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle(2, 10, 9, 4); // đổi thông số tọa độ
        System.out.println(r1);

        System.out.println("Width: " + r1.getWidth());
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
    }
}