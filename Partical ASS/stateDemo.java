import java.awt.*;
import javax.swing.*;
//import java.awt.event.*;
public class stateDemo
{
	 String state[]={"Maharastra","Gujarat","Uatter Pardhesh","Jammu and Kashimra"};
	stateDemo()
	{
		JFrame f=new JFrame();
		f.setSize(500,400);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		JComboBox cb=new JComboBox(state);
		f.add(cb);
		
	/*	cb.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ae)
			{
          lb.setText("You are in "+cb.getSelectedItem());     			
			}	
	});*/
	
}
public static void main(String args[])
{ 
   new stateDemo();
}
}