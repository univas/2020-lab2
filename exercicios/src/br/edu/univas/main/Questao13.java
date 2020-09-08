package br.edu.univas.main;

public class Questao13 {

	public static void main(String[] args) {
		System.out.println(exponencial(2, 4));
		System.out.println(exponencial(5, 2));
		System.out.println(exponencial(3, 3));
		System.out.println(exponencial(2, 7));
		System.out.println(exponencial(1, 1));
		System.out.println(exponencial(5, 3));
	}
	
	public static int exponencial(int x, int y) {
		if (y == 1) {
			return x;
		}
		
		return x * exponencial(x, y - 1);
	}
	
}
