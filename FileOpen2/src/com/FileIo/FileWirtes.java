package com.FileIo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWirtes  extends FilesClose
{
	 private String str = "";
	 
	 public FileWirtes(String filepath,String fileName) throws IOException
	 {
		 //UTF-8���ڵ����� �ش� ��� ���� �о� �鿩 ����.
	    super.br =  new BufferedReader(new InputStreamReader(new FileInputStream(filepath), "UTF-8"));	 
	    //���� �̸� ���� ���� ����
	    super.fw = new FileWriter(fileName+""+".txt",false);
	    super.bw = new BufferedWriter(super.fw);
	    
	    
	    //���� ������ �ٱ��� ����
	    while((str=super.br.readLine()) != null)
	    {
	    	super.bw.write(str);
	    	bw.newLine();
	    }
	    
	    //���� �ݱ�
	    super.Close();
	    
     }
	 
	 

	 
}
