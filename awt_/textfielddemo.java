import java.awt.*;
public class textfielddemo {
    public static void main(String[] args) {
        Frame f1 = new Frame("hi");
        TextField text1,text2;
        text1 = new TextField("Welcome");
        text1.setBounds(60,100,230,40);
        text2 = new TextField("Tutorial of java");
        text2.setBounds(60,150,230,40);
        f1.add(text1);
        f1.add(text2);
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}
