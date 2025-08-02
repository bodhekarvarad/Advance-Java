import javax.swing.*;
import java.awt.*;
public class Jframedemo
{
  public static void main(String args[])
  {
  Frame f = new Frame("new frame");
  Frame f1 = f;
  Frame f2 = f1;
  f.setSize(400,500);
  f1.setSize(786,233);
  f2.setSize(880,456);
  f.setVisible(true);
  f1.setVisible(true);
  f2.setVisible(true);
  
  
  }



}