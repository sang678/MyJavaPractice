package note.menu;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.TextAction;
import javax.swing.undo.UndoManager;

import note.dialog.FontDialog;
import note.dialog.InformationDialog;

public class NotePadFrame extends JFrame implements ActionListener{
	JTextArea contents;
	Toolkit toolkit;
	File file;
	JFileChooser fileChooser;
	boolean saveAnother = false;
	UndoManager manager = new UndoManager();
	FontDialog fontDialog;
	InformationDialog informationDialog;
	public NotePadFrame() {
		// TODO Auto-generated constructor stub
		
		contents = new JTextArea();
		fileChooser = createJFileChooser();
		NotePadMenu menu = new NotePadMenu();
		toolkit = Toolkit.getDefaultToolkit();
		fontDialog= new FontDialog(this);
		informationDialog = new InformationDialog();
	
		
		
		contents.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK), "undo");
		contents.getActionMap().put("undo", new TextAction("undo") {
		    public void actionPerformed(ActionEvent e) {
		        if (manager.canUndo()) manager.undo();
		    }
		});
		contents.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_MASK), "redo");
		contents.getActionMap().put("redo", new TextAction("redo") {
		    public void actionPerformed(ActionEvent e) {
		        if (manager.canRedo()) manager.redo();
		    }
		}); 
		
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("�޸���");
		setSize(800, 600);
		setLocation((toolkit.getScreenSize().width-this.getWidth())/2, (toolkit.getScreenSize().height-this.getHeight())/2);
		
		
		
		
		
		contents.getDocument().addUndoableEditListener(manager);
		
	
		
		JScrollPane scroll = new JScrollPane(contents);
		setJMenuBar(menu.makeMenuBar());
		add(scroll, BorderLayout.CENTER);
		
		
		menu.setActionListener(this);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//�޴� - ����
		if(arg0.getActionCommand().equals("���θ���� (N)"))
		{
			newMemo();		
		}
		else if(arg0.getActionCommand().equals("���� (O)"))
		{
			loadFile();
		}
		else if(arg0.getActionCommand().equals("���� (S)"))
		{
			saveFile();
		}
		else if(arg0.getActionCommand().equals("�ٸ��̸����� ���� (A)"))
		{
			saveAnother = true;
			saveFile();
			saveAnother = false;
			fileChooser.setDialogTitle("����");
		}
		else if(arg0.getActionCommand().equals("������ (X)"))
		{
			this.dispose();
		}
		
		//�޴� - ����
		if(arg0.getActionCommand().equals("�ǵ����� (U)"))
		{
			 if (manager.canRedo()) manager.redo();
		}
		else if(arg0.getActionCommand().equals("������� (Z)"))
		{
			 if (manager.canUndo()) manager.undo();
		}
		else if(arg0.getActionCommand().equals("�߶󳻱� (T)"))
		{
			//contents.cut();
		}
		else if(arg0.getActionCommand().equals("���� (C)"))
		{
			//contents.copy();
		}
		else if(arg0.getActionCommand().equals("�ٿ��ֱ� (P)"))
		{
			//contents.paste();
		}
		else if(arg0.getActionCommand().equals("��μ��� (A)"))
		{
			contents.selectAll();
		}
		
		//�޴� - ����
		if(arg0.getActionCommand().equals("�۲� (F)"))
		{
						
			fontDialog.setBounds(getX()+40,getY()+70,530,320); 
			fontDialog.setNowUseFont(contents.getFont());
			fontDialog.setVisible(true);

			
		    Font ft= fontDialog.fontSet();
		      
		    contents.setFont(ft);
		}
		
		
		if(arg0.getActionCommand().equals("���� ���� (H)"))
		{
		
		}
		else if(arg0.getActionCommand().equals("���α׷� ���� (A)"))
		{
			informationDialog.setLocation(getX()+50,getY()+50);
			informationDialog.setVisible(true);
		}
	}
	
	public void newMemo()
	{
		
		if(!contents.getText().equals(""))
		{
			final Dialog save = new Dialog(this, "���� �Ͻðڽ��ϱ�?", true);
			JButton yes = new JButton("����");
			JButton no = new JButton("�ƴϿ�");
			JButton cancel = new JButton("���");
			
		
			save.setLayout(new BorderLayout());
			
			yes.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					saveFile();
					contents.setText("");
					file = null;
					save.dispose();
					setTitle("�޸��� - ������");
				}
			});
			
			no.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					contents.setText("");
					setTitle("�޸��� - �� ����");
					file = null;
					save.dispose();
				}
			});
			
			cancel.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					save.dispose();
				}
			});
			
			JPanel head = new JPanel();
			head.add(new JLabel("����� ���¸� ���� �Ͻðڽ��ϱ�?"),BorderLayout.CENTER);
			JPanel center = new JPanel();
			
			save.add(head,BorderLayout.PAGE_START);
			save.setSize(300, 100);
			save.setLocation((toolkit.getScreenSize().width-save.getWidth())/2, (toolkit.getScreenSize().height-save.getHeight())/2);
			
			center.setLayout(new FlowLayout());
			center.add(yes);
			center.add(no);
			center.add(cancel);
			save.add(center, BorderLayout.CENTER);
						
			
			
			//save.setLocation();
			
			save.setVisible(true);
			
		}
		else
		{
			setTitle("�޸��� - �� ����");
		}
		
		
			 
	}
	
	
	public void saveFile()
	{
			
		if(file == null || saveAnother)
		{
			if(saveAnother)
				fileChooser.setDialogTitle("�ٸ� �̸����� ����");
			
			if(fileChooser.showSaveDialog(this) == fileChooser.APPROVE_OPTION)
			{
				file = fileChooser.getSelectedFile();
			}
			else
			{	return; }
		}
		
		
	
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(file);
			fout.write(contents.getText().getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(file != null)
				setTitle(file.getPath());
		}
		
	}
	
	public void loadFile()
	{
		fileChooser.showOpenDialog(this);
		int ch ;
		String data = "";
		file = fileChooser.getSelectedFile();
		if(file == null)
				return;
		
		
		FileInputStream fin = null;
		InputStreamReader in = null;
		try {
			fin = new FileInputStream(file);
			in = new InputStreamReader(fin);
			while((ch = in.read()) != -1)
				data += (char)ch;
			
			contents.setText(data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fin.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setTitle(file.getPath());
		}
		
	}
		
	public JFileChooser createJFileChooser()
	{
		JFileChooser fileChooser = new JFileChooser()
		{
			@Override
			public void approveSelection() {
				// TODO Auto-generated method stub
				File f = getSelectedFile();
		        if(f.exists() && getDialogType() == SAVE_DIALOG){
		            int result = JOptionPane.showConfirmDialog(this,"The file exists, overwrite?","Existing file",JOptionPane.YES_NO_CANCEL_OPTION);
		            switch(result){
		                case JOptionPane.YES_OPTION:
		                    super.approveSelection();
		                    return;
		                case JOptionPane.NO_OPTION:
		                    return;
		                case JOptionPane.CLOSED_OPTION:
		                    return;
		                case JOptionPane.CANCEL_OPTION:
		                    cancelSelection();
		                    return;
		            }
		        }
				
				super.approveSelection();
			}
		};
		
		 fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + "//" + "Desktop"));
		 FileNameExtensionFilter filter = new FileNameExtensionFilter("txt ����", "txt");
		 fileChooser.addChoosableFileFilter(filter);
		 fileChooser.setFileFilter(filter);
		
		return fileChooser;
	}
	
	public static void main(String args[])
	{
		NotePadFrame notepad = new NotePadFrame();
	}
}


