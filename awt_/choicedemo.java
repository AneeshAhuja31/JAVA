import java.awt.*;
public class choicedemo {
    choicedemo(){
        Frame f = new Frame();
        Choice obj = new Choice();
        obj.setBounds(80,80,100,100);
        obj.add("Red");
        obj.add("Blue");
        obj.add("Black");
        f.add(obj);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new choicedemo();
    }
}
