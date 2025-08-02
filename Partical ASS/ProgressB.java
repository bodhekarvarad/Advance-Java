import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ProgressB extends JFrame
{
	 int i;
    public ProgressB()
	{
	setLayout(new FlowLayout());
	setSize(500,400);
	setVisible(true);
	JProgressBar jp=new JProgressBar(0,100);
	JButton b=new JButton("Click");
	jp.setForeground(Color.red);
	jp.setStringPainted(true);
	add(jp);
	add(b);
	b.addActionListener(new ActionListener()
	{
	     public void actionPerformed(ActionEvent ae)
		 {
	        if(ae.getSource()==b)
			{				
		 
	while(i<=100)
	{
		jp.setValue(i);
		i=i+20;
		try
		{
			Thread.sleep(15);
		}
		catch(Exception e)
		{
			
		}
	}
		 }
		 }
	});
	}
	public static void main(String args[])
	{
		 new ProgressB();
	}


	}
	
