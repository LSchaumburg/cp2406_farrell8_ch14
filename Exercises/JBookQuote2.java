import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Luke on 16/10/2016.
 */
public class JBookQuote2 extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel sentence1 = new  JLabel("Hey now!");
    JLabel sentence2 = new JLabel("You're a rockstar");
    JButton button = new JButton("Click for source");
    JLabel sentence3 = new JLabel("From: Smash Mouth   -   I lied about it being from a book...");

    public JBookQuote2()
    {
        super("Book Quote 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(sentence1);
        add(sentence2);
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(sentence3);
        validate();
        repaint();
    }

    public static void main(String[] args)
    {
        JBookQuote2 myFrame = new JBookQuote2();
        myFrame.setSize(350, 150);
        myFrame.setVisible(true);
    }
}
