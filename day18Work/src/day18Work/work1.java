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
		
		JFrame jf = new JFrame("������ ų�ι��ͷ� ��ȯ");
		JLabel text = new JLabel("�Ÿ��� ���ϴ����� �Է��Ͻÿ�");
		JTextField input  =  new JTextField(5);
		JButton bt = new JButton("��ȯ");
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
