package wwi2013c.geldwechsel;

public class GeldWechsel {

	private double[] money = new double[]{0.01, 0.02, 0.05, 0.10, 0.20, 0.50,
											1,2,5,10,20,50,100,200};
	
	private double toChange;
	String a;
	String b;
	
	
	public GeldWechsel(double toChange){
		this.toChange = toChange;
	}
	
	private void changeMoney(){
		double rest = toChange;
		
		int i = 0;
		while (rest > money[i]) {
			rest = rest - money[i];
			i++;
		}
	}
	
	private boolean checkRest(){
		
		return true;
	}
	
}
