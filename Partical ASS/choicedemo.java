import java.awt.*;
import java.applet.*;
public class choicedemo extends Applet 
{


public void init()
{
  Choice c1 = new Choice();
  Choice c2 = new Choice();
  c1.add("windows");
  c1.add("solaris");
  c2.add("mac");
   c2.add("android");

add(c1);
add(c2);


}
}
/* 
<applet code="choicedemo" width=400 height=300>
</applet>

*/