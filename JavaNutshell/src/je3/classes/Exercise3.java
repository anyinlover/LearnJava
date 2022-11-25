package je3.classes;

import java.util.Objects;

/**
 * Java Examples in a Nutshell Chap2 Exercise3
 * @version 1.0 2018-02-04
 * @author Michael
 */

class Complex {
    private double x, y;

    public Complex(double real, double imaginary)
    {
        this.x = real;
        this.y = imaginary;
    }

    public double real() { return x; }

    public double imaginary() { return y;}

    public double magnitude() { return Math.sqrt(x*x + y*y); }

    public String toString() { return "{" + x + "," + y + "}"; }

    public static Complex add(Complex a, Complex b)
    {
        return new Complex(a.x + b.x, a.y + b.y);
    }

    public Complex add (Complex a)
    {
        return new Complex(this.x + a.x, this.y + a.y);
    }

    public static Complex multiply(Complex a, Complex b)
    {
        return new Complex(a.x*b.x - a.y*b.y, a.x*b.y + a.y+b.x);
    }

    public Complex multiply(Complex a)
    {
        return new Complex(this.x*a.x - this.y*a.y, this.x*a.y + this.y+a.x);
    }

    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        Complex other = (Complex) otherObject;
        return x == other.x && y == other.y;
    }

    public int hashCode()
    {
        return Objects.hash(x, y);
    }

}

public class Exercise3 {
    public static void main(String[] args)
    {
        Complex c1 = new Complex(4.5, 5.9);
        Complex c2 = new Complex(2.4, 4.8);
        if (c1.equals(c2))
            System.out.println("The complex numbers are equal.");
        else
            System.out.println("The complex numbers are not equal.");
        System.out.println(c1.hashCode());
    }


}
