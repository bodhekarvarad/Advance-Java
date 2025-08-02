import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class SB extends Applet implements AdjustmentListener
{
    Scrollbar vertSB,horzSB;
	String msg=" ";
	public void init()
	{
	    vertSB=new Scrollbar(Scrollbar.VERTICAL,0,1,0,10);
		horzSB=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,10);
		add(vertSB);
		add(horzSB);
		vertSB.addAdjustmentListener(this);
		horzSB.addAdjustmentListener(this);
	}
     public void adjustmentValueChanged(AdjustmentEvent ae)
	 {
	    repaint();
	 }
      public void paint(Graphics g)
	  {
	     msg="Current Scrollbar values are:  ";
		 g.drawString("Vertical Scrollbar Value:  "+vertSB.getValue(),6,120);
		 g.drawString("HORIZONTAL Scrollbar Value:  "+horzSB.getValue(),6,160);
	  }
}
/*<applet code="SB" width=300 height=400>
</applet>*/