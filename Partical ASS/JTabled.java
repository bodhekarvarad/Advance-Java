import java.awt.*;
import javax.swing.*;
public class JTabled extends JFrame
{
   public JTabled()
   {
     setLayout(new FlowLayout());
	 setVisible(true);
	 setSize(400,300);
	 String colHeads[] ={"ID","NAME","PIN CODE"};
	 Object data[][] = {
	                      {"101","Amit","443201"},
						  { "102","Jai","443212" },
						  { "103","Sa chin","444043"}
	   
	                    };
JTable jt = new JTable(data,colHeads);						
   JScrollPane js = new JScrollPane(jt);
   add(js);
   
   
   
   
   
   }
public static void  main(String args[])
{


new JTabled();


}

}