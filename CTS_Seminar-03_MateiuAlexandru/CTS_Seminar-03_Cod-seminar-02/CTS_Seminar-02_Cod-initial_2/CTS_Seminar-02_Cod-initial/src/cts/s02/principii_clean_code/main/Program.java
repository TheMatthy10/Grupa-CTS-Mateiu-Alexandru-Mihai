package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.readers.AplicantReader;
import cts.s02.principii_clean_code.readers.StudentReader;

public class Program {

	private static Aplicant aplicant;

	public static void main(String[] args) {
		List<Aplicant> listaStudenti;
		AplicantReader reader = new StudentReader();
        try {
            listaStudenti = reader.citireAplicanti("studenti.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Aplicant aplicant : listaStudenti)
				System.out.println(aplicant.toString());
				aplicant.afisareAplicant();
		}
		}



