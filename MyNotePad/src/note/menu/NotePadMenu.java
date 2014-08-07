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
		
		menuFile = new JMenu("파일 (F)");
		newMemo = new JMenuItem("새로만들기 (N)");
		openMemo = new JMenuItem("열기 (O)");
		saveMemo = new JMenuItem("저장 (S)");
		saveAnotherName = new JMenuItem("다른이름으로 저장 (A)");
		closeProgram = new JMenuItem("끝내기 (X)");
		
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
	
		menuEdit = new JMenu("편집 (E)");
		redo = new JMenuItem("되돌리기 (Y)");
		undo = new JMenuItem("실행취소 (Z)");
		cut = new JMenuItem(new DefaultEditorKit.CutAction());
		cut.setText("잘라내기 (T)");
		copy = new JMenuItem(new DefaultEditorKit.CopyAction());
		copy.setText("복사 (C)");
		paste = new JMenuItem(new DefaultEditorKit.PasteAction());
		paste.setText("붙여넣기 (P)");
		selectAllText = new JMenuItem("모두선택 (A)");
		
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
		
		menuForm = new JMenu("서식 (O)");
		autoLineChange = new JCheckBoxMenuItem("자동 줄바꿈 (W)");
		font = new JMenuItem("글꼴 (F)");

		menuForm.setMnemonic('o');
		autoLineChange.setMnemonic('o');
		font.setMnemonic('f');
		
		menuForm.add(autoLineChange);
		menuForm.add(font);
	
		menuView = new JMenu("보기 (V)");
		statusBar = new JMenuItem("상태 표시줄 (S)");
	
		menuView.setMnemonic('v');
		statusBar.setMnemonic('s');
		
		menuView.add(statusBar);	
		
		menuHelper = new JMenu("도움말 (H)");
		showHelper = new JMenuItem("도움말 보기 (H)");
		showAplicationInfo = new JMenuItem("프로그램 정보 (A)");
		
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
