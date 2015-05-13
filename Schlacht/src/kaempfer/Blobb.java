package kaempfer;

import ausruestung.Ruestung;
import ausruestung.Waffe;

public class Blobb extends Kaempfer {
	Waffe waffe;
	public Blobb(int gesundheit, int geschick, int sold) {
		super(gesundheit, geschick, sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int kaempfen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int abwehren(int angriff) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int nimmWaffe(Waffe w) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int nimmRuestung(Ruestung r) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Waffe getWaffe() {
		return waffe;
	}

	public void setWaffe(Waffe waffe) {
		this.waffe = waffe;
	}
	
}
