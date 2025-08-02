package Java;
import java.awt.*;

public class Q_4  extends Frame{
	
	
	Q_4()
	{
		setSize(500,600);
		setVisible(true);
		setLayout(new BorderLayout());
		add(new Button("North"),BorderLayout.NORTH);
		add(new Button("South"),BorderLayout.SOUTH);
		add(new Button("EAST"),BorderLayout.EAST);
		add(new Button("Center"),BorderLayout.CENTER);
		add(new Button("WEST"),BorderLayout.WEST);
	
	}

	public static void main(String[] args) {
new Q_4();
		
		// TODO Auto-generated method stub

	}

}
