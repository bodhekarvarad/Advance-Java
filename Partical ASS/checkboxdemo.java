import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class checkboxdemo extends Applet implements ItemListener
{
	Checkbox c1,c2,c3;
	String msg=" ";
	public void init()
	{
		
		
	c1 = new Checkbox("windows",false);
     c2 = new Checkbox("solaris");
     c3 = new Checkbox("mac");
     
    add(c1);
    add(c2);
    add(c3);
c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent a)
	{
	repaint();
		
		
	}
	
	
	public void paint(Graphics g)
	
	{
		
		msg = "Current state";
		g.drawString(msg,6,100);
		msg = "windows "+c1.getState();
		g.drawString( msg,6,140);
		msg = "solaris "+c2.getState();
		g.drawString( msg,6,170);
		msg = "mac "+c3.getState();
		g.drawString(msg,6,190);	
	}
	
	
	
	
}

/* <applet code="checkboxdemo" width=500 height=600>
   </applet>
*/