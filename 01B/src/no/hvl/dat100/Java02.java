package no.hvl.dat100;

public class Java02 {

      public static void main(String[] args) {
		
		final int [][] matrise = { { 1, 2, 3, 4, 5 },
		                           { 1, 2, 3, 4, 5 },
		                           { 1, 2, 3, 4, 5 },
		                           { 1, 2, 3, 4, 5 } 
		         
		                      
		};
		
		final int [][] kopiMatrise = { { 1, 2, 3, 4, 5 },
                                       { 1, 2, 3, 4, 5 },
                                       { 1, 2, 3, 4, 5 },
                                       { 1, 2, 3, 4, 5 } 
                
};
		
		skrivUt(matrise);
		System.out.println("");
		tilStreng(matrise);
		System.out.println("");
		skaler(2, matrise);
		erLik(matrise, kopiMatrise);
		
		
		
		
	
		
	}
		
		// a)
		public static void skrivUt(int[][] matrise) {
			
			for (int i = 0; i < matrise.length; i++) {
				
				for (int j = 0; j < matrise[i].length; j++) {
					System.out.print(matrise[i][j] + " ");
				}
				System.out.println();
				
			}
		}
			
			// b)
		public static String tilStreng(int[][] matrise) {
			
			String mat ="";
			
			for (int i = 0; i < matrise.length; i++) {
				
				for (int j = 0; j < matrise[i].length; j++) {
					
					mat +=  (matrise[i][j] + " ");
			
				}
				
				
				mat += ("/n ");
				
				
				
		
			}
			System.out.print(mat);
			return mat;


			
		}

		// c)
		public static int[][] skaler(int tall, int[][] matrise) {
			
			
			int [][] kopiMatrise = new int [matrise.length][];
			
			
			
			for (int i = 0; i < matrise.length; i ++) {
				
				for (int j = 0; j < matrise[i].length; j++) {
					
					System.out.print(matrise[i][j] * tall + " ");
					
					
				}
				
				
			System.out.println(" ");	
			
			}
			
		
			
			return kopiMatrise;
			
				
				
			
				
				
				
			
		
		}

		// d)
		public static boolean erLik(int[][] a, int[][] b) {
			
			int row1, col1, row2, col2;
			boolean like = true;
			
			row1 = a.length;
			col1 = a[0].length;
			row2 = b.length;
			col2 = b[0].length;
			
			if (row1 != row2 || col1 != col2) {
				System.out.print("Ikke like");
				
			} else {

			for (int i = 0; i < row1; i ++) {
				for (int j = 0; j < col1; j++) {
					
					if (a[i][j] != b[i][j]) {
					
					like = false;
					
				
								
				}
				}
		
			}
			
			if (like)
				System.out.println("Er like");
			else
				System.out.println("Er ikkje like");
			}
			
			return like;
			
			
		}
		
		
		// e)
		//public static int[][] speile(int[][] matrise) {

			// TODO
		//	throw new UnsupportedOperationException("speile ikke implementert");
		
		//}

		// f)
		//public static int[][] multipliser(int[][] a, int[][] b) {

			// TODO
		//	throw new UnsupportedOperationException("multipliser ikke implementert");
		
		}
	//}


