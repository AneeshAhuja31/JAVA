import java.awt.*;
public class instantiatingframeclass {
    instantiatingframeclass(){ // create constructor of frame class
        Frame fm = new Frame();
        Label lb = new Label("Welcome to java graphics");
        fm.add(lb);
        fm.setSize(300,300);
        fm.setVisible(true);
    }
    public static void main(String[] args) {
        instantiatingframeclass ta = new instantiatingframeclass();
    }
}
