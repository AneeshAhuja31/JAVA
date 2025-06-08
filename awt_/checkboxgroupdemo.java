import java.awt.*;
public class checkboxgroupdemo {
    checkboxgroupdemo(){
        Frame f = new Frame("hello");
        CheckboxGroup obj = new CheckboxGroup();
        Checkbox b1 = new Checkbox("Yes",obj,true);
        b1.setBounds(100, 100, 50, 50);
        Checkbox b2 = new Checkbox("No",obj,false);
        b2.setBounds(100,150,50,50);
        f.add(b1);
        f.add(b2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new checkboxgroupdemo();
    }
}
