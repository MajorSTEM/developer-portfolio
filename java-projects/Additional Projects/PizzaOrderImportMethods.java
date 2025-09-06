//This program was written by Samantha, Marija, Atinuke, Isaiah, Alan
//we imported java packages bellow
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//here we are declaring a class and this extends JFrame and implements the interfaces
public class PizzaOrder extends JFrame implements ItemListener,ActionListener
{
	//We are declaring the variable names, declaring radio buttons, button group, 
	//declaring Jbutton, JTextArea, JLabel, JTextBox, static strings, and a method
	private JRadioButton smallRb,mediumRb,largeRb;
	private JRadioButton thinCrustRb,stuffedCrustRb,panRB;
	private ButtonGroup pizzaSize,pizzaType;
	private JCheckBox tomato,greenPepper,blackOlives,mushrooms,extraCheese,pepperoni,sausage;
	private JButton processSelection;
	private JLabel topLabel,sizeLabel,typeLabel;
	private JTextArea billTA;
	private static String pType="",pSize="",toppings="";
	private static double amount=0.0;
	public PizzaOrder();
}