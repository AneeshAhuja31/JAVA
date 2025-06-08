import java.awt.*;
public class labeldemo {
    public static void main(String[] args) {
        Frame f1 = new Frame("hello");
        Label l1,l2;
        l1 = new Label("Hello there");
        l1.setBounds(50,50,200,30);
        l2 = new Label("This is Java");
        l2.setBounds(50,100,200,30);
        f1.add(l1);
        f1.add(l2);
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}
