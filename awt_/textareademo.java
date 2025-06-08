import java.awt.*;
public class textareademo {
    textareademo(){
        Frame f = new Frame();
        TextArea area = new TextArea("Welcome");
        area.setBounds(30,40,200,200);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new textareademo();
    }
}
