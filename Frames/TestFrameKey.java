import java.awt.event.*;
import javax.swing.*;
public class TestFrameKey extends JFrame implements KeyListener{
    private JLabel l1;
    private JTextField t1;
    public TestFrameKey(){
        setSize(640,480);
        setLayout(null);
        t1 = new JTextField();
        t1.setBounds(100,100,200,30);
        add(t1);
        l1 = new JLabel(" ");
        l1.setBounds(300,100,200,30);
        add(l1);
        t1.addKeyListener(this);
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_ENTER) // e.getKeyChar()=='x'
            l1.setText(t1.getText());
    }

    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        TestFrameKey t = new TestFrameKey();
        t.setVisible(true);
    }
}
