package baitap45;

public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle() {
        super();
    }

    public ResizableCircle(double radius) {
        super(radius);
    }

    public ResizableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }


    @Override
    public void resize(int percent) {

        double newRadius = getRadius() * percent / 100.0;
        setRadius(newRadius);
    }

    @Override
    public String toString() {
        return "ResizableCircle with radius=" + getRadius() +
                ", which is a subclass of " + super.toString();
    }
}

