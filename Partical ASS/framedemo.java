import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* 
<applet code ="framedemo" width=200 height=400>
</applet>
*/


public class framedemo extends Applet implements ActionListener
{
	
	String msg=" ";
	public void init()
	{
	Button b1 = new Button("ok");
    Button b2 = new Button("cancel");
    Button b3 = new Button("reset");
   
    add(b1);
    add(b2);
    add(b3);
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		if(str.equals("ok"))
			msg ="you pressed ok";
		else if(str.equals("cancel"))
            msg = "you pressed cancel";
		 else   
			  msg ="you pressed reset";
		  repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,6,100);	
	}
	
	
	
	
}






