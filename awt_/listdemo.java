import java.awt.*;
public class listdemo {
    listdemo(){
        Frame f = new Frame();
        List obj = new List(6);
        obj.setBounds(80,80,100,100);
        obj.add("Red");
        obj.add("Blue");
        obj.add("Pink");
        obj.add("White");
        f.add(obj);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new listdemo();
    }
}
