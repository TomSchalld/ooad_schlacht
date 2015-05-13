package ausruestung;

public class Ruestung extends Ausruestung {
	
	private int schutz;
	public Ruestung(String name, int preis, int schutz) {
		super(name, preis);
		this.schutz = schutz;
	}
	public int abwehren(int angriff){
		return angriff - this.getSchutz();
	}
	public int getSchutz() {
		return schutz;
	}
	public void setSchutz(int schutz) {
		this.schutz = schutz;
	}

}
