
public class Alkalmazott {

	private String nev;
	private int kor;
	private long fizetes;

	private static int nyugdijkorhatar = 65;

	public Alkalmazott(String nev, int kor, long fizetes) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}

	public Alkalmazott(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = 10000 * kor;
	}

	public int hanyevvanmeghatra() {
		return nyugdijkorhatar - kor;
	}

	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev + ", kor=" + kor + ", fizetes=" + fizetes + ", hanyevvanmeghatra()="
				+ hanyevvanmeghatra() + "]";
	}

public static void setNyugdijkorhatar(int nyugdijkorhatar) {
	Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
   }

	public static Alkalmazott tobbevevanhatra(Alkalmazott elsoAlkalmazott, Alkalmazott masodikAlkalmazott) {
  if (elsoAlkalmazott.hanyevvanmeghatra() > masodikAlkalmazott.hanyevvanmeghatra()) {
	  return elsoAlkalmazott;
  }
	 else { }
   return masodikAlkalmazott;
}

	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}
	
}
