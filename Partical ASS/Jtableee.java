import javax.swing.*;
import java.awt.*;
public class Jtableee extends JFrame
{
	    String data[]={"Name","Percentage","Grade"};
		Object col[][]={{"Modi","99.90","A++"},
			{"Rahul","80.50","B++"},
				{"Soniya","75.50","C++"},
					{"Amit","95.50","A++"},
						{"Arvind","85.5","A+"},
							{"Mamta","89.07","A++"},
								{"Naveen","95.60","A++"},
									{"Uddhav","60","D"},
										{"Y.S. Jaganmohan","95.80","A++"},
		{"Pinarayi","98.50","A++"}};
		Jtableee()
		{
			setLayout(new FlowLayout());
		setSize(500,400);
		setVisible(true);
		JTable td=new JTable(col,data); 
		JScrollPane jp=new JScrollPane(td);
		add(jp);
			
		}
	public static void main(String args[])
	{
		new Jtableee();
		
		
	}
}