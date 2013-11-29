package wwi2013c.XMLParser;

public class Filter {

	public String[] getValues(String Zeile)
	{
		return Zeile.split(";");
	}
}
