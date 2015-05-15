package kaempfer;

import ausruestung.Ruestung;
import ausruestung.Waffe;

public class SchwarzerRitter extends Kaempfer {
	Waffe waffe;
	Ruestung ruestung;
	public SchwarzerRitter() {
		super(100, 8, 200);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int kaempfen() {
		// TODO Auto-generated method stub
		
		return 100*this.getGeschick();
	}

	@Override
	public int abwehren(int angriff) {
		// TODO Auto-generated method stub
		int deltaGesundheit;
		
			deltaGesundheit = angriff - 20;
			if (deltaGesundheit > 0) {
				deltaGesundheit = this.getGesundheit() - deltaGesundheit;
			}else{
				deltaGesundheit = this.getGesundheit();
			}
		
		this.setGesundheit(deltaGesundheit);
		if(this.getGesundheit()<=0){
			System.out.println("Schwarzer Ritter wurde besiegt.");
		}
		return deltaGesundheit;
	}

	@Override
	public void nimmWaffe(Waffe w) {
		// TODO Auto-generated method stub
	}

	@Override
	public void nimmRuestung(Ruestung r) {
		// TODO Auto-generated method stub
	}

}
