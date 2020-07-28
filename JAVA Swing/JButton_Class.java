import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButton_Class 
{
    JButton_Class() 
    {
        JFrame f = new JFrame("Sample");

        // Button with Text
        JButton b = new JButton("Click Me");

        // Text Field
        final JTextField t = new JTextField();

        // Button with Image
        JButton ci = new JButton(new ImageIcon("C:\\abc.jpg"));


        b.setBounds(120, 200, 120, 50);
        t.setBounds(30, 100, 300, 40);
        ci.setBounds(120,300,120,50);
        f.add(b);
        f.add(t);
        f.add(ci);

        b.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Font f = new Font(Font.SERIF, Font.BOLD, 21);
                t.setFont(f);
                t.setText("Welcome to Vencedor World !");
            }
        });
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        new JButton_Class();
    }
}