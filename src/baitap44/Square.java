package baitap44;

public class Square extends Rectangle {

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        // ensure both width and length changed
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        // make sure square stays square
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        // make sure square stays square
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
