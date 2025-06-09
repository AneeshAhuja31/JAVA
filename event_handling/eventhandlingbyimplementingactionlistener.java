import java.awt.*;
import java.awt.event.*;
public class eventhandlingbyimplementingactionlistener extends Frame implements ActionListener{
    TextField tf;
    eventhandlingbyimplementingactionlistener(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("click me");
        b.setBounds(100,120,80,30);

        b.addActionListener(this); //this refers to the current instance of the class (which extends Action Listener)
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
    public static void main(String[] args) {
        new eventhandlingbyimplementingactionlistener();
    }
}
