package Java;

//import java.applet.Applet;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class Q_5 extends Frame implements ActionListener {
	    private CardLayout cardLayout;
	    private Panel cardPanel;
	    Q_5()

	  {
	    	setSize(500,600);
	    	setVisible(true);
	    	setLayout(new FlowLayout());
	        cardLayout = new CardLayout();
	        cardPanel = new Panel();
	        cardPanel.setLayout(cardLayout);

	        // Create panels with different content
	        Panel panel1 = new Panel();
	        panel1.add(new Label("Panel 1 Content"));

	        Panel panel2 = new Panel();
	        panel2.add(new Label("Panel 2 Content"));

	        Panel panel3 = new Panel();
	        panel3.add(new Label("Panel 3 Content"));

	        // Add panels to the card panel
	        cardPanel.add(panel1, "Panel 1");
	        cardPanel.add(panel2, "Panel 2");
	        cardPanel.add(panel3, "Panel 3");

	        // Create buttons for navigation
	        Button firstButton = new Button("First");
	        Button prevButton = new Button("Previous");
	        Button nextButton = new Button("Next");
	        Button lastButton = new Button("Last");

	        // Add action listeners to the buttons
	        firstButton.addActionListener(this);
	        prevButton.addActionListener(this);
	        nextButton.addActionListener(this);
	        lastButton.addActionListener(this);

	        // Add buttons to the applet
	        add(firstButton);
	        add(prevButton);
	        add(nextButton);
	        add(lastButton);

	        
	        add(cardPanel);

	        
	        setLayout(new FlowLayout());
	    }

	    public void actionPerformed(ActionEvent e) {
	        String command = e.getActionCommand();

	        switch (command) {
	            case "First":
	                cardLayout.first(cardPanel);
	                break;
	            case "Previous":
	                cardLayout.previous(cardPanel);
	                break;
	            case "Next":
	                cardLayout.next(cardPanel);
	                break;
	            case "Last":
	                cardLayout.last(cardPanel);
	                break;
	        }
	    }
	    public static void main(String args[]) 
	    {
	    	new Q_5();
	    }
	}



