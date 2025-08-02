import java.applet.*;
import java.awt.*;
public class TField extends Applet
{
       TextField name,pass;
	   public void init()
	   {
	        Label namep=new Label("Name:",Label.RIGHT);
			Label passp=new Label("Password:",Label.LEFT);
			name=new TextField(12);
			pass=new TextField(8);
			
			
			
			
			pass.setEchoChar('?');
			add(namep);
			add(name);
			add(passp);
			add(pass);
			
	   }
	  
	   }

/*<applet code="TField" width=300 height=400>
</applet>*/