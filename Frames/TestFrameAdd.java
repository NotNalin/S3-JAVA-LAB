import java.awt.event.*;
import javax.swing.*;
public class TestFrameAdd extends JFrame implements ActionListener{
    private JLabel l1, l2, l3, l4;
    private JButton b1;
    private JTextField t1,t2;
    public TestFrameAdd(){
        setSize(640,480);
        setLayout(null);
        l1 = new JLabel("First no: ");
        l1.setBounds(70,40,250,80);
        add(l1);
        l2 = new JLabel("Second No: ");
        l2.setBounds(70,160,250,80);
        add(l2);
        l3 = new JLabel("Answer :");
        l3.setBounds(70,360,200,80);
        add(l3);
        l4 = new JLabel(" ");
        l4.setBounds(380,360,200,80);
        add(l4);
        t1 = new JTextField();
        t1.setBounds(380,40,200,80);
        add(t1);
        t2 = new JTextField();
        t2.setBounds(380,160,200,80);
        add(t2);
        b1 = new JButton("Add");
        b1.setBounds(230,280,180,40);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        Integer a = Integer.parseInt(t1.getText());
        Integer b = Integer.parseInt(t2.getText());
        Integer ans = a + b;
        l4.setText(Integer.toString(ans));
    }

    public static void main(String[] args) {
        TestCalculator t = new TestCalculator();
        t.setVisible(true);
    }
}
