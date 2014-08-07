package note.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit;

public class NotePadMenu {
	JMenuBar menubar;
	JMenu menuFile;
	JMenuItem newMemo;
	JMenuItem openMemo;
	JMenuItem saveMemo;
	JMenuItem saveAnotherName;
	JMenuItem closeProgram;
	
	JMenu menuEdit;
	JMenuItem redo; 
	JMenuItem undo; 
	JMenuItem cut;
	JMenuItem copy; 
	JMenuItem paste;
	JMenuItem selectAllText;
	
	JMenu menuForm;
	JCheckBoxMenuItem autoLineChange;
	JMenuItem font;

	JMenu menuView;
	JMenuItem statusBar;
	
	JMenu menuHelper;
	JMenuItem showHelper;
	JMenuItem showAplicationInfo;
	
	public JMenuBar makeMenuBar()
	{
		menubar = new JMenuBar();
		
		menuFile = new JMenu("���� (F)");
		newMemo = new JMenuItem("���θ���� (N)");
		openMemo = new JMenuItem("���� (O)");
		saveMemo = new JMenuItem("���� (S)");
		saveAnotherName = new JMenuItem("�ٸ��̸����� ���� (A)");
		closeProgram = new JMenuItem("������ (X)");
		
		newMemo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		openMemo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		saveMemo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		saveAnotherName.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		
		menuFile.setMnemonic('f');
		newMemo.setMnemonic('n');
		openMemo.setMnemonic('o');
		saveMemo.setMnemonic('s');
		saveAnotherName.setMnemonic('a');
		closeProgram.setMnemonic('x');
		
		menuFile.add(newMemo);
		menuFile.add(openMemo);
		menuFile.add(saveMemo);
		menuFile.add(saveAnotherName);
		menuFile.addSeparator();
		menuFile.add(closeProgram);
	
		menuEdit = new JMenu("���� (E)");
		redo = new JMenuItem("�ǵ����� (Y)");
		undo = new JMenuItem("������� (Z)");
		cut = new JMenuItem(new DefaultEditorKit.CutAction());
		cut.setText("�߶󳻱� (T)");
		copy = new JMenuItem(new DefaultEditorKit.CopyAction());
		copy.setText("���� (C)");
		paste = new JMenuItem(new DefaultEditorKit.PasteAction());
		paste.setText("�ٿ��ֱ� (P)");
		selectAllText = new JMenuItem("��μ��� (A)");
		
		redo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
		undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
		cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
		selectAllText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		
		
		menuEdit.setMnemonic('e');
		redo.setMnemonic('y');
		undo.setMnemonic('z');
		copy.setMnemonic('c');
		paste.setMnemonic('v');
		cut.setMnemonic('x');
		selectAllText.setMnemonic('a');
		
		menuEdit.add(redo);
		menuEdit.add(undo);
		menuEdit.addSeparator();
		menuEdit.add(cut);
		menuEdit.add(copy);
		menuEdit.add(paste);
		menuEdit.addSeparator();
		menuEdit.add(selectAllText);
		
		menuForm = new JMenu("���� (O)");
		autoLineChange = new JCheckBoxMenuItem("�ڵ� �ٹٲ� (W)");
		font = new JMenuItem("�۲� (F)");

		menuForm.setMnemonic('o');
		autoLineChange.setMnemonic('o');
		font.setMnemonic('f');
		
		menuForm.add(autoLineChange);
		menuForm.add(font);
	
		menuView = new JMenu("���� (V)");
		statusBar = new JMenuItem("���� ǥ���� (S)");
	
		menuView.setMnemonic('v');
		statusBar.setMnemonic('s');
		
		menuView.add(statusBar);	
		
		menuHelper = new JMenu("���� (H)");
		showHelper = new JMenuItem("���� ���� (H)");
		showAplicationInfo = new JMenuItem("���α׷� ���� (A)");
		
		menuHelper.setMnemonic('h');
		showHelper.setMnemonic('h');
		showAplicationInfo.setMnemonic('a');
		
		menuHelper.add(showHelper);
		menuHelper.addSeparator();
		menuHelper.add(showAplicationInfo);
		
		menubar.add(menuFile);
		menubar.add(menuEdit);
		menubar.add(menuForm);
		menubar.add(menuView);
		menubar.add(menuHelper);
		
		return menubar;
	}
	
	public void setActionListener(ActionListener e)
	{
		
		newMemo.addActionListener(e);
		openMemo.addActionListener(e);
		saveMemo.addActionListener(e);
		saveAnotherName.addActionListener(e);
		closeProgram.addActionListener(e);
		
		redo.addActionListener(e);
		undo.addActionListener(e); 
		cut.addActionListener(e);
		copy.addActionListener(e); 
		paste.addActionListener(e);
		selectAllText.addActionListener(e);
		
		autoLineChange.addActionListener(e);
		font.addActionListener(e);

		statusBar.addActionListener(e);
		
		showHelper.addActionListener(e);
		showAplicationInfo.addActionListener(e);
		
	}

}
