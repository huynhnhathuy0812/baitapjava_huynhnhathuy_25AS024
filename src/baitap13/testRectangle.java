package baitap13;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        System.out.println(r1);
        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("chiều dài là: " + r1.getLength());
        System.out.println("chiều rộng là: " + r1.getWidth());

        // Kiểm tra getArea() và getPerimeter()
        System.out.printf("diện tích là: %.2f%n", r1.getArea());
        System.out.printf("chu vi là: %.2f%n", r1.getPerimeter());
    }

}
