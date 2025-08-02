import java.awt.*;
import javax.swing.*;
public jtabbeddemo extends JApplet
{
	  public void init()
	  {
		
		   JTabbedPane Jp=new JTabbedPane();
		   Jp.addTab("Colors",new Colors());
		   Jp.addTab("Cities",new Cities());
		   Jp.addTab("Flavour",new Flavours());
		  
	  }
}

	  public class Colors extends JPanel
	  {
	  public Colors()
	  {
		  JCheckBox ch=new JCheckBox("Red",true);
		  JCheckBox cy=new JCheckBox("Yellow",false);
		  JCheckBox co=new JCheckBox("Orange",true);
		  add(ch);
		  add(cy);
		  add(co);
	  }
	  }
	  public class Cities extends JPanel
	  {
	  public Cities()
	  {
		  
		  JComboBox<String> jc = new JComboBox<String>();
		  addItem("akola");
		  addItem("nashik");
		  addItem("amravati");
		  add(jc);
				  
	  }
	  }
	  public  class Flavours extends JPanel
	  {
		  public Flavours()
	  {
		  
		  JButton jb1 = new JButton("Chocolate");
		  JButton jb2 = new JButton("Strawberry");
		  JButton jb3 =new JButton("Venilla");
		  Jp.add(jb1);
		  Jp.add(jb2);
		  Jp.add(jb3);	  
	  }
	  
	  	  	
 
 }
 /*
 <applet code="jtabbeddemo" width=300 height=400>
 </applet>*/