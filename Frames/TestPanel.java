import java.awt.*;
import javax.swing.*;
public class TestPanel extends JPanel{
    public TestPanel(){
        setBounds(100,100,300,300);
        setBackground(Color.blue);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        Font f = new Font("Times Roman",Font.PLAIN,26);
        g.setFont(f);
        g.drawString("Hello World",100,100);
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
