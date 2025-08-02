import java.applet.*;
import java.awt.*;
public class Flag  extends Applet 
{
	public void paint(Graphics g)
	
	{
		g.drawRect(100, 150, 150,50 );
		g.setColor(Color.ORANGE);
		g.drawRect(120, 160, 150,50);
		g.setColor(Color.WHITE);
		g.drawRect(120, 160, 150,50);
		g.setColor(Color.GREEN);
		
		
		
		
	}

}
/*

<applet code="Flag.class" width="300" height="300">
</applet>

*/