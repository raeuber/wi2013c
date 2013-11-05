package wwi2013c.Feldtest;

import java.util.Vector;

public class vector {
	private void vector() {
		// TODO Auto-generated method stub

	}
	Vector Namensliste = new Vector();
	
	public void setInhalt(){
		Namensliste.add("Groﬂer");
		Namensliste.add("Rainer");
		Namensliste.add(62);
		Namensliste.add(123456.78);
	}
	
	public void leseInhalt(){
		String Nachname = (String) Namensliste.elementAt(0);
		System.out.println(Nachname);
		String Vorname = (String) Namensliste.elementAt(1);
		System.out.println(Vorname);
		int Alter = (Integer)Namensliste.elementAt(2);
		System.out.println(Alter);
		double Rente = (Double) Namensliste.elementAt(3);
		System.out.println(Rente);
		
		//Namensliste.size()
		//Gibt die Anzahl der werte im Vector
	}
}
