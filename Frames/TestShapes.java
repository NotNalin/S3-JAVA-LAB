import java.awt.*;
import javax.swing.*;
public class TestShapes extends JPanel{
    public TestShapes(){
        setBounds(100,100,300,300);
        setBackground(Color.blue);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawOval(50, 50, 100, 100);
        g.fillOval(50, 50, 100, 100);
        g.setColor(Color.white);
        g.drawRect(50, 50, 100, 100);
        g.drawLine(40, 40, 40, 150);
    }

    public static void main(String[] args) {
        TestShapes t = new TestShapes();
        JFrame f = new JFrame();
        f.setSize(640,480);
        f.setLayout(null);
        f.add(t);
        f.setVisible(true);
    }
}
