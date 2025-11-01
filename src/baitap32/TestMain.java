package baitap32;

public class TestMain {
    public static void main(String[] args) {

        MyPolynomial poly1 = new MyPolynomial(1, 2, 3);


        System.out.println("Polynomial: " + poly1.toString());


        System.out.println("Degree: " + poly1.getDegree());


        double x = 2.0;
        System.out.println("Evaluate at x = " + x + ": " + poly1.evaluate(x));


        MyPolynomial poly2 = new MyPolynomial(0, 0, 5, 0, 4);
        System.out.println("\nPolynomial: " + poly2.toString());
        System.out.println("Degree: " + poly2.getDegree());
        System.out.println("Evaluate at x = " + x + ": " + poly2.evaluate(x));
    }
}

