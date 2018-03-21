import java.util.*;
import java.util.Scanner;

public class Futtathato {
public static void main(String[] args) {
	
	//int meret = 5;
	Scanner beolvasas = new Scanner (System.in);
	
	System.out.println("Kerem adja meg az alkalmazottak szamat!");
	System.out.println("Alkalmazottak szama:");
	
	int meret = beolvasas.nextInt();
	
    Alkalmazott alkalmazottak[] = new Alkalmazott[meret];
    Random veletlenszam = new Random();
	
    for (int i = 0; i < alkalmazottak.length; i++) {
	alkalmazottak[i] = new Alkalmazott("XY" + (i+1), veletlenszam.nextInt(Alkalmazott.getNyugdijkorhatar()));
    
    System.out.println(alkalmazottak[i]);
    }    
    
    Alkalmazott.setNyugdijkorhatar(70);
    
    System.out.println("Valtoztattuk a nyugdijkorhatart.");
    
    for (Alkalmazott alkalmazott : alkalmazottak) {
    	System.out.println(alkalmazott);
		
	}
	beolvasas.close();
}
}