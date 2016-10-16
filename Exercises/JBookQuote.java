import javax.swing.*;
import java.awt.*;

/**
 * Created by Luke on 16/10/2016.
 */
public class JBookQuote extends JFrame{
    FlowLayout flow = new FlowLayout();
    JLabel sentence1 = new JLabel("Hey now!");
    JLabel sentence2 = new JLabel("You're a rockstar");

    public JBookQuote(){
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(sentence1);
        add(sentence2);
    }

    public static void main(String[] args) {
        JBookQuote myFrame = new JBookQuote();
        myFrame.setSize(300, 150);
        myFrame.setVisible(true);
    }
}
