package XMLParser;

public class Lesen {
	FileLeser f= new FileLeser();
	Filter filter = new Filter();
	
	
	public Lesen()
	{
		f.lesenimport("datei.csv");
		for (String zeile: f.inhalt)
		{
			System.out.println(f.inhalt);
			//filter.getValues(f.inhalt);
		}
		
	}
	
	public static void main(String args[])
	{
		new Lesen();
	}

}
