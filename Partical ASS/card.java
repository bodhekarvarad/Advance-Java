// cardLayout demo
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class carddemo extends Applet implements ActionListener
{
    CardLayout cardo;
	Button fstbtn,scdbtn,nxtbtn,pvsbtn;
	Panel btnPanel;
	public void init()
	{
	 setLayout(new CardLayout());
	 btnPanel = new Panel();
	 btnPanel.add(cardo);
	 fstbtn= new Button("first");
	 scdbtn= new Button("second");
	 nxtbtn= new Button("next");
	 pvsbtn= new Button("previous");
	 add(fstbtn);
	 add(scdbtn);
	 add(nxtbtn);
	 add(pvsbtn);
	 Panel subpanel = new Panel();
	 subPanel.add(fstbtn);
	 subPanel.add(scdbtn);
	 Panel subpanel2 = new Panel();
	  subPanel2.add(nxtbtn);
	 subPanel2.add(pvsbtn);
	 btnPanel.add(subPanel);
	 btnPanel.add(subPanel2);
	 add(cardo);
	}

public void actionPerformed(ActionEvent ae)
{
	
	if(ae.getSource()==fstbtn)
	{
		
		cardo.first(btnPanel);
	}
		else if( ae.getSource()==scdbtn)
		{
			
		cardo.last(btnPanel);	
				
		}
		else if(ae.getSource()==nxtbtn)
		{
			
			cardo.next(btnPanel);
			
		}
		else{
			
			cardo.previous(btnPanel);
			
		}
	}
	
}

