package myPaint;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;

import oracle.net.aso.p;

public class PaintSideMenu {
	
	JPanel panel;
	JButton line,rect,roundRect,ellipse;
	JButton red,blue,white,black,color;

	
	public JPanel makeSideMenuBar()
	{
		
		line = new JButton(new ImageIcon("line.jpg"));
		rect = new JButton(new ImageIcon("rect.jpg"));
		roundRect = new JButton(new ImageIcon("roundRect.jpg"));
		ellipse = new JButton(new ImageIcon("ellipse.jpg"));
		line.setSize(28,28);
		
		red = new JButton();
		red.setBackground(Color.red);
		blue = new JButton();
		blue.setBackground(Color.blue);
		black = new JButton();
		black.setBackground(Color.black);
		white = new JButton();
		white.setBackground(Color.white);
		
		color = new JButton("색선택");
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(5,2));
		
		panel.add(line);
		panel.add(rect);
		panel.add(roundRect);
		panel.add(ellipse);
		panel.add(red);
		panel.add(blue);
		panel.add(black);
		panel.add(white);
		panel.add(color);
		
		
		
		JPanel p = new JPanel();
		
		p.add(panel);
		p.setBorder(new BorderUIResource.LineBorderUIResource(Color.black));
		return p;
	}
	
	public void setActionListener(ActionListener e)
	{
		
		line.addActionListener(e);
		rect.addActionListener(e);
		roundRect.addActionListener(e);
		ellipse.addActionListener(e); 
		red.addActionListener(e);
		blue.addActionListener(e);
		black.addActionListener(e);
		white.addActionListener(e);
		color.addActionListener(e);
	}


	public JButton getLine() {
		return line;
	}

	public JButton getRect() {
		return rect;
	}

	public JButton getRoundRect() {
		return roundRect;
	}

	public JButton getEllipse() {
		return ellipse;
	}
	public JButton getBlack() {
		return black;
	}
	public JButton getBlue() {
		return blue;
	}
	public JButton getRed() {
		return red;
	}
	public JButton getWhite() {
		return white;
	}
	

}
