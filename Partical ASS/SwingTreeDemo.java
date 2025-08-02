import javax.swing.*;
// import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.*;
import java.awt.*;

public class SwingTreeDemo {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Swing Tree Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

     
        DefaultMutableTreeNode rd = new DefaultMutableTreeNode("Root");

          for(int i=1;i<=10;i++)
		  {
        
        rd.add(new DefaultMutableTreeNode("Node"+i));
		  }
       /* DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("Node 2");
        DefaultMutableTreeNode n3 = new DefaultMutableTreeNode("Node 3");

        rd.add(n1);
        rd.add(n2);
        rd.add(n3);*/


        DefaultTreeModel treeModel = new DefaultTreeModel(rd);


        JTree tree = new JTree(treeModel);


        JScrollPane scrollPane = new JScrollPane(tree);

    
        frame.add(scrollPane, BorderLayout.CENTER);

       
        frame.setVisible(true);
    }
}
