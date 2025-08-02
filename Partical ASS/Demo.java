import java.awt.*;
import java.applet.*;
public class Demo extends Applet
{
   public void init()
   {
	   System.out.println("I am in Init()");
   }
   public void start()
   {
	   System.out.println("I am in Start()");
   }
      public void stop()
   {
	   System.out.println("I am in Stop()");
   }
      public void destroy()
   {
	   System.out.println("I am in Destroy()");
   
   }
}
/*
<applet code="Demo" width=300 height=400>
</applet>*/