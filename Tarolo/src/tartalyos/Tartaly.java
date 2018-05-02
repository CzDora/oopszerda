package tartalyos;

public class Tartaly extends Tarolo {

	private double nyomas;
	
	
	
	public Tartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas = nyomas;
	}



	@Override
	public boolean VeszelyesE() {
		if (getTerfogat() * nyomas > 100) {
			
	
			return true;
			
		} else {
			return false;

		}

	}



	@Override
	public String toString() {
		return "Tartaly [nyomas=" + nyomas + ", VeszelyesE()=" + VeszelyesE() + ", getTerfogat()=" + getTerfogat()
				+ "]";
	}
	
	public boolean NagyobbNyomasuE(double masiknyomas){
		return nyomas > masiknyomas;
	}

	private 
}
