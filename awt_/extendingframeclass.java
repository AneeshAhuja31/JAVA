import java.awt.*;
public class extendingframeclass extends Frame {
    extendingframeclass(){
        Button btn = new Button("Hello World");
        add(btn);
        setSize(400,500);
        setTitle("Study Tonight");
        setLayout(new FlowLayout());
        setVisible(true);
        setResizable(true);
    }
    public static void main(String[] args) {
        extendingframeclass ta = new extendingframeclass();
    }
}
