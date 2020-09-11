package br.edu.univas.main;

import java.util.Scanner;

public class Questao15 {
 
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite um número qualquer:");
		int numero = leitura.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (isPrimeNumber(i, 2)) {
				System.out.println(i);
			}
		}
		
		leitura.close();
	}
	
	public static boolean isPrimeNumber(int x, int divisor) {
		if (x <= 2 || x == divisor) {
			return true;
		}
		
		if (x % divisor == 0) {
			return false;
		}
		
		return isPrimeNumber(x, divisor + 1);
	}

}
