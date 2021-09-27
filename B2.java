package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class B2 
{
	public static void main(String[] args) 
	{

		String breddeStr = showInputDialog("Bredde:");
		int bredde = Integer.parseInt(breddeStr);

		String hoydeStr = showInputDialog("Høyde:");
		int hoyde = Integer.parseInt(hoydeStr);

		int a = areal(bredde,hoyde);

		showMessageDialog(null,"Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) 
	{

		int flateareal = bredde * hoyde;

		return flateareal;
	}

}
