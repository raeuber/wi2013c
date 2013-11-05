
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Feldtest();
	}
	
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
