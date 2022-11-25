package je3.classes;

/**
 * Java Examples in a Nutshell Chap2 Exercise1
 * @version 1.0 2018-02-04
 * @author Michael
 */

class Circle {
    public int x, y, r;

    public Circle(int x, int y, int r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle(int r)
    {
        this(0, 0, r);
    }

    public Circle()
    {
        this(0, 0, 0);
    }

    public void move(int deltax, int deltay)
    {
        x += deltax;
        y += deltay;
    }

    public boolean isInside(int xi, int yi)
    {
        return ((xi >= x - r) && (xi <= x + r) && (yi >= y - r) && (yi <= y + r));
    }

    public Rect boundingBox()
    {
        return new Rect(x - r, y -  r, x + r, y + r);
    }

}

public class Exercise1 {
    public static void main(String[] args)
    {
        Circle c = new Circle(4, 7, 5);
        c.move(2, 3);
        if (c.isInside(7, 4))
            System.out.println("(" + 7 + "," + 4 +
                    ") is inside the union");
        System.out.println(c.boundingBox());
    }

}
