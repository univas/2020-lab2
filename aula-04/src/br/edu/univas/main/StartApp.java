package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {		
		float[] notas = leituraNotas();

		ajustaNota(notas);
		
		impressaoNotas(notas);
	}

	public static float[] leituraNotas() {
		Scanner leitura = new Scanner(System.in);
		
		float[] notas = new float[10];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota: ");
			notas[i] = leitura.nextInt();
		}
		
		leitura.close();
		return notas;
	}
	
	public static void ajustaNota(float[] notasDigitadas) {
		for (int i = 0; i < notasDigitadas.length; i++) {
			notasDigitadas[i] *= 1.5f;
		}
	}
	
	public static void impressaoNotas(float[] notas) {
		System.out.println("\n\nNotas digitadas:");
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println((i + 1) + "ª nota: " + notas[i]);
		}
	}
	
}
