package com.FileIo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class  FilesClose 
{
	protected BufferedReader br  = null;
	protected FileWriter     fw  = null;
	protected BufferedWriter bw  = null;
	protected String         str = null;
	
	
	// �������� ���� �ݱ�.
	 public void Close()
	 {
		 try {if(bw != null)bw.close(); }catch (Exception e) { } 
		 try {if(fw != null)fw.close(); }catch (Exception e) { } 
		 try {if(br != null)br.close(); }catch (Exception e) { } 
	 }
	
}
