package br.edu.univas.main;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int[][] votosCidadePorPartido = new int[7][3];
		leituraDosVotos(votosCidadePorPartido, leitura);
		
		int[] votosTotais = contagemDosVotos(votosCidadePorPartido);
	
		imprimeResultado(votosTotais);
		
		leitura.close();
	}
	
	public static void leituraDosVotos(int[][] votosCidadePorPartido, Scanner leitura) {
		String[] cidades = {"A", "B", "C", "D", "E", "F", "G"};
		String[] partidos = {"X", "Y", "Z"};
 				
		for (int i = 0; i < 7; i++) {
			System.out.println("Cidade: " + cidades[i]);
			
			for (int j = 0; j < 3; j++) {
				System.out.println("Por favor, digite o número total de votos para o partido " + partidos[j]);
				votosCidadePorPartido[i][j] = leitura.nextInt();
			}
		}
	}
	
	public static int[] contagemDosVotos(int[][] votos) {
		int[] votosTotais = new int[3];
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 3; j++) {
				votosTotais[j] += votos[i][j];
			}
		}
		
		return votosTotais;
	}

	public static void imprimeResultado(int[] votosTotais) {
		int x = votosTotais[0];
		int y = votosTotais[1];
		int z = votosTotais[2];
		
		if (x == y && x == z) {
			System.out.println("Os três partidos tiveram a "
					+ "mesma quantidade de votos: " + x);
		} else if (x > y) {
			if (x > z) {
				System.out.println("O partido campeão foi: X. "
						+ "Total de votos: " + x);
			} else if (x == z) {
				System.out.println("Os partidos X e Z empataram a "
						+ "disputa com " + x + " votos!");
			} else {
				System.out.println("O partido campeão foi: Z. "
						+ "Total de votos: " + z);
			}
		} else if (y > x) {
			if (y > z) {
				System.out.println("O partido campeão foi: Y. "
						+ "Total de votos: " + y);
			} else if (y == z) {
				System.out.println("Os partidos Y e Z empataram a "
						+ "disputa com " + y + " votos!");
			} else {
				System.out.println("O partido campeão foi: Z. "
						+ "Total de votos: " + z);
			}
		} else {
			if (x > z) {
				System.out.println("Os partidos X e Y empataram a "
						+ "disputa com " + y + " votos!");
			} else {
				System.out.println("O partido campeão foi: Z. "
						+ "Total de votos: " + z);
			}
		}
	}
}
