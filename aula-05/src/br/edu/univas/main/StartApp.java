package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		System.out.println("Metodo main 1.0");
		
		metodo1();
		metodo2();
		metodo2();
		metodo2();
		
		System.out.println("Metodo main 2.0");
		
		metodo3();
	}
	
	public static void metodo1() {
		System.out.println("Eu sou o metodo 1");
		
		metodo2();
	}
	
	public static void metodo2() {
		System.out.println("Eu sou o metodo 2");
	}
	
	public static void metodo3() {
		System.out.println("Eu sou o metodo 3");
	}
	
	
}
