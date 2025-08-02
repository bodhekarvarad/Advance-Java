import java.awt.*;
import javax.swing.*;
public class JProgressrun
{
	 int i;
    public JProgressrun()
	{
	JFrame f=new JFrame();
	f.setVisible(true);
	f.setSize(500,400);
	f.setLayout(new FlowLayout());
	JProgressBar jp=new JProgressBar(0,100);
	jp.setValue(100);
	jp.setForeground(Color.red);
	jp.setStringPainted(true);
	f.add(jp);
	while(i<=100)
	{
		jp.setValue(i);
		i=i+20;
		try
		{
			Thread.sleep(1500);
		}
		catch(Exception e)
		{
			
		}
	}
	
	}
	public static void main(String args[])
	{
		new JProgressrun();
	}

}