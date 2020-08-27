package br.edu.univas.main;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		int[] valores = leituraValores();
		
		int valorBuscado = 5;
		
		int contador = verificaOcorrencia(valores, valorBuscado);
		
		System.out.println("O número de vezes que apareceu o 5 foi: " + contador);
	}
	
	public static int[] leituraValores() {
		Scanner leitura = new Scanner(System.in);

		int[] resultado = new int[10];
		
		for (int i = 0; i < resultado.length; i++) {
			System.out.println("Digite um número: ");
			resultado[i] = leitura.nextInt();
		}
		
		leitura.close();
		return resultado;
	}
	
	public static int verificaOcorrencia(int[] listaDeValores, int valorReferencia) {
		int contador = 0;
		
		for (int i = 0; i < listaDeValores.length; i++) {
			if (listaDeValores[i] == valorReferencia) {
				contador++;
			}
		}
		
		return contador;
	}
}
