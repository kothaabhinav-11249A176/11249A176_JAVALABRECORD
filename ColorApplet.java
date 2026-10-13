import javax.swing.*;
import java.awt.*;
public class ColorApplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawString("kotha abhinav", 50, 50);
        g.setColor(Color.BLUE);
        g.drawString("Blue Text", 50, 100);
        g.setColor(Color.GREEN);
        g.drawString("Green Text", 50, 150);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Text");
        frame.add(new ColorApplet());
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
