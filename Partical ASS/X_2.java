import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="X_2" width=300 height=100>
</applet>
*/
public class X_2 extends Applet implements KeyListener 
{
String msg = "";
int X = 10, Y = 20;
public void init() 
{
addKeyListener(this);
}
public void keyPressed(KeyEvent ke) 
{
showStatus("Key Pressed");
int key = ke.getKeyCode();
switch(key) 
{
case KeyEvent.VK_F1:
msg += "You Pressed F1 key";
break;
case KeyEvent.VK_F2:
msg += "You Pressed F2 key";
break;
case KeyEvent.VK_F3:
msg += "You Pressed F3 key";
break;
case KeyEvent.VK_F4:
msg += "You Pressed F4 key";
break;
case KeyEvent.VK_F5:
msg += "You Pressed F5 key";
break;
case KeyEvent.VK_F6:
msg += "You Pressed F6 key";
break;
case KeyEvent.VK_PAGE_DOWN:
msg += "You Pressed DOWN arrow key";
break;
case KeyEvent.VK_PAGE_UP:
msg += "You Pressed UP arrow key";
break;
case KeyEvent.VK_LEFT:
msg += "You Pressed LEFT arrow key";
break;
case KeyEvent.VK_RIGHT:
msg += "You Pressed Right arrow key";
break;
}
repaint();
}
public void keyReleased(KeyEvent ke) 
{
showStatus("Key Released");
}
public void keyTyped(KeyEvent ke) 
{
msg += ke.getKeyChar();
//repaint();
}
public void paint(Graphics g) 
{
g.drawString(msg, X, Y);
}
}