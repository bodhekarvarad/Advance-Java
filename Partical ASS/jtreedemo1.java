import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class jtreedemo1 extends JFrame 
{
   public jtreedemo1()
   {
   
   setLayout(new BorderLayout());
   setSize(500,400);
   setVisible(true);
   DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
   DefaultMutableTreeNode a= new DefaultMutableTreeNode("Computer");
   root.add(a);
   DefaultMutableTreeNode b = new DefaultMutableTreeNode("Software Testing");
   a.add(b);
   DefaultMutableTreeNode a1= new DefaultMutableTreeNode("Java");
   a.add(a1);
   JTree j = new JTree(root);
   add(j);
   
   
   }
public static void main(String args[])
{

new jtreedemo1();
}



}