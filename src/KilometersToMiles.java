
import java.util.Scanner;

public class KilometersToMiles {

	
	public static float mileUzKil(float attalumsVertiba) {
		return attalumsVertiba/0.62137f;
	}
	
	public static float kilUzMile(float attalumsVertiba) {
		return attalumsVertiba*0.62137f;
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		String atbilde = "";
		do
		{
		
		System.out.println("Izvelies konvertesanu.");
		System.out.println("Ja no Judzem uz Kilometriem - ievadi M");
		System.out.println("Ja no Kilometriem uz Judzem - ievadi KM");
		
		Scanner mansSkeneris = new Scanner (System.in);
		
		String attalumsVeids = mansSkeneris.next();
		
			System.out.println("Ievadiet attalumu: ");
		
			float attalumsVertiba = mansSkeneris.nextFloat();
		
			float mileUzKil = mileUzKil(attalumsVertiba); //attalumsVertiba/0.62137f;
			float kilUzMile = kilUzMile(attalumsVertiba);//attalumsVertiba*0.62137f;
		
			if (attalumsVeids.equals("M"))
			{
				System.out.println(attalumsVertiba + " Judzes ir  "+ mileUzKil+ " Kilometri");
			}
			else if (attalumsVeids.equals("KM"))
			{
				System.out.println(attalumsVertiba+ " Kilometri ir " + kilUzMile+ " Judzes");
			}
			else
			{
				System.out.println("Nepareizas vertibas");
			}
			System.out.print ("Vai velies atkartot? JA/NE ");
			atbilde = mansSkeneris.next();
			
		}while(atbilde.equals ("yes"));
		
		System.out.println ("Ata");
		
		
		
	}

}