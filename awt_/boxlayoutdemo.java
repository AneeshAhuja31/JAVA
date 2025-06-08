import java.awt.*;
import javax.swing.*;
public class boxlayoutdemo extends Frame{
    Button buttonBox[];
    public boxlayoutdemo(){
        buttonBox = new Button[2];
        for(int i=0;i<2;i++){
            buttonBox[i]=new Button("** Button "+(i+1));
            add(buttonBox[i]);
        }
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new boxlayoutdemo();
    }
}
