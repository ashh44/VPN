import java.net.*;
import java.io.*;
class ipclient
{
public static void main(String args[])
{
try
{
	InetAddress ia=InetAddress.getLocalHost();
	System.out.println("The client system address is:"+ia);
	}
	catch(IOException e)
	{
	System.out.println("The exception is:"+e);
	}
}	}