package baitap72;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PolyLine l1 = new PolyLine();
        System.out.println("Ban đầu: " + l1);

        l1.appendPoint(1, 1);
        l1.appendPoint(new Point(2, 2));
        l1.appendPoint(3, 3);

        System.out.println("Sau khi thêm điểm: " + l1);
        System.out.println("Tổng chiều dài: " + l1.getLength());

        List<Point> pointsList = new ArrayList<>();
        pointsList.add(new Point(0, 0));
        pointsList.add(new Point(4, 0));
        pointsList.add(new Point(4, 3));

        PolyLine l2 = new PolyLine(pointsList);
        System.out.println("\nĐường gấp khúc l2: " + l2);
        System.out.println("Tổng chiều dài l2: " + l2.getLength());
    }
}
