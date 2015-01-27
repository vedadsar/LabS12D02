package sockets;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.sound.midi.SysexMessage;

public class Server {

	public static final int port = 6969;
	
	
	public static void startServer() throws IOException{
		
		ServerSocket ss = new ServerSocket(port);
		System.out.println("Waiting for connection");
		Socket client = ss.accept();
		System.out.println("Connected!");	
		OutputStream os = client.getOutputStream();				
		
		while(true){						
			String s = " 124512521512512";
			os.write(s.getBytes());		
			
			
			
		}		
	}
	
	public static void main(String[] args) {
		try {
			startServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
