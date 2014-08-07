package note.dialog;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontDialog extends Dialog implements ActionListener, ItemListener
{
  private Label jfdl1 = new Label();
  private Label jfdl2 = new Label();
  private Label jfdl3 = new Label();
  private Label jfdl4 = new Label();
  private Label jfdl5 = new Label();
  private Label jfdl6 = new Label();
  private TextField jfdtf1 = new TextField();
  private TextField jfdtf2 = new TextField();
  private TextField jfdtf3 = new TextField();
  private List jfdls1 = new List();
  private List jfdls2 = new List();
  private List jfdls3 = new List();
  private Choice jfdcb = new Choice();
  private Button jfdb1 = new Button();
  private Button jfdb2 = new Button();
  private TextField jfdtf4 = new TextField();
  Graphics g;
 
 Font f;
 String fontname="SansSerif";
 int fontstyle=Font.PLAIN;
 int size=8;
 
  String [] allFonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
  private String [] allSizes = {"8","9","10","11","12","14","16","18","20","22","24","26","28","36","48","72"};
  private String [] allStyle ={"보통","기울임꼴","굵게","굵은 기울임꼴"};
  public FontDialog(Frame parent) 
 {
    super(parent,"글꼴",true);
  
  setResizable(false);
  addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){dispose();}});
      setLayout(null);
  
  for(int i=0;i<allFonts.length;i++)
  {
  jfdls1.add(allFonts[i]);
  }
  
  for(int i=0;i<16;i++)
  {
   jfdls3.add(allSizes[i]);
  }  
  
  for(int i=0;i<4;i++)
  {
   jfdls2.add(allStyle[i]);
  }
    jfdl1.setText("글꼴");
    jfdl1.setBounds(10, 24, 98, 26);
    jfdl2.setText("글꼴 스타일");
    jfdl2.setBounds(198, 26, 98, 26);
    jfdl3.setText("크기");
    jfdl3.setBounds(340, 24, 98, 26);
    jfdl4.setText("보기");
  jfdl4.setBounds(266,157,49,25);
  jfdl5.setText("스크립트");
    jfdl5.setBounds(266, 236, 98, 25);
    jfdtf1.setBounds(10, 49, 181, 24);
    jfdtf2.setBounds(201, 49, 129, 24);
    jfdtf3.setBounds(340, 49, 91, 24);
    jfdls1.setBounds(10, 77, 181, 79);
  jfdls1.addItemListener(this);
    jfdls2.setBounds(201, 77, 129, 79);
  jfdls2.addItemListener(this);
    jfdls3.setBounds(340, 77, 91, 79);
  jfdls3.addItemListener(this);
    jfdcb.setBounds(258, 263, 180, 22);
    jfdb1.setBounds(436, 51, 82, 28);
    jfdb1.setLabel("확인");
  jfdb1.addActionListener(this);
    jfdb2.setBounds(436, 85, 82, 28);
    jfdb2.setLabel("취소");
  jfdb2.addActionListener(this);

  add(jfdcb);
  add(jfdl4);
  add(jfdl5);
  add(jfdl1);
  add(jfdtf1);
  add(jfdls1);
  add(jfdb1);
  add(jfdb2);
  add(jfdls3);
  add(jfdl3);
  add(jfdtf3);
  add(jfdls2);
  add(jfdtf2);
  add(jfdl2);  
  
  jfdl6.setBounds(212, 190,220,40);
  jfdl6.setText("가나다AaBbYyZz");
  add(jfdl6);
 }
  public void paint(Graphics g)
  {
   g.setColor(Color.lightGray);
   g.draw3DRect (202, 182, 232, 50,false);
   g.setColor(Color.black);  
  }
  
  public Font fontSet()
  {
   jfdls1.getSelectedItem();
   fontname=jfdls1.getSelectedItem();
   
   if(jfdls2.getSelectedItem().equals("보통"))
    fontstyle=Font.PLAIN;
   if(jfdls2.getSelectedItem().equals("기울임꼴"))
    fontstyle=Font.ITALIC;   
   if(jfdls2.getSelectedItem().equals("굵게"))
    fontstyle=Font.BOLD;
   if(jfdls2.getSelectedItem().equals("굵은 기울임꼴"))
    fontstyle=Font.ITALIC+Font.BOLD;
   
   if(jfdls3.getSelectedItem() != null)
   {
	   jfdtf3.setText(jfdls3.getSelectedItem());   
	    size=Integer.parseInt(jfdls3.getSelectedItem());
   }
   else
   {
	   size=Integer.parseInt(jfdtf3.getText());
   }
   
   return f=new Font(fontname,fontstyle,size);
  }
  
  public void setNowUseFont(Font font)
  {
	  
	  String selectedFont = null;
	  int i;
	  if(font.getStyle() == Font.PLAIN)
	  {
		  selectedFont = "보통";
	  }
	  else if(font.getStyle() == Font.ITALIC)
	  {
		  selectedFont = "기울임꼴";
	  }
	  else if(font.getStyle() == Font.BOLD)
	  {
		  selectedFont = "굵게";
	  }
	  else if(font.getStyle() == (Font.ITALIC+Font.BOLD))
	  {
		  selectedFont = "굵은 기울임꼴";
	  }
	  
	  for(i=0; i<jfdls2.getItemCount(); i++)
	  {
		  if(selectedFont.equals(jfdls2.getItem(i)))
		  {
			  jfdls2.select(i);
			  jfdtf2.setText(jfdls2.getItem(i));
			  break;
		  }
				
	  }
	  
	  for(i=0; i<jfdls1.getItemCount(); i++)
	  {
		  if(jfdls1.getItem(i).equals(font.getFamily()))
		  {
			  jfdls1.select(i);
			  jfdtf1.setText(font.getFamily());
			  break;
		  }
		  else
		  {
			  jfdtf1.setText(font.getFamily());
		  }
				
	  }
	  
	  for(i=0; i<jfdls3.getItemCount(); i++)
	  {
		  if(Integer.parseInt(jfdls3.getItem(i)) == font.getSize())
		  {
			  jfdls3.select(i);
			  jfdtf3.setText(jfdls3.getItem(i));
			  break;
		  }
		  else if(i == jfdls3.getItemCount()-1)
		  {
			  jfdtf3.setText(font.getSize()+"");
		  }
				
	  }
	  
  }
  
  @Override
	public void itemStateChanged(ItemEvent ae) {
		// TODO Auto-generated method stub
	 
	  if((ae.getSource()).equals(jfdls1))
	   {
	    jfdtf1.setText(jfdls1.getSelectedItem());
	    fontname=jfdls1.getSelectedItem();
	    f=new Font(fontname,fontstyle,size);
	    jfdl6.setFont(f); 
	   }
	   else if((ae.getSource()).equals(jfdls2))
	   {
	    jfdtf2.setText(jfdls2.getSelectedItem());
	    
	    if(jfdls2.getSelectedItem().equals("보통"))
	     fontstyle=Font.PLAIN;
	    if(jfdls2.getSelectedItem().equals("기울임꼴"))
	     fontstyle=Font.ITALIC;   
	    if(jfdls2.getSelectedItem().equals("굵게"))
	     fontstyle=Font.BOLD;
	    if(jfdls2.getSelectedItem().equals("굵은 기울임꼴"))
	     fontstyle=Font.ITALIC+Font.BOLD;
	   
	    f=new Font(fontname,fontstyle,size);
	    jfdl6.setFont(f);   
	   }
	   else if((ae.getSource()).equals(jfdls3))
	   {
	    jfdtf3.setText(jfdls3.getSelectedItem());   
	    size=Integer.parseInt(jfdls3.getSelectedItem());
	    f=new Font(fontname,fontstyle,size);
	    jfdl6.setFont(f);  
	   }
	}
  
  public void actionPerformed(ActionEvent ae)
  {
	  
  
   if((ae.getSource()).equals(jfdb1))
   {
    dispose();
   }
   else if((ae.getSource()).equals(jfdb2))
   {
    dispose();
   }
  }  
 }