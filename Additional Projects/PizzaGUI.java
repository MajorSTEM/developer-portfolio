import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PizzaShopGUI extends JFrame {
  
  private JCheckBox pepperoniBox, mushroomBox, onionBox;
  private JRadioButton smallButton, mediumButton, largeButton;
  private JButton orderButton;
  private JTextArea orderTextArea;
  
  public PizzaShopGUI() {
    super("Pizza Shop");
    
    // create menu bar and menu items
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem exitItem = new JMenuItem("Exit");
    exitItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    fileMenu.add(exitItem);
    menuBar.add(fileMenu);
    setJMenuBar(menuBar);
    
    // create panel for checkboxes, radio buttons, and button
    JPanel orderPanel = new JPanel();
    orderPanel.setLayout(new BoxLayout(orderPanel, BoxLayout.Y_AXIS));
    orderPanel.setBorder(BorderFactory.createTitledBorder("Order"));
    
    pepperoniBox = new JCheckBox("Pepperoni");
    mushroomBox = new JCheckBox("Mushroom");
    onionBox = new JCheckBox("Onion");
    
    smallButton = new JRadioButton("Small", true);
    mediumButton = new JRadioButton("Medium");
    largeButton = new JRadioButton("Large");
    ButtonGroup sizeGroup = new ButtonGroup();
    sizeGroup.add(smallButton);
    sizeGroup.add(mediumButton);
    sizeGroup.add(largeButton);
    
    orderButton = new JButton("Order");
    orderButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // calculate the price based on the selections
        double price = 0.0;
        StringBuilder order = new StringBuilder();
        order.append("Order:\n");
        if (pepperoniBox.isSelected()) {
          price += 2.0;
          order.append("- Pepperoni\n");
        }
        if (mushroomBox.isSelected()) {
          price += 1.5;
          order.append("- Mushroom\n");
        }
        if (onionBox.isSelected()) {
          price += 1.5;
          order.append("- Onion\n");
        }
        if (smallButton.isSelected()) {
          price += 8.0;
          order.append("- Small pizza\n");
        }
        if (mediumButton.isSelected()) {
          price += 10.0;
          order.append("- Medium pizza\n");
        }
	  }
