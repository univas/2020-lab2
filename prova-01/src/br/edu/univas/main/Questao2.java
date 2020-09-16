package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite uma palavra:");
		String palavra = leitura.nextLine();
		
		String inverso = invert(palavra);
		System.out.println("O inverso é: " + inverso);

		leitura.close();
	}
	
	public static String invert(String palavra) {
		String novaPalavra = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			novaPalavra += palavra.charAt(i);
		}
		
		return novaPalavra;
	}
	
}
