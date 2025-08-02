import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ButtonA extends Applet implements ActionListener
{
   String msg=" ";
   Button bList[]=new Button[3];
   public void init()
   {
        Button Yes=new Button("OK");
		Button No=new Button("Reset");
		Button Undecide=new Button("Cancel");
		 bList[0]=(Button)add(Yes);
         bList[1]=(Button)add(No);
	     bList[2]=(Button)add(Undecide);	 
		  for(int i=0;i<3;i++)
		  {
		     bList[i].addActionListener(this);
          }
   
   }
   public void actionPerformed(ActionEvent ae)
   {
             for(int i=0;i<3;i++)
{
        if(ae.getSource()==bList[i])
		{
		    msg="You pressed  "+bList[i].getLabel();
		}
}			 
     
	 repaint();
   }
   public void paint(Graphics g)
   {
        g.drawString(msg,60,120);
   }


} 
/*<applet code="ButtonA" width=300 height=400>
</applet>*/