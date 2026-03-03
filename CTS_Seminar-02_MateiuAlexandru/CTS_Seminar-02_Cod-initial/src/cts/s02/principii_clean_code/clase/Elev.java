package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int sumaFinantare;

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int numarProiecte, String[] denumireProiecte, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,numarProiecte,denumireProiecte);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public int getClasa() {
		return this.clasa;
	}

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public String getTutore() {
		return this.tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		return "Elev: Nume=" + this.nume + ", Prenume=" + this.prenume + ", Varsta="
				+ this.varsta + ", Punctaj=" + this.punctaj + ", Nr_proiecte=" + this.numarProiecte  + ", DenumireProiecte="
				+ Arrays.toString(this.denumireProiecte) + "Clasa=" + this.clasa + ", Tutore=" + this.tutore;
	}

	public int finantare() {
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + sumaFinantare + " Euro/zi in proiect.");
		return sumaFinantare;
	}
	
}