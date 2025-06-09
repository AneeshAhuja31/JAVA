import java.awt.*;
import java.awt.event.*;
public class windowslistenerexample extends Frame implements WindowListener{
    windowslistenerexample(){
        addWindowListener(this);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new windowslistenerexample();
    }
    public void windowActivated(WindowEvent e){
        System.out.println("actived");
    }
    public void windowClosed(WindowEvent e){
        System.out.println("closing");
        dispose();
    }
    public void windowClosing(WindowEvent e){
        System.out.println("closing");
        dispose();
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("deactivated");
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("deiconified");
    }
    public void windowIconified(WindowEvent e){
        System.out.println("iconified");
    }
    public void windowOpened(WindowEvent e){
        System.out.println("opened");
    }
}
