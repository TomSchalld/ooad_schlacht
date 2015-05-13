package kaempfer;

import ausruestung.Ruestung;
import ausruestung.Waffe;

public class Conan extends Kaempfer {
	Waffe waffen[];
	Ruestung ruestung;
	public Conan(int gesundheit, int geschick, int sold) {
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

	public Waffe[] getWaffen() {
		return waffen;
	}

	public void setWaffen(Waffe[] waffen) {
		this.waffen = waffen;
	}

	public Ruestung getRuestung() {
		return ruestung;
	}

	public void setRuestung(Ruestung ruestung) {
		this.ruestung = ruestung;
	}

}
