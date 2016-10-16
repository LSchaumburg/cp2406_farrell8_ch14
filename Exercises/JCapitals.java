import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Luke on 16/10/2016.
 */
public class JCapitals extends JFrame implements ItemListener
{
    FlowLayout flow = new FlowLayout();
    JLabel countryLabel = new JLabel("Select a country");
    JComboBox<String> countryBox = new JComboBox<String>();
    JTextField capitalField = new JTextField(25);
    String[] countries = {"Australia", "Canada", "England", "France", "Italy", "German", "Alaska"};
    String[] capitals = {"Canberra", "Toronto", "London", "Paris", "Rome", "Berlin", "Juneau"};
    String myCountry;
    String output;
    int countryNum;
    public JCapitals()
    {
        super("Capitals");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        countryBox.addItemListener(this);
        for(int x = 0; x < countries.length; ++x)
            countryBox.addItem(countries[x]);
        add(countryLabel);
        add(countryBox);
        add(capitalField);
    }
    public static void main(String[] arguments)
    {
        JCapitals capitalframe = new JCapitals();
        capitalframe.setSize(400, 150);
        capitalframe.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent list)
    {
        Object source = list.getSource();
        if(source == countryBox)
        {
            countryNum = countryBox.getSelectedIndex();
            myCountry = countries[countryNum];
            output = "The capital of " + myCountry + " is " + capitals[countryNum];
            capitalField.setText(output);
        }
    }
}