package v1ch14.bounce;

import v1ch14.bounce.Ball;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * BallComponent
 * @version 1.0 2018-02-10
 * @author Michael
 */

public class BallComponent extends JPanel{
    private static final int DEAFAULT_WIDTH = 450;
    private static final int DEAFAULT_HEIGHT = 350;

    private java.util.List<Ball> balls = new ArrayList<>();

    public void add(Ball b)
    {
        balls.add(b);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Ball b : balls)
        {
            g2.fill(b.getShape());
        }
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(DEAFAULT_WIDTH, DEAFAULT_HEIGHT);
    }
}
