import java.awt.*;
import javax.swing.*;
public class JProgress
{
	 int i;
    public JProgress()
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
	
	
	}
	public static void main(String args[])
	
		new JProgress();
	}

}