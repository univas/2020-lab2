package br.edu.univas.main;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int opcao = leitura.nextInt();
		
		int total = subtracao(opcao);
		
		System.out.println(total);
		
		leitura.close();
	}
	
	public static int subtracao(int n) {
		if (n == 0) {
			return 0;
		}
		
		return n - subtracao(n - 1);
	}
	
}
