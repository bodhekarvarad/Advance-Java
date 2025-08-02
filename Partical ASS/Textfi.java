import java.awt.*;
import java.applet.*;
public class Textfi extends Applet
{
   public void init()
   {
	  
   Label l = new Label("enter name");
   TextField t1 = new TextField(10);
   Label l1 = new Label("enter password");
   TextField t2 = new TextField(10);
   t2.setEchoChar('*');

   add(l);
   add(t1);
   add(l1);
   add(t2);
   Button b1 = new Button("submit");
   add(b1,BorderLayout.CENTER);
 
   }

}
/*
<applet code="Textfi" width=400 height=300>
</applet>
*/