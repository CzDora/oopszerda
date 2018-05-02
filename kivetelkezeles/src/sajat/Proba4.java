package sajat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Proba4 {

	public static void main(String[] args) {
		int meret = 5;
		int[] egeszTomb = new int [meret];
		
		InputStreamReader bemenetiAdatfolyam = new InputStreamReader(System.in);
		
		BufferedReader beolvasas = new BufferedReader(bemenetiAdatfolyam);
		
		for (int i = 0; i < egeszTomb.length; i++) {
			try {
				boolean rosszAdat = true;
				
				do {
					System.out.println("Kerem adja meg " + (i + 1) + ". egesz szamot!");
				
				System.out.print("szam:");
				
			
				try {
					String sztring = beolvasas.readLine();
					
					egeszTomb[i] = Integer.parseInt(sztring);
					rosszAdat = false;
				} catch (NumberFormatException e) {
					System.out.println("Nem egesz szamot kaptunk!\n Kerem adja meg ujbol! ");
				}
			} while (rosszAdat);
				
			} catch (IOException kivetelobjektum) {
				kivetelobjektum.printStackTrace();
			}//try
			
		}//for
		
		System.out.println("A tomb elemei");
		for (int i : egeszTomb) {
			System.out.println(i);
			
		}

	}//main

}//class
