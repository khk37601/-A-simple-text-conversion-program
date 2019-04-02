package com.Action;
import java.io.File;
import java.io.IOException;

import com.GetterSetter.FileRead_Write;


public class TestSerch 
{
    private boolean is = false;
    ExtractName     s  = null;
    FileRead_Write  r  = null;
 
    
    public TestSerch(FileRead_Write r)
    {
    	this.r = r;

    }
    
    
	public void sub(String plus, String str)
	{
		
		File dir = new File(plus);
		File file2[] = dir.listFiles();
		try {
		
			if(is)
				return;
			
		for(int i=0;i<file2.length;i++)
		{
		
			  s = new ExtractName(file2[i].getName(), r);
		      //ss = s.Names_extraction(file2[i].getName());
		        //ystem.out.println(r.getS()+str);
				if(r.getS().equals(str))
				{
							
					is = true;
					break;
				}
		
			// 하위 디엑토이 있는 경우
			else if(file2[i].isDirectory())
					sub(file2[i].getCanonicalPath().toString(),str);
		}
		
		} catch (IOException e) {e.printStackTrace();}
		
		
	}
	
}
