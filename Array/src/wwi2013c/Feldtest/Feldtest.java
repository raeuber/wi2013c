package wwi2013c.Feldtest;

public class Feldtest {


	public static void Feldtest(){
		String [] Wochentag = {"Montag ", "Dienstag ","Mittwoch ", "Donnerstag ", "Freitag"};
		
		//foreach
		for (String Tag : Wochentag) {
			System.out.println(Tag);
		}
		//for
		for (int i= 1; i< Wochentag.length; i++){
			System.out.println(Wochentag[i-1]);
		}
		//while
		int x = 0;
		while(x <Wochentag.length){
			System.out.println(Wochentag[x]);
			x++;
		}
	}

	
}
