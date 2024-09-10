import javax.swing.*;
import java.awt.*;

public class PizzaMenu extends JFrame
{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private JRadioButton smallRB, mediumRB, largeRB, thinRB, stuffedRB, panRB;
    private JCheckBox extraCheeseCB, tomatoCB, greenPepperCB, blackOlivesCB, mushroomsCB, pepperoniCB, sausageCB;
    private JLabel sizeLabel, toppingsLabel, typeLabel;


    public PizzaMenu()
    {

        setTitle("Create your own pizza");

        //initialize radio buttons for size
        smallRB = new JRadioButton("small");
        mediumRB = new JRadioButton("medium");
        largeRB = new JRadioButton("large");

        //initialize radio buttons for crust
        thinRB = new JRadioButton("Thin crust");
        stuffedRB = new JRadioButton("Stuffed crust");
        panRB = new JRadioButton("Pan");

        //initialize checkboxes for toppings
        extraCheeseCB = new JCheckBox("Extra Cheese");
        tomatoCB = new JCheckBox("Tomato");
        greenPepperCB = new JCheckBox("Green Pepper");
        blackOlivesCB = new JCheckBox("Black Olives");
        mushroomsCB = new JCheckBox("Mushrooms");
        pepperoniCB = new JCheckBox("Pepperoni");
        sausageCB = new JCheckBox("Sausage");

        //initialize labels
        sizeLabel = new JLabel("Size");
        toppingsLabel = new JLabel("Toppings");
        typeLabel = new JLabel("Crust");

        Container pane = getContentPane();

        //add button to button group
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallRB);
        sizeGroup.add(mediumRB);
        sizeGroup.add(largeRB);

        ButtonGroup typeGroup = new ButtonGroup();
        typeGroup.add(thinRB);
        typeGroup.add(stuffedRB);
        typeGroup.add(panRB);


        //add all elements to pane
        pane.setLayout(new FlowLayout());
        pane.add(sizeLabel);
        pane.add(smallRB);
        pane.add(mediumRB);
        pane.add(largeRB);

        pane.add(typeLabel);
        pane.add(thinRB);
        pane.add(stuffedRB);
        pane.add(panRB);

        pane.add(toppingsLabel);
        pane.add(extraCheeseCB);
        pane.add(tomatoCB);
        pane.add(greenPepperCB);
        pane.add(blackOlivesCB);
        pane.add(mushroomsCB);
        pane.add(pepperoniCB);
        pane.add(sausageCB);

        //set size of window and display it, allow exit on close
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        PizzaMenu pizzaMenu = new PizzaMenu();
    }
}
