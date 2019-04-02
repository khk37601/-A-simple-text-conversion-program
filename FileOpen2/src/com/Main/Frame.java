package com.Main;
import java.awt.Container;
import java.awt.TextField;
import java.util.concurrent.SynchronousQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.Action.ActionListeners;
import com.Action.SerchActions;
import com.GetterSetter.FileRead_Write;

public class Frame extends JFrame
{
	Container contentPane;
	JLabel imageLabel = new JLabel();
    FileRead_Write	r = new FileRead_Write() ;

	public  Frame()
	{
		this.setTitle("Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(imageLabel);

		this.CreateMeun();
		
		setSize(300,200);
		setVisible(true);
		
	}
	
	void  CreateMeun()
	{
		JMenuBar mb = new JMenuBar();
		JMenu filemeun = new JMenu("File");
		JMenuItem openitem = new JMenuItem("Open");
		JMenuItem openitems = new JMenuItem("serach");

		TextField fil = new TextField();
		fil.setVisible(true);
		fil.setBounds(10, 10, 5, 5);
		add(fil);
		
		
	
		
       System.out.println(fil.getText());
		fil.addActionListener(new SerchActions(r,fil.getText().trim()));
		
		//리스너 등록
		openitem.addActionListener(new ActionListeners(r));
	   
		filemeun.add(openitem);
		filemeun.add(openitems);
		
	    mb.add(filemeun);
	    this.setJMenuBar(mb);

	    pack();
	}
	
	
	
}
