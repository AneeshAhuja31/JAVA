import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class cardlayoutdemo extends JFrame implements ActionListener{
    CardLayout c;
    JButton b1,b2,b3;
    Container d;
    cardlayoutdemo(){
        d = getContentPane();
        c = new CardLayout(40,30);
        d.setLayout(c);
        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        d.add("P",b1);
        d.add("Q",b2);
        d.add("R",b3);
    }
    public void actionPerformed(ActionEvent e){
        c.next(d);
    }
    public static void main(String[] args) {
        cardlayoutdemo obj = new cardlayoutdemo();
        obj.setSize(500,500);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
