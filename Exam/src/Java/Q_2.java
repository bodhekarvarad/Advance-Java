package Java;
import java.awt.*;
import java.awt.event.*;
public class Q_2 extends Frame implements ActionListener{
	
	List l;
	Q_2()
	{
	setVisible(true);
	setSize(500,600);
	setLayout(new FlowLayout());
 l=new List(3);
	l.add("Nagpur");
	l.add("Pune");
	l.add("Mumbai");
	l.add("Nashik");
	l.add("C.S.Nagar");
	l.addActionListener(this);
	add(l);
	
	
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 String selectedCities[] = l.getSelectedItems();
           //String city;
	        // Print the selected cities
		 if(selectedCities.length>=3)
		 {
	        System.out.println("Selected Cities:");
	        for ( String city : selectedCities) {
	            System.out.println(city);
	        }
	        System.out.println("Select");
		 }
		 else
		 {
			 System.out.println("At 3");
		 }
	        
		
	}

	public static void main(String args[])
	{
		new Q_2();
	}

}
