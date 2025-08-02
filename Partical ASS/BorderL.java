import java.awt.*;
import java.applet.*;
public class BorderL extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());
		
		{
			

			add(new Button("North"),BorderLayout.NORTH);
			add(new Button("South"),BorderLayout.SOUTH);
			add(new Button("East"),BorderLayout.EAST);
			add(new Button("INSIDE"),BorderLayout.CENTER);
			add(new Button("West"),BorderLayout.WEST);
		}
	}
}
/*<applet code="BorderL" width=300 height=400>
</applet>*/