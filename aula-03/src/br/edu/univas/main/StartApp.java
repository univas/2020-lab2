package br.edu.univas.main;

public class StartApp {

	static int mes = 8;
	
	public static void main(String[] args) {
		int ano = 2020;
		System.out.println(ano);
		
		metodo1(ano);
		metodo2();
	}
	
	public static void metodo1(int ano) {
		ano = 2021;
		int ano2 = 2023;
		System.out.println(ano);
		System.out.println(mes);
		mes++;
	}
	
	public static void metodo2() {
		int ano = 2022;
		int mes = 1;
		System.out.println(ano);
		System.out.println(mes);
	}
}
