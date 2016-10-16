import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Luke on 16/10/2016.
 */
public class JVacationRental extends JFrame implements ItemListener
{
    FlowLayout flow = new FlowLayout();
    String companyName = new String("Lambert's Vacation Rentals");
    final int PARKPRICE = 600;
    final int POOLPRICE = 750;
    final int LAKEPRICE = 825;
    int totalPrice = 0;
    ButtonGroup locationGroup = new ButtonGroup();
    JCheckBox parkBox = new JCheckBox("Parkside",false);
    JCheckBox poolBox = new JCheckBox("Poolside", false);
    JCheckBox lakeBox = new JCheckBox("Lakeside", false);
    final int ONEPRICE = 0;
    final int TWOPRICE = 75;
    final int THREEPRICE = 150;
    ButtonGroup bedroomGroup = new ButtonGroup();
    JCheckBox oneBox = new JCheckBox("1 bedroom", false);
    JCheckBox twoBox = new JCheckBox("2 bedrooms", false);
    JCheckBox threeBox = new JCheckBox("3 bedrooms", false);
    final int NOMEALSPRICE = 0;
    final int MEALSPRICE = 200;
    ButtonGroup mealGroup = new ButtonGroup();
    JCheckBox noMealsBox = new JCheckBox("No meals",false);
    JCheckBox mealsBox = new JCheckBox("Meals included",false);
    JTextField totPrice = new JTextField(10);
    String output;
    public JVacationRental()
    {
        super("Vacation rentals");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        locationGroup.add(parkBox);
        parkBox.addItemListener(this);
        locationGroup.add(poolBox);
        poolBox.addItemListener(this);
        locationGroup.add(lakeBox);
        lakeBox.addItemListener(this);
        bedroomGroup.add(oneBox);
        twoBox.addItemListener(this);
        bedroomGroup.add(twoBox);
        threeBox.addItemListener(this);
        bedroomGroup.add(threeBox);
        mealGroup.add(noMealsBox);
        noMealsBox.addItemListener(this);
        mealGroup.add(mealsBox);
        mealsBox.addItemListener(this);
        add(parkBox);
        add(poolBox);
        add(lakeBox);
        add(oneBox);
        add(twoBox);
        add(threeBox);
        add(noMealsBox);
        add(mealsBox);
        totPrice.setText("0");
        add(totPrice);
    }
    public static void main(String[] arguments)
    {
        JVacationRental aFrame = new JVacationRental();
        aFrame.setSize(320,200);
        aFrame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent check)
    {
        Object source = check.getItem();
        if(source == parkBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += PARKPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= PARKPRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == poolBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += POOLPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= POOLPRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == lakeBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += LAKEPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= LAKEPRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == oneBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += ONEPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= ONEPRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == twoBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += TWOPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= TWOPRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == threeBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += THREEPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= THREEPRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == noMealsBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += NOMEALSPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= NOMEALSPRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
        else if(source == mealsBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += MEALSPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= MEALSPRICE;
            output = " " + totalPrice;
            totPrice.setText(output);
        }
    }
}