
public class TeglalapTomb {
  public static void main(String[] args) {
	  int meret = 10;
			  //Teglalap[] teglalapok = new Teglalap[meret];
			  Teglalap teglalapok[] = new Teglalap[meret];
	  
	  for (int i = 0; i < teglalapok.length; i++) {
		  //als� �s fels� hat�r k�z�ttki k�l�nbs�g + 1 a v�letlen sz�mn�l
		  teglalapok[i] = new Teglalap( (int) (Math.random()* 9) + 2, (int) (Math.random()* 9) + 2);
		  
		  System.out.println(teglalapok[i]);
		  
	}
	  
	  int legkisebbteruletuteglalapindexe = 0;
	  for (int i = 1; i < teglalapok.length; i++) {
		  
		  if (teglalapok[legkisebbteruletuteglalapindexe].nagyobbTeruletuMint(teglalapok[i])){
				  legkisebbteruletuteglalapindexe = i;
	}
}
	  System.out.println(teglalapok[legkisebbteruletuteglalapindexe]);
  }
}

