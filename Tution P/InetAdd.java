import java.net.*;
public class InetAdd
{
  public static void main(String args[])
  {
	  try
	  {
      System.out.println("HOST_Name:"+InetAddress.getByName("www.facebook.com"));
	  System.out.println("Mulit caste:"+InetAddress.getAllName("www.facebook.com"));
  }
  
  catch(Exception e)
  {
	  System.out.println(e);
  }
}
}