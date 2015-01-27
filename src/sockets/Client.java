package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	private static String ip = "127.0.0.1";
	private static int port = 6969;
	
	private static void connect() throws UnknownHostException, IOException{
		
		Socket client = new Socket(ip, port);
		InputStream is = client.getInputStream();
		
		StringBuilder sb = new StringBuilder();
		int byteRead = 0;
		int msgLength = is.read();
		byte[] buffer = new byte[msgLength];
		
		while ((byteRead += is.read(buffer)) >= 0) {
			sb.append(new String(buffer)).append("\n\n");
		}
		System.out.println(sb.toString());
		is.close();
	}
	
	public static void main(String[] args) {
		
		
		try {
			connect();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
