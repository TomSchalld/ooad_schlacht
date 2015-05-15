package kaempfer;

import ausruestung.Ruestung;
import ausruestung.Waffe;

public class Conan extends Kaempfer {
	Waffe waffen[];
	Ruestung ruestung;

	public Conan(int gesundheit, int geschick, int sold) {
		super(gesundheit, geschick, sold);
		this.waffen = new Waffe[2];
		// TODO Auto-generated constructor stub
	}

	@Override
	public int kaempfen() {
		// TODO Auto-generated method stub
		int aP = this.getGeschick();
		Waffe tmp[] = this.getWaffen();
		if (tmp[0] != null) {
			aP += tmp[0].zuhauen(this.getGeschick());
			if (tmp[1] != null) {
				aP += tmp[1].zuhauen(this.getGeschick());
			}
		}
		System.out.println("Conan greift mit " + aP + " an.");

		return aP;
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
			System.out.println("Conan ist gefallen.");
		}
		return deltaGesundheit;

	}

	@Override
	public void nimmWaffe(Waffe w) {
		// TODO Auto-generated method stub
		Waffe tmp[] = this.getWaffen();
		if (tmp[0] == null) {
			tmp[0] = w;
		} else {
			tmp[1] = tmp[0];
			tmp[0] = w;
		}
	}

	@Override
	public void nimmRuestung(Ruestung r) {
		// TODO Auto-generated method stub
		this.setRuestung(r);
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conan " + super.toString();
	}
}
