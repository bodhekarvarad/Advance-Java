package Java;
import java.awt.*;
public class Q_7  {
	MenuBar mb;
	Q_7()
	{
		Frame f=new Frame();
	f.setSize(500,600);
	f.setVisible(true);
	 f.setLayout(new FlowLayout());
 mb=new MenuBar();
    	Menu m=new Menu("Colors");
	MenuItem m1=new MenuItem("Red");
	MenuItem m2=new MenuItem("Green");
	MenuItem m3=new MenuItem("Black");
	m3.setEnabled(false);
	m.add(m1);
	m.add(m3);
	m.add(m2);
	mb.add(m);
	
	
	// mb.setMenuBar);
	         
	}

	public static void main(String[] args) {
		new Q_7();
	
		
		// TODO Auto-generated method stub

	}

}
