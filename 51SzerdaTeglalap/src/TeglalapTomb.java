
public class TeglalapTomb {
  public static void main(String[] args) {
	  int meret = 10;
			  //Teglalap[] teglalapok = new Teglalap[meret];
			  Teglalap teglalapok[] = new Teglalap[meret];
	  
	  for (int i = 0; i < teglalapok.length; i++) {
		  //alsó és felsõ határ közöttki különbség + 1 a véletlen számnál
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

