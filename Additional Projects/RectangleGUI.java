//Isaiah Smith
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleGUI extends JFrame
{
   private JLabel lengthL, widthL, areaL, perimeterL;
   private JTextField lengthTF, widthTF, areaTF, perimeterTF;
   private JButton calculateB, exitB;
   private CalculateButtonHandler cbHandler;
   private ExitButtonHandler ebHandler;

   private static final int WIDTH = 200;
   private static final int HEIGHT = 150;

   public RectangleProgram()
   {
	   //Creates the four labels
	   
      lengthL = new JLabel("Length:", SwingConstants.RIGHT);
      widthL = new JLabel("Width:", SwingConstants.RIGHT);
      areaL = new JLabel("Area:", SwingConstants.RIGHT);
      perimeterL = new JLabel("Perimeter:", SwingConstants.RIGHT);
		// Create the four text fields

      lengthTF = new JTextField(5);
      widthTF = new JTextField(5);
      areaTF = new JTextField(5);
      perimeterTF = new JTextField(5);
		
		//creates the calculate button
		
      calculateB = new JButton("Calculate");
      cbHandler = new CalculateButtonHandler();
      calculateB.addActionListener(cbHandler);
		//creates the exit button
		
      exitB = new JButton("Exit");
      ebHandler = new ExitButtonHandler();
      exitB.addActionListener(ebHandler);
			//sets the title of the window
			
      setTitle("Rectangle");
	  //gets the cotainer
	  
      Container pane = getContentPane();
	  //sets the layout
      pane.setLayout(new GridLayout(5, 2));
	  //places the compnenets in the pane
      pane.add(lengthL);
      pane.add(lengthTF);
      pane.add(widthL);
      pane.add(widthTF);
      pane.add(areaL);
      pane.add(areaTF);
      pane.add(perimeterL);
      pane.add(perimeterTF);
      pane.add(calculateB);
      pane.add(exitB);
	   //sets the size of the window and displays

      setSize(WIDTH, HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   private class CalculateButtonHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double width, length, area, perimeter;

         length = Double.parseDouble(lengthTF.getText());
         width = Double.parseDouble(widthTF.getText());
         area = length * width;
         perimeter = 2 * (length + width);

         areaTF.setText("" + area);
         perimeterTF.setText("" + perimeter);
      }
   }

   private class ExitButtonHandler implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
           System.exit(0);
       }
   }

   public static void main(String[] args)
   {
       RectangleProgram rectObject = new RectangleProgram();
   }
}
