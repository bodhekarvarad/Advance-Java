import java.awt.*;
import java.applet.*;
public class listC extends Applet
{
   public void init()
   {
      List l=new List(10,true);
	  l.add("Mumbai");
	  l.add("Pune");
	  l.add("Nashik");
	  l.add("Nagpur");
	  l.add("C.S Nager");
	  l.add("Chennai");
	  l.add("Velora");
	  l.add("Jaipur");
	  l.add("Shri Nager");
	  l.add("Jammu");
	  add(l);
	  }
	  
   }
   /*<applet code="listC" width=300 height=400>
   </applet>*/