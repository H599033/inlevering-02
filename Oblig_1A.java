package no.hvl.dat100;

public class Oblig_1A 
{
	public static void main(String[] args) 
	{
		int[] tabell= {42,67,89};
		int[] tabell2= {1,2,3,6,5};
		System.out.println();
		skrivUt(tabell);
		System.out.println();
		System.out.println();
		System.out.println(tilString(tabell));
		System.out.println();
		System.out.print(summer(tabell2)+" ");
		System.out.print(summer2(tabell2)+" ");
		System.out.println(summer3(tabell2));
		System.out.println();
		System.out.println(finnesTall(tabell2,2));
		System.out.println();
		System.out.println(posisjonTall(tabell,67));
		int[] tabell3 = reverser(tabell);
		System.out.println();
		skrivUt(tabell3);
		System.out.println();
		System.out.println();
		System.out.println(erSotert(tabell2));
		int[] tabell4 = settSammen(tabell,tabell2);
		System.out.println();
		skrivUt(tabell4);
	}
	// oppgave A
	public static void skrivUt (int[] tabell) 
	{
		
		for(int i : tabell) 
		{
			
			System.out.print(i+" ");
		}
		
		
	}
	//oppgave B
	public static String tilString (int[] tabell) 
	{
		
		String s = "[" + tabell[0] + "," + tabell[1] + "," + tabell[2] + "]";
		return s;
	}
	//oppgave C
	public static int summer (int[] tab) 
	{
		int i =0;
		int p =0;
		for( i=0; i<tab.length; i++) 
		{
			p = tab[i] + p;
		}
		return p;
	}	
	//oppgave c	
	public static int summer2 (int[] tab)
	{
		int t =0;
		int i =0;
		while (i<tab.length ) 
		{
			
			t = tab[i] + t;
			i++;
		}
		
		return t;
	}
	//oppgave c	
	public static int summer3(int[] tab ) 
	{
		int y=0;
		
		
		for (int i : tab) 
		{
			
			y = i + y;
			
		}
		
		return y;
	}
	//oppgave D
	static boolean finnesTall(int [] tab, int tall) 
	{
		boolean sant = false;
		
		for ( int i : tab) 
		{
			if (i==tall) 
			{
				sant = true;
			}
		}
		return sant;
	}
	//oppgave E
	static int posisjonTall(int [] tab, int tall) 
	{
		int pos = -1;
		for( int i=0; i<tab.length; i++) 
		 {
			
			 if(tab[i]==tall)
			 {
				 pos = i;
			 }
			 
		 }
		
		return pos;
	}
	//oppgave F
	static int [] reverser(int []tab) 
	 {
		int t[]= new int [tab.length];
		
		 for(int i =0; i<tab.length; i++) 
		 {
			t[i] = tab[2-i];
			
		 }
		 
		 return t;
	 }
	//oppgave G
	static boolean erSotert(int [] tab) 
	 {
		 boolean sotert = false;
		 int i =0;
		 while(i<tab.length-1) 
		 {
			 
			 if(tab[i]<tab[i+1]) 
			 	{
			 		sotert= true;
			 	}
			 else 
			 {
				 sotert = false;
			 }
			 i++;
		 }
		 	 	
		 return sotert;
	 }
	//oppgave H
	static int [] settSammen(int []tab1, int []tab2) 
	 {
		 int[] b = new int [tab1.length + tab2.length];
		 
		 for ( int i=0; i<tab1.length; i++) 
		 {
			b[i] =tab1[i];
			
		 }
		 
		 for (int j =0; j<tab2.length; j++) 
		 {
			b[j+tab1.length] = tab2[j];
		 }
		 
		 return b;
	 }
}

