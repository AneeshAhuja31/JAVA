import java.awt.*;
import javax.swing.*;
public class insetsdemo extends JFrame{
    insetsdemo(){
        BorderLayout layout = new BorderLayout(2,2);
        setLayout(layout);
        JButton b1 = new JButton("**NORTH**");
        JButton b2 = new JButton("**SOUTH**");
        JButton b3 = new JButton("**EAST**");
        JButton b4 = new JButton("**WEST**");
        JButton b5 = new JButton("**CENTER**");
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        setSize(400,400);
        setVisible(true);
    }
    @Override
    public Insets getInsets(){
        return new Insets(50,30,20,30);
    }
    public static void main(String[] args) {
        new insetsdemo();
    }
}
