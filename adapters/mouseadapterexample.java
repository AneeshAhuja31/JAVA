import java.awt.*;
import java.awt.event.*;
public class mouseadapterexample extends MouseAdapter{
    Frame f;
    mouseadapterexample(){
        f = new Frame("Mouse Adapter");
        f.addMouseListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }
    public static void main(String[] args) {
        new mouseadapterexample();
    }
}
