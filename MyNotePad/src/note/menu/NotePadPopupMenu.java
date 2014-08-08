package note.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit;

public class NotePadPopupMenu extends JPopupMenu{
	
	JTextArea ta;
	JMenuItem redo,undo,cut,copy,paste,selectAllText;
	
	public NotePadPopupMenu(JTextArea ta) {
		// TODO Auto-generated constructor stub
		this.ta = ta;
		
	
		redo = new JMenuItem("되돌리기 (Y)");
		undo = new JMenuItem("실행취소 (U)");
		cut = new JMenuItem(new DefaultEditorKit.CutAction());
		cut.setText("잘라내기 (T)");
		copy = new JMenuItem(new DefaultEditorKit.CopyAction());
		copy.setText("복사 (C)");
		paste = new JMenuItem(new DefaultEditorKit.PasteAction());
		paste.setText("붙여넣기 (P)");
		selectAllText = new JMenuItem("모두선택 (A)");
		
		redo.setMnemonic('y');
		undo.setMnemonic('u');
		copy.setMnemonic('c');
		paste.setMnemonic('p');
		cut.setMnemonic('t');
		selectAllText.setMnemonic('a');
		
		
		add(redo);
		add(undo);
		addSeparator();
		add(cut);
		add(copy);
		add(paste);
		addSeparator();
		add(selectAllText);
		
		ta.addMouseListener(new MouseAdapter() {
			
			
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				if(e.isPopupTrigger())
					show(e.getComponent(), e.getX(), e.getY());
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseReleased(e);
				if(e.isPopupTrigger())
					show(e.getComponent(), e.getX(), e.getY());
			}
			
		});
		
	}
	
	public void setActionListener(ActionListener e)
	{
		redo.addActionListener(e);
		undo.addActionListener(e); 
		cut.addActionListener(e);
		copy.addActionListener(e); 
		paste.addActionListener(e);
		selectAllText.addActionListener(e);
	}
	
	
	

}
