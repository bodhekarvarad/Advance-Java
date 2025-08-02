import java.applet.*;
import java.awt.*;
public class Testdemo extends Applet
{
	public void init()
	{
		//checkboxgroup example 
		CheckboxGroup cbg = new CheckboxGroup();
	Checkbox c1 = new Checkbox("marathi", true,cbg);
	Checkbox c2 = new Checkbox("hindi", true ,cbg);
	Checkbox c3 = new Checkbox("urdu", false,cbg);
	Checkbox c4 = new Checkbox("sanskruit", true,cbg);
	add(c1);
	add(c2);
	add(c3);
	add(c4); 

	}

}
/* <applet code="Testdemo" width=400 height=400>
</applet>
*/