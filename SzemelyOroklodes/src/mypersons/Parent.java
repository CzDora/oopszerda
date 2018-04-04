package mypersons;

public class Parent extends Person {
	public String munkahely;

	public Parent(String nev, int kor, String munkahely) {
		super(nev, kor);
		this.munkahely = munkahely;
	}

	@Override
	public String toString() {
		return "Parent [munkahely=" + munkahely + ", toString()=" + super.toString() + "]";
	}

	public String getMunkahely() {
		return munkahely;
	}
	
	

}
