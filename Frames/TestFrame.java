import java.awt.event.*;
import javax.swing.*;
public class TestFrame extends JFrame implements ActionListener{
    private JLabel l1;
    private JButton b1;
    public TestFrame(){
        setSize(640,480);
        setLayout(null);
        b1 = new JButton("Click here");
        b1.setBounds(100,100,100,100);
        add(b1);
        l1 = new JLabel(" ");
        l1.setBounds(200,100,100,100);
        add(l1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        l1.setText("Clicked");
    }

    public static void main(String[] args) {
        TestFrame t = new TestFrame();
        t.setVisible(true);
    }
}
