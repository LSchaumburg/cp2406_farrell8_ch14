import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Luke on 16/10/2016.
 */
public class JHistoricalFacts extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Press to change fact");
    JLabel stars = new JLabel("**********************************************");
    JLabel fact1 = new JLabel("Nearly 1,600 Saturns could fit inside the Sun.                ");
    JLabel fact2 = new JLabel("Cats make about 100 different sounds. Dogs make only about 10.");
    JLabel fact3 = new JLabel("The longest reigning British monarch was Queen Victoria.      ");
    JLabel fact4 = new JLabel("The Battle of Hastings took place in 1066.                    ");
    JLabel fact5 = new JLabel("In 1817, a girl named Mary DID have a little lamb             ");
    int counter = 0;
    public JHistoricalFacts()
    {
        super("Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        add(stars);
        add(fact1);
        button.addActionListener(this);
    }
    public static void main(String[] args)
    {
        JHistoricalFacts rFrame = new JHistoricalFacts();
        rFrame.setSize(400,200);
        rFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++counter;
        if(counter == 5)
            counter = 0;
        if(counter == 1)
        {
            remove(fact1);
            add(fact2);
        }
        else
        if(counter == 2)
        {
            remove(fact2);
            add(fact3);
        }
        else
        if(counter == 3)
        {
            remove(fact3);
            add(fact4);
        }
        else
        if(counter == 4)
        {
            remove(fact4);
            add(fact5);
        }
        else
        {
            remove(fact5);
            add(fact1);
        }

        validate();
        repaint();
    }

}