package day18Work;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("°è»ê±â");
		JTextField output = new JTextField();
		GridLayout layout = new GridLayout(4,4);
		JPanel body = new JPanel(layout);
		jf.setSize(400,400);
		JButton C = new JButton("C");
		
		JPanel head = new JPanel();
		
		body.add(new JButton("7"));
		body.add(new JButton("8"));
		body.add(new JButton("9"));
		body.add(new JButton("/"));
		body.add(new JButton("4"));
		body.add(new JButton("5"));
		body.add(new JButton("6"));
		body.add(new JButton("*"));
		body.add(new JButton("1"));
		body.add(new JButton("2"));
		body.add(new JButton("3"));
		body.add(new JButton("-"));
		body.add(new JButton("0"));
		body.add(new JButton("+/-"));
		body.add(new JButton("="));
		body.add(new JButton("+"));
		
		head.setLayout(new BorderLayout());

		head.add(output,BorderLayout.PAGE_START);
		head.add(C, BorderLayout.LINE_START);
		
		
	//	jf.add(output, BorderLayout.PAGE_START);
		jf.add(head, BorderLayout.PAGE_START);
		
		jf.add(body, BorderLayout.CENTER);
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
	}

}
