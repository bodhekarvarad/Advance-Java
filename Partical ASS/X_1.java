import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="X_1" width=300 height=100>
</applet>
*/
public class X_1 extends Applet implements KeyListener 
{
	public void init() 
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke) 
	{
		showStatus("Key Pressed");
	}
	public void keyReleased(KeyEvent ke) 
	{
	}
	public void keyTyped(KeyEvent ke) 
	{
	}
}
