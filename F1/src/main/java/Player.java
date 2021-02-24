import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {
    public static final int MAX_V = 50;
    public static final int MAX_TOP = 1;
    public static final int MAX_BOTTOM = 560;
    Image img_C = new ImageIcon("F1/res/pngtree-classic-old-luxury-car-design-png-image_1040384.jpg").getImage();
    Image img_L = new ImageIcon("F1/res/car-top-view.png").getImage();
    Image img_R = new ImageIcon("F1/res/car-top-view.png").getImage();
    Image img = img_C;

    public Rectangle getRect() {
        return new Rectangle(x, y, 200, 200);
    }

    int v = 0;
    int dv = 0;
    int s = 0;
    int layer1 = 0;
    int layer2 = 4608;
    int x = 10;
    int y = 30;
    int dy = 0;


    public void move() {
        s += v;
        v += dv;
        if (v <= 0) v = 0;
        if (v >= MAX_V) v = MAX_V;
        y -= dy;
        if (y <= MAX_TOP) y = MAX_TOP;
        if (y >= MAX_BOTTOM) y = MAX_BOTTOM;
        if (layer2 - v < 0) {
            layer1 = 0;
            layer2 = 4608;

        } else {
            layer1 -= v;
            layer2 -= v;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            dv = 1;
        }
        if (key == KeyEvent.VK_LEFT) {
            dv = -1;
        }
        if (key == KeyEvent.VK_UP) {
            dy = 5;
            img = img_L;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = -5;
            img = img_R;
        }

    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT) {
            dv = 0;
        }
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dy = 0;
            img = img_C;
        }

    }
}
