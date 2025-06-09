import java.awt.*;
import java.awt.event.*;
public class itemlistenerexample implements ItemListener{
    Checkbox ch1,ch2;
    Label l;
    itemlistenerexample(){
        Frame f = new Frame("CheckBox Example");
        l = new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        ch1 = new Checkbox("C++");
        ch1.setBounds(100,100,50,50);
        ch2 = new Checkbox("Java"); 
        ch2.setBounds(100,150,50,50);
        f.add(ch1);
        f.add(ch2);
        f.add(l);
        ch1.addItemListener(this);
        ch2.addItemListener(this);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==ch1)
            l.setText("C++ checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));
        if(e.getSource()==ch2)
            l.setText("Java Checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));
    }
    public static void main(String[] args) {
        new itemlistenerexample();
    }
}
