package cts.s02.principii_clean_code.clase;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumireProiecte;

	private static int pragAcceptare = 80;

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = numarProiecte;
		this.denumireProiecte = denumireProiecte;
	}
	
	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return this.prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return this.varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return this.punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNumarProiecte() {
		return this.numarProiecte;
	}

	public void setNumarProiecte(int numarProiecte, String[] denumireProiecte) {
		this.numarProiecte = numarProiecte;
		this.denumireProiecte = new String[numarProiecte];
		for(int i = 0; i < numarProiecte; i++){
			this.denumireProiecte[i] = denumireProiecte[i];
		}
	}

	public void statutAplicant(){
		System.out.println("Aplicantul " + this.nume + " " + this.prenume + (this.punctaj > pragAcceptare ? " ": "nu") + "a fost acceptat");
	}
}
