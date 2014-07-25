package ac.crazycow.chat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;



public class MyTestForGUI extends JFrame implements KeyListener, ActionListener{

	JTextArea jta = new JTextArea();
	JTextField jtf= new JTextField(63);
	JButton jbt = new JButton("입력");
	Client client;
	
	
	public MyTestForGUI() {
		// TODO Auto-generated constructor stub
		
		setTitle("TEST");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
	
		
		JMenuBar jmenubar = new JMenuBar();
		JMenu jmenu = new JMenu("sss");
		
		JScrollPane scrollPane = new JScrollPane(jta);
		
		
		jmenubar.add(jmenu);
		
		
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(screenSize.width/2, 150);
		
		jta.setSize(800,450);
		jta.setEnabled(false);
		
		
		jtf.setSize(700,50);
		jtf.addKeyListener(this);
		
		jbt.setSize(100,50);
		jbt.addActionListener(this);
		
		
		jmenubar.setSize(500, 100);
		

		add(jmenu,BorderLayout.PAGE_START);
		//add(jta,BorderLayout.CENTER);
		add(scrollPane,BorderLayout.CENTER);
	
		JPanel jp = new JPanel();
		jp.add(jtf);
		
		jp.add(jbt);
		add(jp,BorderLayout.PAGE_END);
		//add(jtf,BorderLayout.PAGE_END);
		//add(jbt,BorderLayout.PAGE_END);
		
		
				
		client = new Client();
		client.start();
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == jbt){
			client.ClientSender(jtf.getText());
			jtf.setText("");
			  }
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			client.ClientSender(jtf.getText());
			jtf.setText("");
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyTestForGUI my = new MyTestForGUI();
		
		
		

	}

	
	
	public class Client {

		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner scan = new Scanner(System.in);
		
		
		public void start()
		{
			 try {
				client = new Socket("IP 입력", 5000);
				out = new PrintWriter(client.getOutputStream(),true);
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				ClientReceiver receiver= new ClientReceiver();
				
				
				receiver.start();
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
			
			}
			 
		}
	
		
		public class ClientReceiver extends Thread{
						
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				String s = "";
			
				try {
					
					while((s=in.readLine()) != null)
					{
						jta.append(s + "\n");
						jta.setCaretPosition(jta.getDocument().getLength()); 
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					
				
				}
			}

		}
		
		public void ClientSender(String s)
		{
				
			   out.println(s);				
			
			  
				
			
			
		}


	}
}
