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
		int aP = 0;
		Waffe tmp[] = this.getWaffen();
		if (tmp[0] != null) {
			aP += tmp[0].getStaerke() * this.getGeschick();
			if (tmp[1] != null) {
				aP += tmp[1].getStaerke() * this.getGeschick();
			}
		} else {
			return this.getGeschick();
		}

		return aP;
	}

	@Override
	public int abwehren(int angriff) {
		// TODO Auto-generated method stub
		int deltaGesundheit;
		if (this.getRuestung() != null) {
			deltaGesundheit = angriff - this.getRuestung().getSchutz();
			if (deltaGesundheit < 0) {
				deltaGesundheit = this.getGesundheit() - deltaGesundheit;
			}
		} else {
			deltaGesundheit = this.getGesundheit() - angriff;
		}
		
		this.setGesundheit(deltaGesundheit);
		if(this.getGesundheit()<=0){
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

}
