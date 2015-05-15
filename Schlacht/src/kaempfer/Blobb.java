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
		if(this.getWaffe()==null){
			return this.getGeschick();
		}
		return this.getWaffe().getStaerke()*this.getGeschick();
	}

	@Override
	public int abwehren(int angriff) {
		// TODO Auto-generated method stub
		int neueGesundheit = this.getGesundheit()-angriff;
		if(neueGesundheit<=0){
			this.setGesundheit(0);
			System.out.println("Blobb ist gefallen");
		}else{
			this.setGesundheit(neueGesundheit); 
		}
		return angriff;
	}

	@Override
	public void nimmWaffe(Waffe w) {
		// TODO Auto-generated method stub
		this.setWaffe(w);
	}

	@Override
	public void nimmRuestung(Ruestung r) {
		// TODO Auto-generated method stub
		System.out.println("Blobb kann keine Ruestung tragen.");
	}

	public Waffe getWaffe() {
		return waffe;
	}

	public void setWaffe(Waffe waffe) {
		this.waffe = waffe;
	}
	
}
