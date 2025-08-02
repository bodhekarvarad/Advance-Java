import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class JSC 
{
   public JSC()
   {
   JFrame f=new JFrame("I DO JSC");
   f.setSize(500,400);
   f.setVisible(true);
   f.setLayout(new FlowLayout());
   JScrollBar P=new JScrollBar();
   JLabel l=new JLabel();
  f.add(P);
   f.add(l);
   P.addAdjustmentListener(new AdjustmentListener()
   {
        public void adjustmentValueChanged(AdjustmentEvent ae)
		{
		   
		   l.setText("Value changed:"+ae.getValue());
		    System.out.println("Value Changed:"+ae.getValue());
		}
   });
   }
   public static void main(String args[])
   {
      new JSC();
   }
}