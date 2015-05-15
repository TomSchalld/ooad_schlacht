package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import ausruestung.Ruestung;
import ausruestung.Waffe;

import kaempfer.*;

public class Main {

	public List<Kaempfer> kaempfer = new ArrayList<Kaempfer>();
	public Kaempfer sr = new SchwarzerRitter();
	private int duplosen = 600;
	private Kaempfer[] soeldner = { new Conan(40, 6, 120),
			new Xenia(60, 8, 110), new Blobb(80, 10, 100) };
	private Ruestung[] ruestungen = {
			new Ruestung(Messages.getString("Main.0"), 4, 20), //$NON-NLS-1$
			new Ruestung(Messages.getString("Main.1"), 6, 50), //$NON-NLS-1$
			new Ruestung(Messages.getString("Main.2"), 7, 70), //$NON-NLS-1$
			new Ruestung(Messages.getString("Main.3"), 10, 100) }; //$NON-NLS-1$
	private Waffe[] waffen = { new Waffe(Messages.getString("Main.4"), 4, 30), //$NON-NLS-1$
			new Waffe(Messages.getString("Main.5"), 7, 70), //$NON-NLS-1$
			new Waffe(Messages.getString("Main.6"), 8, 90), //$NON-NLS-1$
			new Waffe(Messages.getString("Main.7"), 10, 120) //$NON-NLS-1$
	};

	private void starten() {
		System.out.println(Messages.getString("Main.8") + //$NON-NLS-1$
				"==================\n"); //$NON-NLS-1$
		int eingabe = -1;
		while (eingabe != 0) {
			System.out.println(Messages.getString("Main.10") + duplosen //$NON-NLS-1$
					+ Messages.getString("Main.11") //$NON-NLS-1$
					+ Messages.getString("Main.12") //$NON-NLS-1$
					+ Messages.getString("Main.13") //$NON-NLS-1$
					+ Messages.getString("Main.14") //$NON-NLS-1$
					+ Messages.getString("Main.15")); //$NON-NLS-1$
			eingabe = Eingabe.leseInt();
			if (eingabe == 1)
				neuerSoeldner();
			if (eingabe == 2)
				neueWaffe();
			if (eingabe == 3)
				neueRuestung();
			if (duplosen < 0) {
				System.out.println(Messages.getString("Main.16")); //$NON-NLS-1$
				return;
			}
		}
		kaempfen();
	}

	private int auswahl(Object[] o) {
		if (o == null) {
			System.out.println(Messages.getString("Main.17")); //$NON-NLS-1$
			return -1;
		}
		for (int i = 0; i < o.length; i++)
			System.out.println("(" + i + ") " + o[i]); //$NON-NLS-1$ //$NON-NLS-2$
		int ergebnis = -1;
		while (ergebnis < 0 || ergebnis >= o.length)
			ergebnis = Eingabe.leseInt();
		return ergebnis;
	}

	// Absturz, wenn vorher kein Kaempfer gew�hlt
	private void neueRuestung() {
		System.out.println(Messages.getString("Main.20")); //$NON-NLS-1$
		Ruestung r = ruestungen[auswahl(ruestungen)];
		duplosen -= r.getPreis();
		System.out.println(Messages.getString("Main.21")); //$NON-NLS-1$
		Kaempfer k = kaempfer.get(auswahl(kaempfer.toArray()));
		k.nimmRuestung(r);
	}

	// Absturz, wenn vorher kein Kaempfer gew�hlt
	private void neueWaffe() {
		System.out.println(Messages.getString("Main.22")); //$NON-NLS-1$
		Waffe w = waffen[auswahl(waffen)];
		duplosen -= w.getPreis();
		System.out.println(Messages.getString("Main.23")); //$NON-NLS-1$
		Kaempfer k = kaempfer.get(auswahl(kaempfer.toArray()));
		k.nimmWaffe(w);
	}

	private void neuerSoeldner() {
		System.out.println(Messages.getString("Main.24")); //$NON-NLS-1$
		Kaempfer k = soeldner[auswahl(soeldner)];
		kaempfer.add(k);
		duplosen -= k.getSold();
	}

	private void kaempfen() {
		// hier fehlt was
		// missing code
		while (sr.getGesundheit() > 0) {
			for (Kaempfer k : this.kaempfer) {
				k.abwehren(this.sr.kaempfen());
				if (k.getGesundheit() <= 0) {
					this.kaempfer.remove(k);
					if(this.kaempfer.isEmpty()){
						System.out.println("Spieler hat verloren.");
						break;
					}
				}
			}
			for (Kaempfer k : this.kaempfer) {
				this.sr.abwehren(k.kaempfen());
				if(this.sr.getGesundheit()<=0){
					break;
				}
			}
		}

		System.out.println(Messages.getString("Main.25")); //$NON-NLS-1$
	}

	public static void main(String[] args) {
		Locale.setDefault(new Locale("de", "DE")); //$NON-NLS-1$ //$NON-NLS-2
		new Main().starten();
	}

}
