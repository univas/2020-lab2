package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 11;
		int nota3 = 12;
		int nota4 = 13;
		
		int[] notas1Bimestre = new int[10];
		int[] notas2Bimestre = new int[10];
		int[] notas3Bimestre = new int[10];
		int[] notas4Bimestre = {1, 5, 4, 8, 77, 90, 12, 23, 54, 11};
		
		int[][] notas = new int[10][4];
		int[][] notas2 = {
				{50, 60, 70, 100},
				{43, 12, 77, 99, 84}
		};
		
		//inserindo as notas do 1º aluno
		notas[0][0] = 50;
		notas[0][1] = 60;
		notas[0][2] = 70;
		notas[0][3] = 100;
		
		int[] x = notas[0];
		x[0] = 50;
		x[1] = 60;
		x[2] = 70;
		x[3] = 100;

		//inserindo as notas do 10º aluno
		notas[9][0] = 15;
		notas[9][1] = 28;
		notas[9][2] = 11;
		notas[9][3] = 43;
		
		int[][] notasSI = new int[10][4];
		
		Scanner leitura = new Scanner(System.in);
		
		for (int i = 0; i < notasSI.length; i++) {
			int[] n = notasSI[i];
			System.out.println("Aluno " + (i + 1));
			
			for (int j = 0; j < n.length; j++) {
				System.out.println("Por favor, digite a nota:");
				n[j] = leitura.nextInt();
			}
		}
		
		
		
		leitura.close();
		System.out.println("Saida!");
	}
	
}
