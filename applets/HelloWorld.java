import java.applet.Applet;        // Imports the Applet class
import java.awt.Graphics;         // Imports Graphics class for drawing

public class HelloWorld extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World !", 10, 30);  // Draws the string at x=10, y=30
    }
}
