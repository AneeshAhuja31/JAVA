import java.awt.*;
import java.awt.event.*;
public class paint_w_mousemotionlistener extends Frame implements MouseMotionListener{
    Label l;
    Color c = Color.BLUE;
    paint_w_mousemotionlistener(){
        l = new Label();
        l.setBounds(20,40,100,20);
        add(l);
        addMouseMotionListener(this);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void mouseDragged(MouseEvent e){
        l.setText("X="+e.getX()+",Y="+e.getY());
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }
    public void mouseMoved(MouseEvent e){
        l.setText("X="+e.getX()+",Y="+e.getY());
    }
    public static void main(String[] args) {
        new paint_w_mousemotionlistener();
    }
}
