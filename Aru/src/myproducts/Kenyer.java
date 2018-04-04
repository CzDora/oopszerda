package myproducts;

public class Kenyer extends Aru {
  private double mennyiseg;

public Kenyer(String nev, int netto_ar, int afakulcs, double mennyiseg) {
	super(nev, netto_ar, afakulcs);
	this.mennyiseg = mennyiseg;
}

@Override
public String toString() {
	return "Kenyer [" + super.toString()
	+ ", egysegar: "
	+ brutto_ar() / mennyiseg   
	+ "]";
}
  
  public double getMennyiseg() {
	  return mennyiseg;
	
}
  public double egysegar() {
	  return brutto_ar() / mennyiseg;
	
}
  public static boolean elso_kenyer_nagyobb_egysegaru(Kenyer elso_kenyer, Kenyer masodik_kenyer) {
	  return (elso_kenyer.egysegar() > masodik_kenyer.egysegar());  
	
}
}
