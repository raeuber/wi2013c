package wwi2013c.XMLParser;

public class Schreiber {

	FileExport f= new FileExport();
	
	public Schreiber()
	{
		f.export("datei.csv", false, "Heinz; M�ller; Hauptstra�e; 20; 33378; Rheda-Wiedenbr�ck;"
				+ "\r\nJ�rgen; Mustermann; Nebenstra�e; 44; 70000; Stuttgart;"
				+ "\r\nZlatan; Ibrahimovic; GottesAllee; 1; 10000; Berlin;");
	}
	 
	public static void main(String[] args)
	{
		new Schreiber();
	}
}
