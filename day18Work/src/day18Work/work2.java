package day18Work;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("이자 계산기");
		JLabel text = new JLabel("원금을 입력하세요");
		JTextField input  =  new JTextField(8);
		JLabel text2 = new JLabel("이율을 입력하세요");
		JTextField input2  =  new JTextField(8);
		JButton bt = new JButton("변환");
		JTextField output  =  new JTextField();
		JPanel head = new JPanel(); 
		JPanel head2 = new JPanel();
		JPanel head3 = new JPanel();
		//head.setLayout(new BorderLayout());
		
		
		
		head.add(text);
		head.add(input);
		head2.add(text2);
		head2.add(input2);
		
		head3.setLayout(new BorderLayout());
		head3.add(head,BorderLayout.PAGE_START);
		head3.add(head2,BorderLayout.PAGE_END);
		
		
		jf.setSize(400, 300);
		
		jf.add(head3, BorderLayout.PAGE_START);
		//jf.add(head2, BorderLayout.);
		jf.add(bt, BorderLayout.CENTER);

		jf.add(output, BorderLayout.PAGE_END);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);

	}

}
