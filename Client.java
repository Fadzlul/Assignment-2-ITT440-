import java.net.*;
import java.io.*;

public class Client{
	public static void main(String [] args)throws IOException{
	Socket myclient1 = new Socket("912.168.35.131" ,7777);
	DataOutputStream outtoserver = new DataOutputStream(myclient1.getOutputStream());
	BufferedReader infromuser = new BufferedReader(new InputStreamReader(System.in));
	String sentence = infromuser.readLine();
	outtoserver.writeBytes(sentence);
	myclient1.close();
}
}
