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
			
			arg0.setFont(new Font("�����ٸ����", Font.BOLD, 15));
			arg0.drawString("��      �� : �ѱ�������б�", 30, 65);
			arg0.drawString("������ : �����", 30, 80);
			arg0.drawString("��      �� :1.1.1", 30, 95);
		}
	}
	
	public InformationDialog() {
		// TODO Auto-generated constructor stub
		
		setSize(300,200);
		
		add(new InfomationPanel());
	}
}
