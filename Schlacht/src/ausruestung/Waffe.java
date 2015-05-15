package ausruestung;

public class Waffe extends Ausruestung {
	private int staerke; //

	public Waffe(String name, int preis, int staerke) {
		super(name, preis);
		this.staerke = staerke;
	}

	public int zuhauen(int geschick) {
		return (this.getStaerke() * geschick)/10;
	}

	public int getStaerke() {
		return staerke;
	}

	public void setStaerke(int staerke) {
		this.staerke = staerke;
	}

	@Override
	public String toString() {
		return this.getName() + " " + this.getPreis() + " Dupl. "
				+ this.getStaerke() + " Staerke";
	}
}
