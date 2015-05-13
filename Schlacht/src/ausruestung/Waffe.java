package ausruestung;

public class Waffe extends Ausruestung {
	private int staerke; // 
	public Waffe(String name, int preis, int staerke) {
		super(name, preis);
		this.staerke = staerke;
	}
	
	public int zuahuen(int geschick){
		return this.getStaerke()*geschick;
	}
	
	public int getStaerke() {
		return staerke;
	}
	public void setStaerke(int staerke) {
		this.staerke = staerke;
	}

}
