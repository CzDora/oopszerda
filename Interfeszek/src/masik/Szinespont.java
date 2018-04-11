package masik;

import java.awt.Color;

import sajat.ISzinezheto;

public class Szinespont extends Pont implements ISzinezheto {
	
	private Color szin;
	
	

	public Szinespont(int x, int y, Color szin) {
		super(x, y);
		this.szin = szin;
	}
	
	

	public Szinespont(Color szin) {
		super(0, 0);
		this.szin = szin;
	}


	@Override
	public String toString() {
		return "Szinespont [szin=" + szin + ", toString()=" + super.toString() + "]";
	}



	@Override
	public Color getAlapertelmezett() {
		return alapertelmezett;
	}

	@Override
	public void setAlapertelmezett(Color szin) {
        //szin = alapertelmezett; 
		this.szin = szin;
	}
	
	

}
