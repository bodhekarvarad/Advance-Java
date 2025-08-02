import java.net.*;
public class NonstaticInet
{
	NonstaticInet()
	{
		try
		{
		InetAddress at=InetAddress.getByName("www.facebook.com");
   System.out.println("Address:"+at.getHostAddress());
   System.out.println("Name:"+at.getHostName());
  System.out.println("Multi:"+at.isMCGlobal());

		}
		catch(Exception e)
		{
		}
		}
 public static void main(String args[])
 {
   
   new NonstaticInet();
 }
}