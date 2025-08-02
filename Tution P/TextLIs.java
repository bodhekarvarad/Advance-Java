import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class TextLIs implements TextListener
{
	 JTextField tF;
	   JLabel l;
    public TextLIs()
	{
	   JFrame f=new JFrame("I AM IN FRAME");
	   f.setSize(500,400);
	   f.setVisible(true);
	   f.setLayout(new FlowLayout());
	   JTextField tF=new JTextField(10);
       JLabel l=new JLabel("Click it!");
	   f.add(tF);
	   f.add(l);
       tF.addTextListener(this);	   
	}
	public void textValueChanged(TextEvent te)
	{
	    tF.setBackground(Color.red);
	}
	public static void main(String args[])
	{
	   new TextLIs();
	}
}