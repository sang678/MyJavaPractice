package day20Work;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Work1 extends JFrame {
	
	JButton left,right;
	JPanel bottom,background;
	JLabel rect;

	
	public Work1() {
		// TODO Auto-generated constructor stub
			
		left = new JButton("왼쪽으로 이동");
		right = new JButton("오른쪽으로 이동 ");
		bottom = new JPanel();
		rect = new JLabel(" ");
		background = new JPanel();
		
		background.setBackground(Color.yellow);
				
		
		rect.setBackground(Color.red);
		rect.setFont(new Font("Serif",Font.HANGING_BASELINE,150));
		rect.setOpaque(true);
		
		background.setSize(500,280);
		background.setLayout(new FlowLayout());
		background.add(rect);
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				rect.setLocation(rect.getX()-10, rect.getY());
				
			}
		});
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				rect.setLocation(rect.getX()+10, rect.getY());
				
			}
		});
		
		
		bottom.add(left);
		bottom.add(right);
		bottom.setLayout(new FlowLayout());
		
		
		add(background, BorderLayout.CENTER);
		add(bottom, BorderLayout.PAGE_END);
		
		setSize(500,300);
		setVisible(true);
		
	}
	
	
	
	public static void main(String agrs[])
	{
		Work1 work = new Work1();
	}

}
