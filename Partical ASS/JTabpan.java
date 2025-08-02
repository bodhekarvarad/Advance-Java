 import java.awt.*;
import javax.swing.*;
public class JTabpan
{ 
     JTabpan()
	 {
		  JFrame f=new JFrame();
		  f.setVisible(true);
		  f.setSize(500,400);
		  
		  GridLayout gb=new GridLayout(20,20);
		 // GridLayout gb=new Layout();
		  JPanel p=new JPanel();
		  p.setLayout(gb);
		  for(int i=1;i<=400;i++)
		  {
			  p.add(new JButton("Button"+i));
			  
		  }
		  JScrollPane sp=new JScrollPane(p);
		  //f.setLayout(new FlowLayout());
		  f.add(sp);
		  //f.add(sp,BorderLayout.CENTER);
	}
	 public static void main(String args[])
	 {
		 new JTabpan();
	 }
	 
}