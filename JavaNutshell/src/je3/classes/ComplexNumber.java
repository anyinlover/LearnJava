package je3.classes;


/**
 * Java Examples in a Nutshell Chap2 ComplexNumber
 * @version 1.0 2018-02-04
 * @author Michael
 */

public class ComplexNumber {
    private double x, y;

    public ComplexNumber(double real, double imaginary)
    {
        this.x = real;
        this.y = imaginary;
    }

    public double real() { return x; }

    public double imaginary() { return y;}

    public double magnitude() { return Math.sqrt(x*x + y*y); }

    public String toString() { return "{" + x + "," + y + "}"; }

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b)
    {
        return new ComplexNumber(a.x + b.x, a.y + b.y);
    }

    public ComplexNumber add (ComplexNumber a)
    {
        return new ComplexNumber(this.x + a.x, this.y + a.y);
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b)
    {
        return new ComplexNumber(a.x*b.x - a.y*b.y, a.x*b.y + a.y+b.x);
    }

    public ComplexNumber multiply(ComplexNumber a)
    {
        return new ComplexNumber(this.x*a.x - this.y*a.y, this.x*a.y + this.y+a.x);
    }

}
