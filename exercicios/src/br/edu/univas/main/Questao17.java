package br.edu.univas.main;

import java.util.Arrays;
import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int[][] votosCidadePorPartido = new int[7][3];
		leituraDosVotos(votosCidadePorPartido, leitura);
		
		int[] votosTotais = contagemDosVotos(votosCidadePorPartido);
		
		Arrays.sort(votosTotais);
		
		System.out.println("O partido vencedor teve " + votosTotais[2] + " votos");
		
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
	
}
