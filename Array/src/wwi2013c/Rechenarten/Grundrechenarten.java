package wwi2013c.Rechenarten;

public class Grundrechenarten {
	int x;
	int y;
	
	Addition a;
	Division d;
	Multiplikation m;
	Subtraktion s;
	
	public Grundrechenarten(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void getSumme(){
		a = new Addition(this.x, this.y);
		s = new Subtraktion(this.x, this.y);
		d = new Division(this.x, this.y);
		m = new Multiplikation(this.x, this.y);
		System.out.println("Startwert 1: " + this.x);
		System.out.println("Startwer 2: " + this.y);
		System.out.println("Addition: " + a.getErgebnis());
		System.out.println("Multiplikation: " + m.getErgebnis());
		System.out.println("Subtraktion: " + s.getErgebnis());
		System.out.println("Division: " + d.getErgebnis());
	}
	
	public static void main(String Args[]){
		Grundrechenarten g = new Grundrechenarten(500, 10);
		g.getSumme();
	}
}
