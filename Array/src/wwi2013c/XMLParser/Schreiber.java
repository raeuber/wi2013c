package wwi2013c.XMLParser;

public class Schreiber {

	FileExport f= new FileExport();
	
	public Schreiber()
	{
		f.export("datei.csv", false, "Heinz; Müller; Hauptstraße; 20; 33378; Rheda-Wiedenbrück;"
				+ "\r\nJürgen; Mustermann; Nebenstraße; 44; 70000; Stuttgart;"
				+ "\r\nZlatan; Ibrahimovic; GottesAllee; 1; 10000; Berlin;");
	}
	 
	public static void main(String[] args)
	{
		new Schreiber();
	}
}
