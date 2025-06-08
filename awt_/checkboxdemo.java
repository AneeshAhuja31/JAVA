import java.awt.*;

public class checkboxdemo {
    checkboxdemo(){
        Frame f = new Frame("hello");
        Checkbox ch1 = new Checkbox("Yes",true);
        ch1.setBounds(100,100,60,60);
        Checkbox ch2 = new Checkbox("No");
        ch2.setBounds(100, 150, 60, 60);
        f.add(ch1);
        f.add(ch2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new checkboxdemo();
    }
}
