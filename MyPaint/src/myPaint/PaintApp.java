package myPaint;


import javax.swing.*;
import javax.swing.plaf.ColorChooserUI;

import com.sun.javafx.geom.RoundRectangle2D;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;

class MyShape 
{
	Shape shape;
	Color color;
	public MyShape() {
		// TODO Auto-generated constructor stub
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public Color getColor() {
		return color;
	}
	public Shape getShape() {
		return shape;
	}
}


class PaintPanel extends JComponent implements MouseListener,
		MouseMotionListener {
	ArrayList<MyShape> shapes = new ArrayList<MyShape>();
	Point start, end;
	String choice;
	Color color = new Color(255,0,0);

	public PaintPanel() {
		addMouseListener(this);
		addMouseMotionListener(this);
		choice = "ellipse";
		
	}

	public void mousePressed(MouseEvent e) {
		start = new Point(e.getX(), e.getY());
		end = start;
		repaint();
	}

	public void mouseReleased(MouseEvent arg0) {
	
		if(choice.equals("ellipse"))
		{
			Shape r = new Ellipse2D.Float(start.x, start.y, end.x - start.x, end.y - start.y);
			MyShape myshape = new MyShape();
			myshape.setColor(color);
			myshape.setShape(r);
			shapes.add(myshape);
			start = null;
			end = null;
			repaint();
		}
		else if(choice.equals("rect"))
		{
			
			Shape r = new Rectangle(start.x, start.y, end.x - start.x, end.y - start.y);
			MyShape myshape = new MyShape();
			myshape.setColor(color);
			myshape.setShape(r);
			shapes.add(myshape);
			start = null;
			end = null;
			repaint();
		}
		else if(choice.equals("roundRect"))
		{
			Shape r = new java.awt.geom.RoundRectangle2D.Float(start.x, start.y, end.x - start.x, end.y - start.y, 20, 30);
			MyShape myshape = new MyShape();
			myshape.setColor(color);
			myshape.setShape(r);
			shapes.add(myshape);
			start = null;
			end = null;
			repaint();
		}
		else if(choice.equals("line"))
		{
			Shape r = new Line2D.Float(start.x, start.y, end.x, end.y);
			MyShape myshape = new MyShape();
			myshape.setColor(color);
			myshape.setShape(r);
			shapes.add(myshape);
			start = null;
			end = null;
			repaint();
		}
		
	}

	public void mouseDragged(MouseEvent e) {
		end = new Point(e.getX(), e.getY());
		repaint();
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mouseClicked(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseMoved(MouseEvent arg0) {
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
				0.50f));

		for (MyShape s : shapes) {
			g2.setPaint(Color.BLACK);
			g2.draw(s.getShape());
			g2.setPaint(s.getColor());
			g2.fill(s.getShape());
		}
		
		// �ӽ� Ÿ���� �׸���.
		if (start != null && end != null && choice.equals("ellipse")) {
			g2.setColor(Color.PINK);
			g2.drawOval(start.x, start.y, end.x - start.x, end.y - start.y);
		}
		else if(start != null && end != null && choice.equals("rect"))
		{
			g2.setColor(Color.PINK);
			g2.drawRect(start.x, start.y, end.x - start.x, end.y - start.y);
		}
		else if(start != null && end != null && choice.equals("roundRect"))
		{
			g2.setColor(Color.PINK);
			g2.drawRoundRect(start.x, start.y, end.x - start.x, end.y - start.y, 20, 30);
		}
		else if(start != null && end != null && choice.equals("line"))
		{
			g2.setColor(Color.PINK);
			g2.drawLine(start.x, start.y, end.x, end.y);
		}
		
	}
	
	public void setChoice(String choice) {
		this.choice = choice;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}

public class PaintApp extends JFrame implements ActionListener{

	PaintMenu menu;
	PaintSideMenu sideMenu;
	PaintPanel canvas;
	Color color;
	public PaintApp() {
		setSize(800, 600);
		setTitle("그림판");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu = new PaintMenu();
		sideMenu = new PaintSideMenu();
		canvas = new PaintPanel();
		canvas.setBackground(Color.white);
		canvas.setForeground(Color.white);
		
		color = new Color(0,0,0);
				
		this.add(canvas, BorderLayout.CENTER);
		this.setJMenuBar(menu.makeMenuBar());
		menu.setActionListener(this);
		this.add(sideMenu.makeSideMenuBar(),BorderLayout.WEST);
		sideMenu.setActionListener(this);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource() == sideMenu.getRect())
		{
			canvas.setChoice("rect");
		}
		else if(arg0.getSource() == sideMenu.getRoundRect())
		{
			canvas.setChoice("roundRect");
		}
		else if(arg0.getSource() == sideMenu.getEllipse())
		{
			canvas.setChoice("ellipse");
		}
		else if(arg0.getSource() == sideMenu.getLine())
		{
			canvas.setChoice("line");
		}
		
		if(arg0.getActionCommand().equals("색선택"))
		{
			color = new JColorChooser().showDialog(this, "색상 선택", color);
			canvas.setColor(color);
		}
		else if(arg0.getSource() == sideMenu.getRed())
		{
			canvas.setColor(Color.red);
		}
		else if(arg0.getSource() == sideMenu.getBlue())
		{
			canvas.setColor(Color.blue);
		}
		else if(arg0.getSource() == sideMenu.getBlack())
		{
			canvas.setColor(Color.black);
		}
		else if(arg0.getSource() == sideMenu.getWhite())
		{
			canvas.setColor(Color.white);
		}
		
		if(arg0.getActionCommand().equals("종료 (X)"))
		{
			this.dispose();
		}
		else if(arg0.getActionCommand().equals("프로그램 정보 (A)"))
		{
			new InformationDialog().setVisible(true);
		}
		
	}
	

	public static void main(String[] args) {
		new PaintApp();
	}
}
