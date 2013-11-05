package wwi2013c.Feldtest;

public class Feldtest {


	public static void Feldtest(){
		String [] Wochentag = {"Montag ", "Dienstag ","Mittwoch ", "Donnerstag ", "Freitag"};
		
		//foreach
		for (String Tag : Wochentag) {
			System.out.println(Tag);
		}
		/*****
		 * 
		 * Feldtest Methode getFeld1
		 * 
		 *****/
		for (int i= 1; i< Wochentag.length; i++){
			System.out.println(Wochentag[i-1]);
		}
		
		/********
		 * 
		 * Feldtest Methode getFeld2
		 * 
		 ******/
		int x = 0;
		while(x <Wochentag.length){
			System.out.println(Wochentag[x]);
			x++;
		}
	}

	
}
