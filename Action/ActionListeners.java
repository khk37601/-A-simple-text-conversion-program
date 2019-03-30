package com.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.GetterSetter.FileRead_Write;

public class ActionListeners  implements ActionListener 
{

	JFileChooser chooser;
	JLabel imageLabel = new JLabel();

	FileRead_Write r      =  new FileRead_Write(); //getter,setter Ŭ����
	FileWirtes     w      =  null; // ���� ���� Ŭ����
	TransforTxt    trans  =  null; // java ������ txt���Ϸ� ��ȯ��ļ�ִ� Ŭ����
	
	public ActionListeners()
	{
		//���� ���̾�α� ����
		chooser = new JFileChooser();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
          FileNameExtensionFilter filter = new FileNameExtensionFilter
        		  ("java " ,"java");
          chooser.setFileFilter(filter);
          
          // ���� ���̾�α� ���
          int ret = chooser.showOpenDialog(null);
		 
          if(ret != JFileChooser.APPROVE_OPTION)
          {
        	  JOptionPane.showMessageDialog(null,"������ ���� ���� �ʾҽ��ϴ�","���",JOptionPane.WARNING_MESSAGE );
              return;
          } 
          
          //file��� ����
          r.setFilepath(chooser.getSelectedFile().getPath());
          //���� �̸� ����
          r.setName(chooser.getSelectedFile().getName());
           
          
          //������ Ȯ���� �̸��� ������ �̸� ����
          trans = new TransforTxt(r.getName(), r);
          
          //java ������ txt ���Ϸ� ����.
          try {w = new FileWirtes(r.getFilepath(), r.getName());} catch (IOException e1) {e1.printStackTrace();}
     
          
          //���� ������ ����
          imageLabel.setIcon(new ImageIcon(r.getFilepath()));
       
          
	}
	

}
