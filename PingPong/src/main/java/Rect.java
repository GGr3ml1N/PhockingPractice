import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rect {
    public double x, y, wight, height;
    public Color color;

    public Rect(double x, double y, double wight, double height, Color color) {
        this.x = x;
        this.y = y;
        this.wight = wight;
        this.height = height;
        this.color = color;

    }

    public void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fill(new Rectangle2D.Double(x, y, wight, height));

    }
}
