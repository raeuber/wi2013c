package XMLParser;

import java.io.*;
public class FileExport {
	

	public FileExport()
	{
		
	}
	
	public void export(File dateiname, boolean append, String inhalt)
	{
		FileWriter fw;
		try 
		{
			fw=new FileWriter(dateiname, append);
			fw.write(inhalt);
			fw.write("\r\n");
			fw.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}	
	}
	
	public void export(String dateiname, boolean append, String Inhalt)
	{
		File file= new File(dateiname);
		export(file, append, Inhalt);
	}
	
	}
