import java.awt.*;
import java.applet.*;
public class gridi extends Applet
{ 
      
	 
   public void init()
   {
    setLayout(new GridLayout(5,5));
	for( int i=0;i<=9;i++)
	{
	
	add(new Button(" "+i));
	
	}
   }
}
/*
   <applet code="gridi" width=400 height=500>
   </applet>
   
   
   */