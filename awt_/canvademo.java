import java.awt.*;
public class canvademo {
    canvademo(){
        Frame f = new Frame("Hello");
        f.add(new mycanvademo());
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new canvademo();
    }
}
class mycanvademo extends Canvas{
    public mycanvademo(){
        setBackground(Color.WHITE);
        setSize(300,200);
    }
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillOval(80, 80, 150, 75);
    }
}
