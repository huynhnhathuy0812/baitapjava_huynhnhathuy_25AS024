package baitap29;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    // Constructor với tọa độ
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    // Constructor với 3 đối tượng MyPoint
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + "]";
    }

    // Tính chu vi
    public double getPerimeter() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);
        return d1 + d2 + d3;
    }

    // Xác định loại tam giác
    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);

        if (Math.abs(d1 - d2) < 1e-6 && Math.abs(d2 - d3) < 1e-6) {
            return "Equilateral"; // đều
        } else if (Math.abs(d1 - d2) < 1e-6 || Math.abs(d2 - d3) < 1e-6 || Math.abs(d3 - d1) < 1e-6) {
            return "Isosceles";   // cân
        } else {
            return "Scalene";     // thường
        }
    }
}

