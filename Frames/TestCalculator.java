import java.awt.event.*;
import javax.swing.*;
public class TestCalculator extends JFrame implements ActionListener{
    private JLabel l1, l2, l3, l4;
    private JButton b1,b2,b3,b4;
    private JTextField t1,t2;
    public TestCalculator(){
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
        b1 = new JButton("+");
        b1.setBounds(88,280,50,50);
        add(b1);
        b2 = new JButton("-");
        b2.setBounds(226,280,50,50);
        add(b2);
        b3 = new JButton("*");
        b3.setBounds(364,280,50,50);
        add(b3);
        b4 = new JButton("/");
        b4.setBounds(502,280,50,50);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        Integer a = Integer.parseInt(t1.getText());
        Integer b = Integer.parseInt(t2.getText());
        Integer ans = 0;
        if (e.getSource()==b1)
            ans = a + b;
        else if (e.getSource()==b2) 
            ans = a - b;
        else if (e.getSource()==b3)
            ans = a * b;
        else if (e.getSource()==b4)
            ans = a / b;
        l4.setText(Integer.toString(ans));
    }

    public static void main(String[] args) {
        TestCalculator t = new TestCalculator();
        t.setVisible(true);
    }
}
