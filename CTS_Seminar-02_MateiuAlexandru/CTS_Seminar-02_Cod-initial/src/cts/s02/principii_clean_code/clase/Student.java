package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantare;

	public Student() {
		super();

	}

	public Student(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiecte, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,numarProiecte,denumireProiecte);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	
	public String getFacultate() {
		return this.facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return this.anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}


	@Override
	public String toString() {
		return "Student: Nume=" + this.nume + ", Prenume=" + this.prenume + ", Varsta=" + this.varsta + ", Punctaj=" + this.punctaj + ", Numar proiecte=" + this.numarProiecte+  ", Denumire Proiect=" + Arrays.toString(this.denumireProiecte) + "Facultate=" + this.facultate + ", An_studii=" + this.anStudii ;
	}

	public void afisareFinantare() {

		System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + sumaFinantare + " Euro/zi in proiect.");

	}
	
}
