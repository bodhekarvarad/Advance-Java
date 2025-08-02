// demonstrate the use of gridLayout 
import java.awt.*;
import java.applet.*;
public class griddemoloop extends Applet
{ 
      
	 
   public void init()
   {
    setLayout(new GridLayout(5,5));
	for( int i=0;i<=25;i++)
	{
	
	add(new Button(" "+i));
	
	}
   }
}
   /*
   <applet code="griddemoloop" width=400 height=500>
   </applet>
   
   
   */