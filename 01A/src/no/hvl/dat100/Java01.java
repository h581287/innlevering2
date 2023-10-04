package no.hvl.dat100;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;



public class Java01 {
			
	public static void main(String[] args) {
		
	int []a1 = {1,2,3,4,5};
	skrivUt(a1);
	System.out.println("");
	tilStreng(a1);
	System.out.println("");
	summer(a1);
	System.out.println("");
	System.out.print(finnesTall(a1, 6));
	System.out.println("");
	posisjonTall(a1, 4);
	System.out.println("");
	int [] kopitab = reverser(a1);
	skrivUt(kopitab);
	System.out.println("");
	erSortert(a1);
	int [] nyTab = settSammen(a1, kopitab);
	skrivUt(nyTab);
	
	
	
	
	}
	
	// a)
	public static void skrivUt(int[] tabell) {
	
		for (int i = 0; i < tabell.length; i++) {

	System.out.print(tabell[i]+" ");
	
		}
}

// b)
public static String tilStreng (int[] tabell) {
	
	System.out.print("[");
	for (int i = 0; i < tabell.length; i++) {
		
		if (tabell[i] == tabell.length) {
			
			System.out.print(tabell[i]);					
			
		} else {
			System.out.print(tabell[i]+",");
		}
		

		
	}
	
	System.out.print("]");
	return "";

	
	


}
	


// c)
/**
 * @param tabell
 * @return
 */
public static int summer (int[] tabell) {
	
	int sum = 0;
	
	for (int i = 0; i < tabell.length; i++) {
		 
		sum += tabell[i];
		
		
	}
	System.out.println(sum);
	
	int o = 0;
	int sum2 = 0;
	
	while (o < tabell.length) {
		sum2 += tabell[o];
		o++;
	}
	
	System.out.println(sum2);
	
	int []a1 = {1,2,3,4,5};
	int i = 0;
	int sum3 = 0;
	for (int tall: a1) {
		sum3 += tall;
		
		
	}
	
	System.out.print(sum3);

	
	int ingenting = 0;
	return ingenting; 
	


}

		// d)
public static boolean finnesTall(int[] tabell, int tall) {
	

	
	int i = 0;
	boolean funnet = false;
	while (!funnet && i < tabell.length) {
		if (tabell[i] == tall)
			funnet = true;
		else 
			i ++;
		
		
	}
	
	return funnet;
}

// e)
public static int posisjonTall(int[] tabell, int tall) {

		int x = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				x = i;
				
			
			}
		}
		System.out.print("Indeks nr: " + x);
		return x;
		
		
	}
	
	




// f)
public static int[] reverser(int[] tabell) {

	int [] kopitab = new int [tabell.length];
	
	for (int i = 0, j = tabell.length-1; i < tabell.length; i++, j--) {
		kopitab[i] = tabell[j];
		
		
	}
	
	return kopitab;
	
}

// g)
public static boolean erSortert(int[] tabell) {
	
	boolean sortert = true;
	int i = 1;
	while (sortert && i<tabell.length) {
		if (tabell[i-1] <= tabell[i]) {
			i++;
		} else
			sortert = false;
	}
	System.out.println(sortert);
	return sortert;


}

// h)
public static int[] settSammen(int[] tabell1, int[] kopitab) {
	
	int i = 0;
	int nyLengde = tabell1.length + kopitab.length;
	int [] nyTab = new int[nyLengde];
	for (i = 0; i < tabell1.length; i++) {
		nyTab [i] = tabell1 [i];
	}
	for (int j = 0; j < kopitab.length; j++) {
		nyTab [tabell1.length+j] = kopitab [j];
		
	}
	
	return nyTab;

}



}
