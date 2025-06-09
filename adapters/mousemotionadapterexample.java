import java.awt.*;
import java.awt.event.*;

public class mousemotionadapterexample extends MouseMotionAdapter {
    Frame f;

    mousemotionadapterexample() {
        f = new Frame("Mouse Motion Adapter");
        f.addMouseMotionListener(this);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

        // Add window close functionality
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.ORANGE);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    public static void main(String[] args) {
        new mousemotionadapterexample();
    }
}
