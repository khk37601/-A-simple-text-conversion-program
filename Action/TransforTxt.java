package com.Action;
import com.GetterSetter.FileRead_Write;

public class TransforTxt
{
	//���� �̸� ����
	public TransforTxt(String Name,FileRead_Write FRW) 
	{
		  for(int i =0;i<Name.length()-1;i++)
          {
        	  if(Name.charAt(i) != '.')
        	  {
        		 FRW.setS(Name.charAt(i)); 
        	  }else
        		  break;
          }
	}

}
