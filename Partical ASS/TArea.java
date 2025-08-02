import java.awt.*;
import java.applet.*;
public class TArea extends Applet
{
   public void init()
   {
       String val="GUI offers user interaction via some graphical components.Window, Frame, Panel, Button, Textfield, TextArea, Listbox,Combobox, Label, Checkbox etc.Using these components we can create an interactive useran application.GUI provides result to end user in response to raised eventGUI is entirely based event.";
  
     TextArea ta=new TextArea(val,10,30);
	 add(ta);
 }
}
/*<applet code="TArea" width=300 height=400>
</applet>*/