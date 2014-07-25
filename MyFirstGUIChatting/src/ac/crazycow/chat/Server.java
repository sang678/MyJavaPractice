package ac.crazycow.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JFrame;

public class Server {
	
	HashMap<String, PrintWriter> users = new HashMap<String, PrintWriter>();
	
	
	public static void main(String args[])
	{

			new Server().start();
		
		
	}
	
	public void start()
	{
		try {
			ServerSocket server = new ServerSocket(5000);
			Socket forClientSocket;
			
			while(true)
			{
				
				forClientSocket = server.accept();
				
				ServerReceiver receiver = new ServerReceiver(forClientSocket);
				
				receiver.start();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}

	
	public class ServerReceiver extends Thread{
		
		Socket socket;
		
		BufferedReader in;
		PrintWriter out;
		String name;
		
		public ServerReceiver(Socket socket) {
			// TODO Auto-generated constructor stub
			this.socket = socket;
			
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				
			}
			
			
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
		
			
			String s = "";
			try {
				out.println("채팅방에 접속하신걸 환영합니다.");
				while(true)
				{
					
					
					out.println("사용하실 아이디를 입력해주세요 ");
					name = in.readLine();
					if(users.get(name) !=null)
						out.println("해당 아이디가 존재합니다.");
					else if(name.trim().equals(""))
						out.println("공백을 아이디로 사용하실수 없습니다.");
					else 
						break;
				}
				
				users.put(name, out);
				
				
				while((s=in.readLine()) != null)
				{
					broadcast(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				try {
					in.close();
					out.close();
					users.remove(name);
					broadcast("이 방을 나가셨습니다.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		public void broadcast(String s)
		{
			
			Set key_users = users.keySet();
			
			Iterator i = key_users.iterator();
			
			while(i.hasNext())
			{
				PrintWriter out = users.get(i.next());
				out.println(name+ " : "+ s);
			}
			
		}

	}
}
