package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int a = leitura.nextInt();
		
		System.out.println("Digite o segundo valor:");
		int b = leitura.nextInt();
		
		calculadora(a, b);
		
		leitura.close();
	}
	
	public static void calculadora(int x, int y) {
		int resultado1 = somar(x, y);
		System.out.println(resultado1);
		
		int resultado2 = subtrair(x, y);
		System.out.println(resultado2);
		
		int resultado3 = multiplicar(x, y);
		System.out.println(resultado3);
		
		int resultado4 = dividir(x, y);
		System.out.println(resultado4);
	}
	
	public static int somar(int a, int b) {
		return a + b;
	}
	
	public static int subtrair(int a, int b) {
		return a - b;
	}
	
	public static int multiplicar(int a, int b) {
		return a * b;
	}
	
	public static int dividir(int a, int b) {
		return a / b;
	}
	
}
