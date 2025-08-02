import java.awt.*;
public class DemoList extends Frame
{
	DemoList()
	{
		List std;
		setVisible(true);
		setSize(400,400);
		std=new List(4,true);
		
		std.add("Vaibhav");
		std.add("Sarvesh");
		std.add("Kalpesh");
		std.add("Nirmal");
		
		add(std);
		
	}
public static void main(String args[])
{
		new DemoList();
}
}
		
	