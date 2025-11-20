package baitap51;

public class LineSub extends Point {
    private Point end;

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public LineSub(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        setXY(begin.getX(), begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLength() {
        return getBegin().distance(end);
    }

    public String toString() {
        return "LineSub[begin=" + getBegin() + ", end=" + end + "]";
    }
}