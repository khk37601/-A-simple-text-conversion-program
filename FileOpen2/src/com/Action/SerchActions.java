package com.Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import com.GetterSetter.FileRead_Write;

public class SerchActions implements ActionListener
{

	FileRead_Write rw =  null;
	String str ;
    public SerchActions(FileRead_Write rw,String str)
	{
		this.rw  = rw;
		this.str = str;
	}
	    
	@Override
	public void actionPerformed(ActionEvent e)
	{
	    TestSerch serch = new TestSerch(rw);
		serch.sub("C:\\", this.str);
	}
}
