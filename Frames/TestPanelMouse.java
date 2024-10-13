import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TestPanelMouse extends JPanel implements MouseListener, MouseMotionListener {
    private int x,y;
    public TestPanelMouse(){
        setBounds(100,100,300,300);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseExited(MouseEvent e) {
        setBackground(Color.red);
    }

    public void mouseEntered(MouseEvent e) {
        setBackground(Color.blue);
    }

    public void mousePressed(MouseEvent e) {
        setBackground(Color.white);
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        repaint();
    }

    public void mouseDragged(MouseEvent e) {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.drawString(x+","+y,x,y);
    }

    public static void main(String[] args) {
        TestPanelMouse t = new TestPanelMouse();
        JFrame f = new JFrame();
        f.setSize(640,480);
        f.setLayout(null);
        f.add(t);
        f.setVisible(true);
    }
}
