package baitap31;

public class MyComplex {
    public double real = 0.0;
    public double imag = 0.0;
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real = real;
    }
    public double getImag(){
        return imag;
    }
    public void setImag(double imag){
        this.imag = imag;
    }
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public String toString(){
        return real + "+" + imag;
    }
    public boolean isReal(){
        return imag == 0.0;
    }
    public boolean isImaginary(){
        return real == 0.0;
    }
    public boolean equals(double real, double imag){
        return (this.real == real && this.imag == imag);

    }
    public boolean equals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }
    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }
    public MyComplex addInto(MyComplex right){
        this.real = this.real + right.getReal();
        this.imag = this.imag + right.getImag();
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        double newReal = this.real + right.getReal();
        double newImag = this.imag + right.getImag();
        return new MyComplex(newReal, newImag);
    }

}

