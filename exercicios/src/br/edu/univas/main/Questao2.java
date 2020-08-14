package br.edu.univas.main;

public class Questao2 {

	public static void main(String[] args) {
		int resultado1 = somar(10, 20);
		System.out.println(resultado1);
		
		int resultado2 = subtrair(10, 20);
		System.out.println(resultado2);
		
		int resultado3 = multiplicar(10, 20);
		System.out.println(resultado3);
		
		int resultado4 = dividir(10, 20);
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
