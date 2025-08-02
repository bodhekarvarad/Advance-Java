import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class focusListener extends JFrame implements FocusListener
{
	JButton b1,b2;
  public focusListener()
  {
      setSize(500,400);
	  setLayout(new FlowLayout());
	  setVisible(true);
	  b1=new JButton("1");
	 b2=new JButton("2");
	 add(b1);
	 add(b2);
	  b1.addFocusListener(this);
  }
  public void focusGained(FocusEvent fe)
  {
       System.out.println("1 button gained");
	   b1.setBackground(Color.green);
	   b2.setBackground(Color.red);
	   
  }
  public void focusLost(FocusEvent fe)
  {
       System.out.println("2 button Lost");
	   b1.setBackground(Color.red);
	   b2.setBackground(Color.green);
	   
  }
  public static void main(String arfds[])
  {
      new focusListener();
  }
    
 }