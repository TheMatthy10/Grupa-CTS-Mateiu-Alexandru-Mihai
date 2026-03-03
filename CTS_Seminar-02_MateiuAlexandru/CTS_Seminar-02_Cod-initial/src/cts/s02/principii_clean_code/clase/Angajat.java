package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class  Angajat extends Aplicant {

	private String ocupatie;
	private int salariu;

	private static int sumaFinantare;

	public Angajat() {
		super();
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,numarProiecte, denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public String getOcupatie() {
		return this.ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return this.salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume
				+ ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Numar proiecte=" + numarProiecte + ", Denumire proiecte="
				+ Arrays.toString(denumireProiecte) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}
	
	
	public void afisareFinantare() {
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + sumaFinantare + " Euro/zi in proiect.");

	}
	
}
