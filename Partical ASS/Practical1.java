import java.awt.*;
public class Practical1{
public static void main(String args[])
{
Frame f=new Frame("practical1");
f.setLayout(new FlowLayout());
f.setVisible(true);
f.setSize(500,500);
 Label l=new Label("This is label");
 Button btn=new Button("Button");
 TextField txtf=new TextField(8);
 String str="textarea"+ 
 "textarea"+
 "textarea";
 TextArea txta=new TextArea(str,10,50);
 f.add(l); 
 f.add(btn);
 f.add(txtf);
 f.add(txta);
 }
 }