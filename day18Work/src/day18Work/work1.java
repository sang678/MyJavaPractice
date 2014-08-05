package day18Work;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame("마일을 킬로미터로 변환");
		JLabel text = new JLabel("거리를 마일단위로 입력하시오");
		JTextField input  =  new JTextField(5);
		JButton bt = new JButton("변환");
		JTextField output  =  new JTextField();
		JPanel head = new JPanel(); 
		
		//head.setLayout(new BorderLayout());
		
		
		
		head.add(text);
		head.add(input);
		
		jf.setSize(400, 300);
		
		jf.add(head, BorderLayout.PAGE_START);
		jf.add(bt, BorderLayout.CENTER);

		jf.add(output, BorderLayout.PAGE_END);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

}
