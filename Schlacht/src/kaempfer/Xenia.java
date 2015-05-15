package kaempfer;

import ausruestung.Ruestung;
import ausruestung.Waffe;

public class Xenia extends Kaempfer {
	Waffe waffe;
	Ruestung ruestung;
	public Xenia(int gesundheit, int geschick, int sold) {
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
	public void nimmWaffe(Waffe w) {
		// TODO Auto-generated method stub
	}

	@Override
	public void nimmRuestung(Ruestung r) {
		// TODO Auto-generated method stub
	}

	public Waffe getWaffe() {
		return waffe;
	}

	public void setWaffe(Waffe waffe) {
		this.waffe = waffe;
	}

	public Ruestung getRuestung() {
		return ruestung;
	}

	public void setRuestung(Ruestung ruestung) {
		this.ruestung = ruestung;
	}

}
