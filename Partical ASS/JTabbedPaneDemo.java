import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JTabbedPaneDemo
{
	JTabbedPaneDemo()
	{
		JFrame f=new JFrame();
		f.setSize(500,400);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		JComboBox cb=new JComboBox();
		JLabel lb=new JLabel();
		cb.addItem("Solapur");
		cb.addItem("Pune");
		cb.addItem("Banglore");
		cb.addItem("Mumbai");
		f.add(cb);
		f.add(lb);
		cb.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ae)
			{
          lb.setText("You are in "+cb.getSelectedItem());     			
			}	
	});
	
}
public static void main(String args[])
{ 
   new JTabbedPaneDemo();
}
}