package baitap31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập hai số phức
        System.out.print("Nhập số phức 1 (thực và ảo): ");
        MyComplex c1 = new MyComplex(sc.nextDouble(), sc.nextDouble());

        System.out.print("Nhập số phức 2 (thực và ảo): ");
        MyComplex c2 = new MyComplex(sc.nextDouble(), sc.nextDouble());

        // Hiển thị và kiểm tra
        System.out.println("Số 1 là: (" + c1 + "i)");
        System.out.println(c1.isReal() ? "Là số thực thuần tuý" : "KHÔNG phải là số thực thuần tuý");
        System.out.println(c1.isImaginary() ? "Là số ảo thuần tuý" : "KHÔNG phải là số ảo thuần tuý");

        System.out.println("Số 2 là: (" + c2 + "i)");
        System.out.println(c2.isReal() ? "Là số thực thuần tuý" : "KHÔNG phải là số thực thuần tuý");
        System.out.println(c2.isImaginary() ? "Là số ảo thuần tuý" : "KHÔNG phải là số ảo thuần tuý");

        // So sánh và cộng
        System.out.println(c1.equals(c2) ? "Hai số bằng nhau" : "Hai số KHÔNG bằng nhau");
        System.out.println("Tổng: (" + c1.addNew(c2) + "i)");
    }
}
