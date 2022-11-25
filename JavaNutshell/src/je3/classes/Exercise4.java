package je3.classes;

import java.util.Objects;

/**
 * Java Examples in a Nutshell Chap2 Exercise4
 * @version 1.0 2018-02-05
 * @author Michael
 */

class ComplexNum implements Comparable<ComplexNum> {
    private double x, y;

    public ComplexNum(double real, double imaginary)
    {
        this.x = real;
        this.y = imaginary;
    }

    public double real() { return x; }

    public double imaginary() { return y;}

    public double magnitude() { return Math.sqrt(x*x + y*y); }

    public String toString() { return "{" + x + "," + y + "}"; }

    public static ComplexNum add(ComplexNum a, ComplexNum b)
    {
        return new ComplexNum(a.x + b.x, a.y + b.y);
    }

    public ComplexNum add (ComplexNum a)
    {
        return new ComplexNum(this.x + a.x, this.y + a.y);
    }

    public static ComplexNum multiply(ComplexNum a, ComplexNum b)
    {
        return new ComplexNum(a.x*b.x - a.y*b.y, a.x*b.y + a.y+b.x);
    }

    public ComplexNum multiply(ComplexNum a)
    {
        return new ComplexNum(this.x*a.x - this.y*a.y, this.x*a.y + this.y+a.x);
    }

    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        ComplexNum other = (ComplexNum) otherObject;
        return x == other.x && y == other.y;
    }

    public int hashCode()
    {
        return Objects.hash(x, y);
    }

    public int compareTo(ComplexNum other)
    {
        return Double.compare(this.magnitude(),other.magnitude());
    }

}

public class Exercise4 {
    public static void main(String[] args)
    {
        ComplexNum c1 = new ComplexNum(4.56, 3.45);
        ComplexNum c2 = new ComplexNum(3.45, -4.56);
        System.out.println(c1.compareTo(c2));
    }
}
