package XMLParser;

public class Cnv2Xml {
FileExport expo= new FileExport();

	public Cnv2Xml()
	{
		auslesen();
	}
	
	public void auslesen()
	{
		FileLeser fl= new FileLeser();
		expo.export("datei.xml", false, "<Studenten>");	
		fl.lesenimport("datei.csv");
		for (String zeile: fl.inhalt)
		{
			zeile2Xml(zeile);
		}
		expo.export("datei.xml", true, "</Studenten>");	
		
	}
	
	public void zeile2Xml(String s)
	{
		Filter fil= new Filter();
		String[] a=fil.getValues(s);
		expo.export("datei.xml", true, "\t<Student>"
				+ "\r\n\t\t<Vorname>"+a[0]+"</Vorname>"
				+ "\r\n\t\t<Nachname>"+a[1]+"</Nachname>"
				+ "\r\n\t\t<Strasse>"+a[2]+"</Strasse>"
				+ "\r\n\t\t<Hausnummer>"+a[3]+"</Hausnummer>"
				+ "\r\n\t\t<PLZ>"+a[4]+"</PLZ>"
				+ "\r\n\t\t<Wohnort>"+a[5]+"</Wohnort>"	
				+ "\r\n\t</Student>");
	}
	
	public static void main (String args[])
	{
		new Cnv2Xml();
	}
}
