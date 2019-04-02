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
		 //UTF-8인코딩으로 해당 경로 파일 읽어 들여 오기.
	    super.br =  new BufferedReader(new InputStreamReader(new FileInputStream(filepath), "UTF-8"));	 
	    //같은 이름 파일 덮혀 쓰기
	    super.fw = new FileWriter(fileName+""+".txt",false);
	    super.bw = new BufferedWriter(super.fw);
	    
	    
	    //란인 마지막 줄까지 쓰기
	    while((str=super.br.readLine()) != null)
	    {
	    	super.bw.write(str);
	    	bw.newLine();
	    }
	    
	    //파일 닫기
	    super.Close();
	    
     }
	 
	 

	 
}
