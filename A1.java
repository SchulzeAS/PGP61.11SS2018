// TODO Auto-generated constructor stub

public class A1 {
	public static void main(String[] args) {
		Konto k = new Konto("Max","Mustermann",10.30,"1234567890");
		GiroKonto gk = new GiroKonto(10.0, 1.0);
		SparKonto sk = new SparKonto(20.0, 2);
		gibaus(k);
		gibaus(gk);
		gk.setKontonummer("12131341");
		gibaus(gk);
	}
	public static void gibaus(Konto k ) {
		System.out.println(k.toString());
	}

	
	
	
}
class Konto{
	double Kontostand;
	String VNameHalter;
	public String getVNameHalter() {
		return VNameHalter;
	}
	public Konto (String Vorname, String Nachname, double beginn, String Kontonummer) {
		this.setKontonummer(Kontonummer);
		this.setVNameHalter(Vorname);
		this.setNnameHalter(Nachname);
		this.Kontostand = beginn;
	
		// TODO Auto-generated constructor stub
	}

	public void setVNameHalter(String vNameHalter) {
		VNameHalter = vNameHalter;
	}

	public String getNnameHalter() {
		return NnameHalter;
	}

	public void setNnameHalter(String nnameHalter) {
		NnameHalter = nnameHalter;
	}

	public String getKontonummer() {
		return Kontonummer;
	}

	public void setKontonummer(String kontonummer) {
		Kontonummer = kontonummer;
	}
	String NnameHalter;
	String Kontonummer;
	 public Konto(double beginn) {	
		 this.Kontostand = beginn;
	 }
	
	void einzahlen(double obj) {
		if(obj >0) {
		this.Kontostand += obj;
		} else {
			throw new UnsupportedOperationException("CANNOT DEPOSIT LESS THAN 0€");
		}
	}
	void abheben(double obj) {
		if (obj > 0) {
			this.Kontostand -= obj;
		} else throw new UnsupportedOperationException("CANNOT WITHDRAW LESS THAN 0€");
	}
	
	void ueberweisenAuf(Konto ziel, double obj) {
		this.Kontostand -= obj;
		ziel.Kontostand += obj;
		//Atomicity not watched.
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#" + this.Kontonummer + " Hr./Fr. " + VNameHalter + " " + NnameHalter + " Stand:" + Kontostand;
	}
}

class GiroKonto extends Konto{
double gebuehr;
	public GiroKonto(double beginn, double gebuehr) {
		super(beginn); //this seems mandatory, but why? maybe explain in feedback ? :c
		this.Kontostand = beginn;
		this.gebuehr = gebuehr;
		// TODO Auto-generated constructor stub
	}
	@Override
		void ueberweisenAuf(Konto ziel, double obj) {
			// TODO Auto-generated method stub
			super.ueberweisenAuf(ziel, obj);
			if(ziel instanceof GiroKonto && this instanceof GiroKonto) {//probably misinterpreted.
				this.Kontostand -= gebuehr;
				//ODER :
				ziel.Kontostand -= gebuehr;
			}
		}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString() + " Typ:Giro";
		}
	
}
class SparKonto extends Konto{
	double Zinssatz; //Contains percentage, e.g 2.00 -> 2%
	public SparKonto(double beginn,double Zinssatz) {
		super(beginn);
		this.Kontostand = beginn;
		this.Zinssatz = Zinssatz;
		// TODO Auto-generated constructor stub
	}
	void Zinsenanrechnen() {
		this.Kontostand *= ((Zinssatz+1) / 100);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Typ:Sparkonto";
	}
	
}
/**n dieser Aufgabe sollen Sie sich an dem Beispiel verschiedener Konten genauer mit der Vererbung in Java beschäftigen.

a) Erstellen Sie eine Oberklasse Konto. Auf jedes Konto sollen die Methoden double getKontoStand(), 
void einzahlen(double x), void abheben(double x )  und void ueberweisenAuf ( Konto ziel, double betrag) angewendet werden können. 
Außerdem enthält sie den Konstruktor Konto (double  anfangsBetrag ) und das Attribut double kontoStand.

b) Von der Klasse Konto erben die beiden Klassen SparKonto und GiroKonto. Implementieren Sie diese beiden Klassen ebenfalls.
 Die Klasse SparKonto soll als weiteres Attribut den Zinssatz(double zinsSatz) speichern, einen Konstruktor SparKonto(double anfangsBetrag, double zinsSatz)
  und die zusätzliche Methode void zinsenAnrechnen() enthalten.
Das GiroKonto besitzt zusätzlich zum Bankkonto das Attribut double gebuehr und einen Konstruktor GiroKonto (double  anfangsBetrag , double  gebuehr)

c) Überschreiben Sie die Funktionen in der Klasse GiroKonto, so dass beim Einzahlen und Abheben von Geld, die Gebühr vom Kontostand abgezogen wird.
 Die Gebühren sollen auch bei Überweisungen zu und von einem GiroKonto berechnet werden.

d) Erstellen Sie entsprechende String toString() Methoden, die Informationen über das Konto ausgeben.

Hinweis: Schreiben Sie die komplette Implementierung innerhalb einer Datei (Konto.java) und ergänzen dort auch einen Testrahmen. 
Dies ist möglich, indem Sie die erbenden Klassen nicht public machen.**/