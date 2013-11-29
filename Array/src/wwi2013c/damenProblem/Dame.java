package wwi2013c.damenProblem;

public class Dame {
	
	int n = 8;
	String feld [][]= new String [n][n];
	String dame = "1";
	String spur = "0";
	String gesperrt = "-";
	
	
	
	public Dame(){
		feld[0][0] = dame;
		
	}
	
	public void start(){
		int i = 0;
		int j = 0;
		horizontal(i, j);
		vertikal(i, j);
		diagonal(i, j);
		ausgabe();
	}
	
	private void horizontal(int i, int j){
		for (int x = 0; x < feld[i].length; x++) {
			if (x != j ) {
				feld[i][x] = gesperrt;
			}
		}
	}
	
	private void vertikal(int i, int j){
		for (int x = 0; x < feld[j].length; x++) {
			if(x != i){
				feld[x][j] = gesperrt;
			}
		}
	}
		
	private void diagonal(int i, int j){
		
		for (int x = 0; x < feld[i].length; x++) {
			if (x != j && x+1 < feld[i].length ) {
				feld[i][x+1] = gesperrt;
			}
		}
	}
	
	
	public void ausgabe(){
		
		for (String[] subfeld : feld) {
			StringBuilder sb = new StringBuilder();
			for (String s : subfeld) {
				if (s == null) {
					s = "0";
				}
				sb.append(s+ " " );
			}
			System.out.println(sb.toString());
			
		}
	}
	
	public static void main(String args[]){
		Dame d = new Dame();
		d.start();
	}
}