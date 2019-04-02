package com.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.FileIo.FileWirtes;
import com.GetterSetter.FileRead_Write;

public class ActionListeners  implements ActionListener 
{

	JFileChooser chooser;
	JLabel imageLabel = new JLabel();

	FileRead_Write r      =  null; //getter,setter 클래스
	FileWirtes     w      =  null; // 파일 쓰기 클래스
	ExtractName    trans  =  null; // java 파잉을 txt파일로 변환시캬주는 클래스
	
	public ActionListeners(FileRead_Write r)
	{
		//파일 다이얼로그 생성
		chooser = new JFileChooser();
		this.r = r;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
          FileNameExtensionFilter filter = new FileNameExtensionFilter
        		  ("java " ,"java");
          chooser.setFileFilter(filter);
          
          // 파일 다이얼로그 출력
          int ret = chooser.showOpenDialog(null);
		 
          if(ret != JFileChooser.APPROVE_OPTION)
          {
        	  JOptionPane.showMessageDialog(null,"파일을 선택 하지 않았습니다","경고",JOptionPane.WARNING_MESSAGE );
              return;
          } 
          
          //file경로 설정
          r.setFilepath(chooser.getSelectedFile().getPath());
          //파일 이름 설정
          r.setName(chooser.getSelectedFile().getName());
           
          
          //파일의 확장자 이름을 제외한 이름 추출
          trans = new ExtractName(r.getName(), r);
          
          //java 파일을 txt 파일로 쓰기.
          try {w = new FileWirtes(r.getFilepath(), r.getName());} catch (IOException e1) {e1.printStackTrace();}
     
          
          //파일 아이콘 셋팅
          imageLabel.setIcon(new ImageIcon(r.getFilepath()));
       
          
	}
	

}
