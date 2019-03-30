package com.Main;
import java.awt.Container;
import java.util.concurrent.SynchronousQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.Action.ActionListeners;

public class Frame extends JFrame
{
	Container contentPane;
	JLabel imageLabel = new JLabel();
	
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
		
		
		//리스너 등록
		openitem.addActionListener(new ActionListeners() );
	    filemeun.add(openitem);
	    mb.add(filemeun);
	    this.setJMenuBar(mb);
	    pack();
	}
	
	
	
}
