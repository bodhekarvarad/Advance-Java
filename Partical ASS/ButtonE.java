import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class ButtonE extends Applet implements ActionListener
{
      String msg=" ";
	  Button Yes,No,Undecide;
      public void init()
	  {
	      Yes=new Button("YES");
		  No=new Button("NO");
		  Undecide=new Button("UNDECIDE");
		  add(Yes);
		  add(No);
		  add(Undecide);
		  Yes.addActionListener(this);
		  No.addActionListener(this);
		  Undecide.addActionListener(this);
	 }
	   public void actionPerformed(ActionEvent ae)
	   {
	        String str=ae.getActionCommand();
if(str.equals("YES"))			
	   {
	          msg="I AM IN YES";   
	   
	   }
	   else
		   if(str.equals("NO"))
{
      msg="I AM IN NO";
}	   
else {
           
msg="I AM IN UNDECIDE";
}
repaint();
}
	public void paint(Graphics g)
{
    g.drawString(msg,60,120);

}	
}
/*<applet code="ButtonE" width=300 height=400>
</applet>*/   