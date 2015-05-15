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
		int ap = this.getGeschick();
		if (this.getWaffe() != null) {
			ap = this.getWaffe().zuhauen(this.getGeschick());
		}
		System.out.println("Xenia greift mit " + ap
				+ " an.");
		return ap;
	}

	@Override
	public int abwehren(int angriff) {
		int deltaGesundheit=  angriff;
		if (this.getRuestung() != null) {
			deltaGesundheit = this.getRuestung().abwehren(angriff);
		}
		deltaGesundheit = this.getGesundheit() - deltaGesundheit;
		this.setGesundheit(deltaGesundheit);
		if (this.getGesundheit() <= 0) {
			System.out.println("Xenia ist gefallen.");
		}
		return deltaGesundheit;
	}

	@Override
	public void nimmWaffe(Waffe w) {
		// TODO Auto-generated method stub
		this.setWaffe(w);
	}

	@Override
	public void nimmRuestung(Ruestung r) {
		// TODO Auto-generated method stub
		this.setRuestung(r);
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Xenia " + super.toString();
	}
}
