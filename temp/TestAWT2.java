import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.*;;

public class TestAWT2 extends Frame {
    public TestAWT2(){
        Button btn = new Button("Hello World");
        add(btn);
        setSize(400,500);
        setTitle("StudyTonight");
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        TestAWT2 ta = new TestAWT2();
    }
}
