import java.awt.*;
import java.applet.*;
public class list  extends Applet 

{
     public void init()
	 {
		 
		 List l = new List(5,true);
		 
		 l.add("The Hindu");
		 l.add("The Indian Express");
		 l.add("Newyork Times");
		 l.add("The Economic Times");
		 l.add("India Today");
		
		add(l);
	 }	 
	
}
	
	
	/* <applet code="list" width=400 height=300>
	</applet> */
	