import java.net.*;
import java.io.*;

public class loadbalancer{
	public static void main(String [] args)throws IOException
	{	
	ServerSocket s=new ServerSocket(7777);
	while(true)
	{
	Socket connectionsocket=s.accept();
	BufferedReader messagefromclient = new BufferedReader(new InputStreamReader(connectionsocket.getInputStream())):
	String clientsentence=messagefromclient.readLine();
	
	if(clientsentence.contains("Hello")
	{
	Socket server=new Socket("192.168.159.128" ,3333);
	DataOutputStream outtoserver=new DataOutputStream(server.getOutputStream());
	outtoserver.writeBytes(clientsentnce+"\n");
	server.close();
	}

	else if(clientsentnce.contains("Hai"))
	{
	Socket server1=new Socket("912.168.159.130" ,8888);
	DataOutputStream outtoserver=new DataOutputStream(server1.getOutputStream());
	outtoserver.writeBytes(clientsentece+"\n");
	server1.close();
	}

	else
	{
	System.out.println("ERROR!!");
	}
	
	}
	}
}
