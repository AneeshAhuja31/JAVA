import java.awt.*;
import java.awt.event.*;
public class awtbtnwactionlistener extends Frame{
    awtbtnwactionlistener(){
        final TextField tf = new TextField();
        tf.setBounds(50,50,150,20);
        Button b = new Button("Click me");
        b.setBounds(50,100,60,30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf.setText("Hello there");
            }
        });
        add(b);
        add(tf);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new awtbtnwactionlistener();
    }
}
