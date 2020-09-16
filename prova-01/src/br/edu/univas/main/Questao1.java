package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int[] notas = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite sua nota:");
			notas[i] = leitura.nextInt();
		}
		
		int[] notasCalculadas = calculaNota(notas);
		int total = calculaQuantidadeMaior60(notasCalculadas);
		
		System.out.println("Total de alunos que tem nota maior ou igual a 60: " + total);
		
		leitura.close();
	}
	
	public static int[] calculaNota(int[] notas) {
		int[] notasCalculadas = new int[20];
		
		for (int i = 0, j = 0; i < 10; i++, j += 2) {
			notasCalculadas[j] = notas[i];
			int valor = 1;
			if (notas[i] < 60) {
				valor = 0;
			}
			
			notasCalculadas[j + 1] = valor;
		}
		
		return notasCalculadas;
	}
	//[12, 0, 61, 1, 54, 0, 87, 1, 69, 1, 20,  0, 32,  0, 75,  1, 38,  0, 65,  1]
	//[0 , 1,  2, 3,  4, 5,  6, 7,  8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
	public static int calculaQuantidadeMaior60(int[] notas) {
		int contador = 0;
		for (int i = 1; i < 20; i += 2) {
			if (notas[i] == 1) {
				contador++;
			}
		}
		
		return contador;
	}
	
}
