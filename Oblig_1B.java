package no.hvl.dat100;

public class Oblig_1B 
{

	public static void main(String[] args)
	{
		int[][] tab = {{1,2,3},{4,5,6},{7,8,9}};
		int tall = 2;
		
		System.out.println(tilString(tab));
		System.out.println();
		
		int [][]tab1 = skaler(tall,tab);
		skrivUtv(tab1);
		System.out.println();
		System.out.println(erLik(tab,tab1));
		
		System.out.println();
		int [][]tab2 = speile(tab);
		skrivUtv(tab2);
		
		System.out.println();
		int [][]tab3 = multipliser(tab,tab1);
		skrivUtv(tab3);
		
		
	}
	
	public static void skrivUtv(int[][] matrise) 
	{
		
		for(int i =0; i<matrise.length; i++ ) 
		{
			for(int j =0; j<matrise[0].length; j++) 
			{
				System.out.print(matrise[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	static String tilString (int[][]tab) 
	{
		
		String s = tab[0][0]+" "+tab[0][1]+ " " +tab[0][2]+"\n" +
					tab[1][0]+" "+tab[1][1]+ " " +tab[1][2]+"\n" +
					tab[2][0]+" "+tab[2][1]+ " " +tab[2][2];
		return s;
	}
	
	 static int[][] skaler(int tall, int[][] matrise)
	{
		int linje = matrise.length;
		int kolonne = matrise[0].length;
		int tab[][] = new int [linje][kolonne];
		for ( int i =0; i<matrise.length;i++) 
		{
			for (int j =0; j<matrise[0].length;j++) 
			{
				tab[i][j]=matrise[i][j]*tall;
			}
		}
		return tab;
	}
	 
	 public static boolean erLik(int[][] mat1, int[][] mat2) 
	 {
		 boolean lik= false;
		 
		 for ( int i =0; i<mat1.length;i++) 
			{
				for (int j =0; j<mat1[0].length;j++) 
				{
					 if (mat1[i][j]==mat2[i][j]) 
					 {
						 lik = true;
					 }
					 else
						 lik =false;
				}
			}
		 
		 return lik;
	 }
	  static int[][] speile(int [][] matrise)
	 {
		int linje = matrise.length;
		int kolonne = matrise[0].length;
		int tab[][] = new int [linje][kolonne];
		for ( int i =0; i<matrise.length;i++) 
		{
			for (int j =0; j<matrise[0].length;j++) 
			{
				tab[i][j]=matrise[2-i][2-j];
			}
		}
		 return tab;
	 }
	  
	   static int[][] multipliser(int[][] a, int[][] b)
	  {
		  int linje = a.length;
		  int kolonne = a[0].length;
		  int tab[][] = new int [linje][kolonne];
		  for ( int i =0; i<a.length;i++) 
			{
				for (int j =0; j<a[0].length;j++) 
				{
					tab[i][j]=a[i][j]*b[i][j];
				}
			}
		  return tab;
	  }
}
