package baitap32;

public class MyPolynomial {
    private double[] coeffs;

    // Constructor dùng varargs
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }


    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public String toString() {
        String s = "";
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                s += coeffs[i] + "x^" + i;
                if (i != 0) s += " + ";
            }
        }
        return s;
    }
}
