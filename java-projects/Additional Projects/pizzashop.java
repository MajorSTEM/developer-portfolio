import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class PizzaShop {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PizzaShop().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Pizza Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        Container container = frame.getContentPane();
        container.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JCheckBox cheeseBox = new JCheckBox("Extra Cheese");
        JCheckBox pepperoniBox = new JCheckBox("Pepperoni");
        JCheckBox mushroomsBox = new JCheckBox("Mushrooms");

        panel.add(cheeseBox);
        panel.add(pepperoniBox);
        panel.add(mushroomsBox);

        ButtonGroup sizeGroup = new ButtonGroup();
        JRadioButton smallButton = new JRadioButton("Small");
        JRadioButton mediumButton = new JRadioButton("Medium");
        JRadioButton largeButton = new JRadioButton("Large");

        sizeGroup.add(smallButton);
        sizeGroup.add(mediumButton);
        sizeGroup.add(largeButton);

        panel.add(smallButton);
        panel.add(mediumButton);
        panel.add(largeButton);

        container.add(panel, BorderLayout.CENTER);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(scrollPane, BorderLayout.SOUTH);

        JButton orderButton = new JButton("Place Order");
        container.add(orderButton, BorderLayout.NORTH);

        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder order = new StringBuilder("Your Order:\n");

                double price = 0;
                DecimalFormat df = new DecimalFormat("0.00");

                if (smallButton.isSelected()) {
                    order.append("Small Pizza\n");
                    price += 6.99;
                } else if (mediumButton.isSelected()) {
                    order.append("Medium Pizza\n");
                    price += 9.99;
                } else if (largeButton.isSelected()) {
                    order.append("Large Pizza\n");
                    price += 12.99;
                }

                if (cheeseBox.isSelected()) {
                    order.append("Extra Cheese\n");
                    price += 1.00;
                }
                if (pepperoniBox.isSelected()) {
                    order.append("Pepperoni\n");
                    price += 1.00;
                }
                if (mushroomsBox.isSelected()) {
                    order.append("Mushrooms\n");
                    price += 1.00;
                }

                order.append("\nTotal: $").append(df.format(price));
                textArea.setText(order.toString());
            }
        });

        frame.setVisible(true);
    }
}
