package note.dialog;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class InformationDialog extends JDialog{
	
	class InfomationPanel extends JPanel
	{
		@Override
		protected void paintComponent(Graphics arg0) {
			// TODO Auto-generated method stub
			super.paintComponent(arg0);
			
			arg0.setFont(new Font("나눔바른고딕", Font.BOLD, 15));
			arg0.drawString("소      속 : 한국교통대학교", 30, 65);
			arg0.drawString("만든사람 : 엄상근", 30, 80);
			arg0.drawString("버      전 :1.1.1", 30, 95);
		}
	}
	
	public InformationDialog() {
		// TODO Auto-generated constructor stub
		
		setSize(300,200);
		
		add(new InfomationPanel());
	}
}
