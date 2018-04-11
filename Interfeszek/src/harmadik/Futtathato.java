package harmadik;

import java.awt.Color;

import masik.Szinespont;
import sajat.ISzinezheto;

public class Futtathato {

	public static void main(String[] args) {
		ISzinezheto szinespont = new Szinespont (Color.BLUE);
		
		System.out.println(szinespont);
        szinespont.setAlapertelmezett(Color.GREEN);
        System.out.println(szinespont);
		
        Atszinezo(szinespont);
        System.out.println(szinespont);
	}
	
	public static void Atszinezo(ISzinezheto objektum) {
		objektum.setAlapertelmezett(objektum.alapertelmezett);
		
	}
	


}
