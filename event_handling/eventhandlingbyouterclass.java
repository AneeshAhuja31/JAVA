import java.awt.*;
import java.awt.event.*;
public class eventhandlingbyouterclass extends Frame{
    TextField tf;
    eventhandlingbyouterclass(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("click me");
        b.setBounds(100,120,80,30);
        Outer o = new Outer(this);
        b.addActionListener(o);
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new eventhandlingbyouterclass();
    }
}
class Outer implements ActionListener{
    eventhandlingbyouterclass obj;
    Outer(eventhandlingbyouterclass obj){
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent e){
        obj.tf.setText("Welcome");
    }
}
