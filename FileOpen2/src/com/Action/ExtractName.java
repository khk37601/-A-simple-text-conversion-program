package com.Action;
import com.GetterSetter.FileRead_Write;

public class ExtractName
{
	//파일 이름 추출
	public  ExtractName(String Name,FileRead_Write FRW) 
	{
		if(Name.contains("."))
		{
		 int index = Name.lastIndexOf(".");
		 FRW.setS(Name.substring(0,index));
		}
		else
		{
		  FRW.setS(Name);
		}
	}

}
