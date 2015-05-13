package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Eingabe {

  public static String leseString(){
  	String ergebnis;
  	
	BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
    try {
		ergebnis=in.readLine();
	} catch (IOException e) {
		ergebnis="";
	}
	return ergebnis;
  }

  public static int leseInt(){
  	int ergebnis;
  	try {
		ergebnis=Integer.decode(leseString()).intValue();
	} catch (NumberFormatException e) {
		ergebnis=0;
	}
  	
  	return ergebnis;		
  }

  public static float leseFloat(){
	float ergebnis;
	try {
		ergebnis=Float.valueOf(leseString()).floatValue();
	} catch (NumberFormatException e) {
		ergebnis=0f;
	}
  	
	return ergebnis;		
  }

  public static double leseDouble(){
	double ergebnis;
	try {
		ergebnis=Double.valueOf(leseString()).doubleValue();
	} catch (NumberFormatException e) {
		ergebnis=0d;
	}
  	
	return ergebnis;		
  }

  public static boolean leseBoolean(){
	boolean ergebnis;
	try {
		ergebnis=Boolean.valueOf(leseString()).booleanValue();
	} catch (NumberFormatException e) {
		ergebnis=false;
	}
  	
	return ergebnis;		
  }

// rein zu Testzwecken hier stehen gelassen, kann gelöscht werden
	public static void main (String[] s){
		int eingabe=0;
		while(eingabe!=-1){
			System.out.print("Text eingeben: ");
			System.out.println("Eingeben wurde:"+leseString());
			System.out.print("Float eingeben: ");
			System.out.println("Eingeben wurde:"+leseFloat());
			System.out.print("Double eingeben: ");
			System.out.println("Eingeben wurde:"+leseDouble());
			System.out.print("Boolean eingeben: ");
			System.out.println("Eingeben wurde:"+leseBoolean());
			System.out.print("Ganze Zahl eingeben (Abbruch mit -1): ");
			eingabe=leseInt();
			System.out.println("Eingeben wurde: "+eingabe);
		}
	}
}

