package kaempfer;

import ausruestung.Ruestung;
import ausruestung.Waffe;

public class SchwarzerRitter extends Kaempfer {
	Waffe waffe;
	Ruestung ruestung;

	public SchwarzerRitter() {
		super(400, 8, 200);
		this.nimmRuestung(new Ruestung("Schwarzer Ritter Ruestung", 0, 150));
		this.nimmWaffe(new Waffe("Schwarzer Ritter Schwert", 0, 175));
		// TODO Auto-generated constructor stub
	}

	@Override
	public int kaempfen() {
		int ap = this.getGeschick();
		if (this.getWaffe() != null) {
			ap = this.getWaffe().zuhauen(this.getGeschick());
		}
		System.out.println("Schwarzer Ritter greift mit " + ap
				+ " an.");
		return ap;
	}

	@Override
	public int abwehren(int angriff) {
		// TODO Auto-generated method stub
		int deltaGesundheit=  angriff;
		if (this.getRuestung() != null) {
			deltaGesundheit = this.getRuestung().abwehren(angriff);
		}
		deltaGesundheit = this.getGesundheit() - deltaGesundheit;
		this.setGesundheit(deltaGesundheit);
		if (this.getGesundheit() <= 0) {
			System.out.println("Schwarzer Ritter wurde besiegt.");
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
		return "Schwarzer Ritter " + super.toString();
	}
}
