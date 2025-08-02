import java.awt.*;
import java.applet.*;
public class TU1 extends Applet 
{

	public void init()
	{
		CheckboxGroup cdg=new CheckboxGroup();
		Label l=new Label("CheckBox:-");
		Checkbox c1=new Checkbox("Java");
		Checkbox c2=new Checkbox("STE");
         Checkbox c3=new Checkbox("OSY");
		Label l1=new Label("RadioButton:-"); 
		 Checkbox c4=new Checkbox("Java",false,cdg);
		 	 Checkbox c5=new Checkbox("STE",false,cdg);
			 	 Checkbox c6=new Checkbox("OSY",false,cdg);
		 
		 add(l);
	add(c1);
add(c2);	
		add(c3);
		add(l1);
		add(c4);
		add(c5);
		add(c6);
}
}
/*<applet code="TU1" width=300 height=400>
</applet>*/