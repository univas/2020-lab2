package br.edu.univas.main;

import java.util.Scanner;

public class Questao18 {
	
	static String[] cidades = {"A", "B", "C", "D", "E", "F", "G", "H"};
	static int quantity = cidades.length;

	public static void main(String[] args) {
		int[][] distanciaCidades = new int[quantity][quantity];
		
		readData(distanciaCidades);
		
		imprimeCidadesVizinhas(distanciaCidades);
	}
	
	public static void readData(int[][] distanciaCidades) {
		Scanner leitura = new Scanner(System.in);
		
		for (int i = 0; i < quantity; i++) {
			
			for (int j = 0; j < quantity; j++) {
				
				if (i == j) {
					distanciaCidades[i][j] = 0;
				} else {					
					System.out.println("Por favor, digite a distancia entre a " +
							"cidade " + cidades[i] + " e a cidade " + cidades[j]);
					
					distanciaCidades[i][j] = leitura.nextInt();
				}
			}
		}
		
		leitura.close();
	}
	
	public static void imprimeCidadesVizinhas(int[][] distanciaCidades) {
		for (int i = 0; i < quantity; i++) {
			System.out.println("\nCidades vizinhas da cidade " + cidades[i] + " são:");
			
			for (int j = 0; j < quantity; j++) {
				if (distanciaCidades[i][j] > 0) {
					System.out.print(cidades[j] + " ");
				}
			}
		}
	}
	
}
