package wwi2013c.sort;

public class Selecsort 
{
	
	int [] unsortiert = {5, 11, 16, 9, 18, 30, 7, 1, 4, 20};
	
	public Selecsort()
	{
		
	}
	
	public int[] sortieren()
	{
		for (int i=0; i<unsortiert.length; i++)
		{
			int minpos=minimumPosition(i);
			swap(minpos, i);
		}
		
		
		return unsortiert;
	}
	
	public int minimumPosition(int from)
	{
		int minpos = from;
		for (int i=from+1; i<unsortiert.length; i++)
		{
			if(unsortiert[i]<unsortiert[minpos])
			{
				minpos=i;
				
			}
		}
		return minpos;
	}
	
	public void swap(int minpos, int i)
	{
		int temp = unsortiert[i];
		unsortiert[i]=unsortiert[minpos];
		unsortiert[minpos]= temp;
		
		
	}
	public static void main(String args[])
	{
		Selecsort k = new Selecsort();
		int [] sortiert = k.sortieren();
		for (int i : sortiert) {  //einfach merken, ist eine foreach Schleife, geht das Array sortiert durch und schreibt die Werte der jeweiligen Position in die Variable i
			System.out.println(i);
		}
		
	}

}
