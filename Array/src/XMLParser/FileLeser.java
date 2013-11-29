package XMLParser;
/*
 * File --> Objekt
 * try-catch-Klausel
 * Feld (Array) für den Inhalt, jede Zeile ein Wert
 * integer variable für Zeilenanzahl
 * 
 * Datei einlesen Nr. 1 -> Zähler
 * Datei einlesen Nr. 2 -> Inhalt
 */
import java.io.*;
public class FileLeser {
	int zeilenanzahl;
	String inhalt[];
	
	public FileLeser()
	{
		
	}
	
	public void lesenimport(String dateiname)
	{
		LineNumberReader lnr;
		zeilenanzahl=0;
		try 
		{
			lnr= new LineNumberReader(new FileReader(new File(dateiname)));
			while (lnr.readLine()!=null)
			{
				zeilenanzahl=lnr.getLineNumber();
			}
			lnr.close();
			lnr=new LineNumberReader(new FileReader(new File(dateiname)));
			inhalt=new String[zeilenanzahl];
			for (int i=1; i<=zeilenanzahl; i++)
			{
				inhalt[i-1]=lnr.readLine();
				
			}
			lnr.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	}
	

}
