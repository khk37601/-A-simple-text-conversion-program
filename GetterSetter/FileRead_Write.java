package com.GetterSetter;

public class FileRead_Write
{
	
    private String filepath;
    private String name;
    private String s;
    
	public FileRead_Write(String filepath, String name, String s)
	{
		this.filepath = filepath;
		this.name = name;
		this.s = s;
	}
	
	public FileRead_Write()
	{
		this.filepath = "";
		this.name ="";
		this.s = "";
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getS() {
		return s;
	}

	public void setS(char s) {
		this.s += s;
	}
	
}
