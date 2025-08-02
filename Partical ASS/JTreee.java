 import java.awt.*;
import javax.swing.tree.*;
import javax.swing.*;
public class JTreee
{
	 public JTreee()
	 {
		 JFrame f=new JFrame();
		 f.setVisible(true);
		 f.setSize(500,400);
	
		 DefaultMutableTreeNode a=new DefaultMutableTreeNode("India");
        
         DefaultMutableTreeNode b=new DefaultMutableTreeNode("Maharastra");
        a.add(b);	
		  DefaultMutableTreeNode b5=new DefaultMutableTreeNode("Mumbai");
        b.add(b5);	
		
		  DefaultMutableTreeNode b1=new DefaultMutableTreeNode("Pune");
       b.add(b1);	
		  DefaultMutableTreeNode b2=new DefaultMutableTreeNode("Nashik");
        b.add(b2);	
		  DefaultMutableTreeNode b3=new DefaultMutableTreeNode("Nagpur");
        b.add(b3);	
		  DefaultMutableTreeNode b6=new DefaultMutableTreeNode("Gujrath");
        a.add(b6);	
		
         JTree  tr=new JTree(a);
        JScrollPane js = new JScrollPane(tr);
   f.add(js);		
	 }
	 public static void main(String args[])
	 { 
	   new JTreee();
	 }
}