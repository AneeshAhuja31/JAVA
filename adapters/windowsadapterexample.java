import java.awt.*;
import java.awt.event.*;
public class windowsadapterexample {
    Frame f;
    windowsadapterexample(){
        f = new Frame("Windows Adapter");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new windowsadapterexample();
    }
}
