{
		//we are creating a title, container, setting layout, of container,
		//setting size and creating label, setting size and location of label
		setTitle("Pizza Order");
		Container c=getContentPane();
		c.setLayout(null);
		setSize(520,550);
		topLabel=new JLabel("Each topping is $1.37");
		topLabel.setSize(150,30);
		topLabel.setLocation(30,70);
		c.add(topLabel);
		sizeLabel=new JLabel("Pizza Size");
		sizeLabel.setSize(120,30);
		sizeLabel.setLocation(190,70);
		typeLabel=new JLabel("Pizza Type");
		typeLabel.setSize(120,30);
		typeLabel.setLocation(360,70);
		//we are adding to the container here
		c.add(typeLabel);
		c.add(sizeLabel);
		//we are creating checkboxes for topping options
		tomato=new JCheckBox("Tomato");
		greenPepper=new JCheckBox("Green Pepper");
		blackOlives=new JCheckBox("Black Olives");
		mushrooms=new JCheckBox("Mushrooms");
		extraCheese=new JCheckBox("Extra Cheese");
		pepperoni=new JCheckBox("Pepperoni");
		sausage=new JCheckBox("Sausage");
		//we are setting size for topping options
		tomato.setSize(120,30);
		greenPepper.setSize(120,30);
		blackOlives.setSize(120,30);
		mushrooms.setSize(120,30);
		extraCheese.setSize(120,30);
		pepperoni.setSize(120,30);
		sausage.setSize(120,30);
		//we are setting location for checkboxes for toppings
		tomato.setLocation(40,100);
		greenPepper.setLocation(40,130);
		blackOlives.setLocation(40,160);
		mushrooms.setLocation(40,190);
		extraCheese.setLocation(40,220);
		pepperoni.setLocation(40,250);
		sausage.setLocation(40, 280);
		//we are creating radio buttons for the sizes of pizza
		smallRb=new JRadioButton("Small is $6.77");
		mediumRb=new JRadioButton("Medium is $8.33");
		largeRb=new JRadioButton("Large is $10.68");
		//we are setting size for radio button of pizza size
		smallRb.setSize(120,30);
		mediumRb.setSize(120,30);
		largeRb.setSize(120,30);
		//we are setting location for radio button of pizza size
		smallRb.setLocation(200,100);
		mediumRb.setLocation(200,140);
		largeRb.setLocation(200,180);
		//we are creating radio buttons for pizza crust types
		thinCrustRb=new JRadioButton("Thin Crust");
		stuffedCrustRb=new JRadioButton("Stuffed Crust");
		panRB=new JRadioButton("Pan");
		//we are setting size of radio button crust type
		thinCrustRb.setSize(110,30);
		stuffedCrustRb.setSize(110,30);
		panRB.setSize(110,30);
		//we are setting location of radio button crust type
		thinCrustRb.setLocation(380,100);
		stuffedCrustRb.setLocation(380,140);
		panRB.setLocation(380,180);
		//we are creating button group for pizza size
		//we are adding to pizzaSize using the add method
		pizzaSize=new ButtonGroup();
		pizzaSize.add(smallRb);
		pizzaSize.add(mediumRb);
		pizzaSize.add(largeRb);
		//we are creating a button group for pizza type
		//we are adding pizzaType using the add method
		pizzaType=new ButtonGroup();
		pizzaType.add(thinCrustRb);
		pizzaType.add(stuffedCrustRb);
		pizzaType.add(panRB);
		//we are adding an itemListender for all of the different options to choose from
		smallRb.addItemListener(this);
		mediumRb.addItemListener(this);
		largeRb.addItemListener(this);
		thinCrustRb.addItemListener(this);
		stuffedCrustRb.addItemListener(this);
		panRB.addItemListener(this);
		tomato.addItemListener(this);
		greenPepper.addItemListener(this);
		blackOlives.addItemListener(this);
		mushrooms.addItemListener(this);
		extraCheese.addItemListener(this);
		pepperoni.addItemListener(this);
		sausage.addItemListener(this);
		//we are creating a button to process the selectoin
		//we set the size button of process selection
		//we set the location of the button for process selction
		//we addded an actionlistender for the process selection button
		processSelection=new JButton("Process Selection");
		processSelection.setSize(200,30);
		processSelection.setLocation(200,240);
		processSelection.addActionListener(this);
		//we created a text area for billing section
		//we created a font for billing section, and set size, and location
		billTA=new JTextArea();
		billTA.setFont(new Font("Courier",Font.PLAIN,12));
		billTA.setSize(450,100);
		billTA.setLocation(20,350);
		//here we are adding all the options to the container
		c.add(billTA);
		c.add(tomato);
		c.add(greenPepper);
		c.add(blackOlives);
		c.add(mushrooms);
		c.add(extraCheese);
		c.add(pepperoni);
		c.add(sausage);
		c.add(smallRb);
		c.add(mediumRb);
		c.add(largeRb);
		c.add(thinCrustRb);
		c.add(stuffedCrustRb);
		c.add(panRB);
		c.add(processSelection);
		//here we have set the visibility and set a default close operation to close on exit
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	//we are declaring a method for dispalying the bill for pizza
	private void displayBill()
	{
		//we set the editibility for billing
		billTA.setEditable(false);
		//we set the text for billing
		billTA.setText("");
		//we appended billing in a text area
		billTA.append("Your Order:\n ");
		billTA.append("Pizza Type:\t"+pType+"\n");
		billTA.append("Pizza Size:\t"+pSize+"\n");
		billTA.append("Toppings:\t"+toppings+"\n");
		billTA.append("Amount Due:\t$"+amount);
		//we used the repaint method for everything to be displayed
		repaint();
	}
	//declared method for graphic options and displaying results
	public void paint(Graphics g)
	{
		//used super.paint(g) to invoke method and using keyword
		super.paint(g);
		//set the color here and used rectangle for the draw method
		g.setColor(Color.red);
		g.drawRect(30, 100, 140, 240);
		g.drawRect(190, 100, 140, 150);
		g.drawRect(355, 100, 150, 150);
		//we are setting the font here
		g.setFont(new Font("Arial",Font.BOLD,25));
		//we are using the method to write the heading 
		g.drawString("C307 Pizza Shop",40, 80);
	}
	//declaring a method for state change of pizza
	public void itemStateChanged(ItemEvent e)
	{
		//this if statement will check conditons of small pizza for all toppings
		//used else if for a medium and large pizza
		//the toppings were the same price in each and repeated for each size
		if(e.getSource()==smallRb)
		{
			pSize="Small";
			amount=6.77;
			if(tomato.isSelected()==true)
			amount=amount+1.37;
			if(greenPepper.isSelected()==true)
			amount=amount+1.37;
			if(mushrooms.isSelected()==true)
			amount=amount+1.37;
			if(blackOlives.isSelected()==true)
			amount=amount+1.37;
			if(extraCheese.isSelected()==true)
			amount=amount+1.37;
			if(pepperoni.isSelected()==true)
			amount=amount+1.37;
			if(sausage.isSelected()==true)
			amount=amount+1.37;
			}
			else if(e.getSource()==mediumRb)
			{
				pSize="Medium";
				amount=8.33;
			if(tomato.isSelected()==true)
			amount=amount+1.37;
			if(greenPepper.isSelected()==true)
			amount=amount+1.37;
			if(mushrooms.isSelected()==true)
			amount=amount+1.37;
			if(blackOlives.isSelected()==true)
			amount=amount+1.37;
			if(extraCheese.isSelected()==true)
			amount=amount+1.37;
			if(pepperoni.isSelected()==true)
			amount=amount+1.37;
			if(sausage.isSelected()==true)
			amount=amount+1.37;
			}
			else if(e.getSource()==largeRb)
			{
				pSize="Large";
				amount=10.68;
			if(tomato.isSelected()==true)
			amount=amount+1.37;
			if(greenPepper.isSelected()==true)
			amount=amount+1.37;
			if(mushrooms.isSelected()==true)
			amount=amount+1.37;
			if(blackOlives.isSelected()==true)
			amount=amount+1.37;
			if(extraCheese.isSelected()==true)
			amount=amount+1.37;
			if(pepperoni.isSelected()==true)
			amount=amount+1.37;
			if(sausage.isSelected()==true)
			amount=amount+1.37;
			}
			//this is checking the contion for all the crust sizes selected by the user in if statements
			//this will check all the conditions for the toppings with the crust sizes using if and else if statements
			if(e.getSource()==thinCrustRb)
				pType="Thin Crust";
			else if(e.getSource()==stuffedCrustRb)
				pType="Stuffed Crust";
			else if(e.getSource()==panRB)
				pType="Pan";
			
			if(e.getSource()==tomato)
			{
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					amount=amount+1.37;
					toppings=toppings.concat("Tomato,");
				}
				else if(e.getStateChange()==ItemEvent. DESELECTED)
				{
					amount=amount-1.37;
					if(toppings.contains("Tomato"))
						toppings=toppings.replace("Tomato,","");
				}
			}
			if(e.getSource()==greenPepper)
			{
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					amount=amount+1.37;
					toppings=toppings.concat("Green Pepper,");
				}
				else if(e.getStateChange()==ItemEvent. DESELECTED)
				{
					amount=amount-1.37;
					if(toppings.contains("Green Pepper"))
						toppings=toppings.replace("Green Pepper,","");
				}
			}
				if(e.getSource()==blackOlives)
				{
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					amount=amount+1.37;
					toppings=toppings.concat("Black Olives,");
				}
				else if(e.getStateChange()==ItemEvent. DESELECTED)
				{
					amount=amount-1.37;
					if(toppings.contains("Black Olives"))
						toppings=toppings.replace("Black Olives,","");
				}
			}
				if(e.getSource()==mushrooms)
			{
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					amount=amount+1.37;
					toppings=toppings.concat("Mushrooms,");
				}
				else if(e.getStateChange()==ItemEvent. DESELECTED)
				{
					amount=amount-1.37;
					if(toppings.contains("Mushrooms"))
						toppings=toppings.replace("Mushrooms,","");
				}
			}
				if(e.getSource()==extraCheese)
			{
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					amount=amount+1.37;
					toppings=toppings.concat("Extra Cheese,");
				}
				else if(e.getStateChange()==ItemEvent. DESELECTED)
				{
					amount=amount-1.37;
					if(toppings.contains("Extra Cheese"))
						toppings=toppings.replace("Extra Cheese,","");
				}
			}
				if(e.getSource()==pepperoni)
			{
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					amount=amount+1.37;
					toppings=toppings.concat("Pepperoni,");
				}
				else if(e.getStateChange()==ItemEvent. DESELECTED)
				{
					amount=amount-1.37;
					if(toppings.contains("Pepperoni"))
						toppings=toppings.replace("Pepperoni,","");
				}
			}
				if(e.getSource()==sausage)
			{
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					amount=amount+1.37;
					toppings=toppings.concat("Sausage,");
				}
				else if(e.getStateChange()==ItemEvent. DESELECTED)
				{
					amount=amount-1.37;
					if(toppings.contains("Sausage"))
						toppings=toppings.replace("Sausage,","");
				}
			}
			//we used repaint method to display
			repaint();
	}
	//we are declaring the method actionperformed here
			public void actionPerformed(ActionEvent e)
			{
				//this if statement will check for the condition
				if(e.getActionCommand().equals("Process Selection"))
				{
					//we used dispalybill method for performing bill 
					displayBill();
				}
			}
			//this is the main method
			public static void main(String[] args)
                        {
							//this calls pizzaOrder as a method to perform
                            PizzaOrder ps = new PizzaOrder();
                        }
}