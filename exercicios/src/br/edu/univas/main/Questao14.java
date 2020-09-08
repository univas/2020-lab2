package br.edu.univas.main;

public class Questao14 {

	public static void main(String[] args) {
		System.out.println(fibonacci(6));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(11));
	}

	public static int fibonacci(int x) {
		if (x == 1 || x == 2) {
			return 1;
		}
		
		return fibonacci(x - 1) + fibonacci(x - 2);
	}
}
