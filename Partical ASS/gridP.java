//demonstrate the use of gridLayout 
 import java.awt.*;
import java.applet.*;
 public class gridP extends Applet
 { 
      
	 
    public void init()
    {
    setLayout(new GridLayout(3,2,20,20));
	for( int i=1;i<=5;i++)
	{
	
 add(new Button("Button "+i));
	
	}
   }
 }
    /*
   <applet code="gridP" width=400 height=500>
   </applet>
   
   
    */