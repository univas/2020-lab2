package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	//um metodo static só pode chamar outro metodo static!
	//um metodo não static pode chamar um metodo static!
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		System.out.println("Por favor, digite seu primeiro nome:");
		String nome = leitura.nextLine();
		System.out.println("Por favor, digite seu sobrenome:");
		String sobreNome = leitura.nextLine();
		imprimeOla(nome, sobreNome);
		
		imprimeMenu();
		
		int opcao = leitura.nextInt();
		System.out.println("Entre com o primeiro valor:");
		int a = leitura.nextInt();
		System.out.println("Entre com o segundo valor:");
		int b = leitura.nextInt();
		
		int c = 0;
		
		if (opcao == 1) {
			c = soma(a, b);
		} else if (opcao == 2) {
			c = subtracao(a, b);
		}
		
		imprimeResultado(c);
		
		leitura.close();
	} // fim do metodo main
	
	public static void imprimeMenu() {
		//refatorar / refatoração
		//aqui está o que o meu metodo sabe fazer :)
		System.out.println("CALCULADORA");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("Escolha uma opção:");
	}
	
	public static int soma(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int subtracao(int x, int y) {
		return x - y;
	}
	
	public static void imprimeResultado(int resultado) {
		System.out.println("O resultado é: " + resultado);
	}
	
	public static void imprimeOla(String nome, String sobreNome) {
		System.out.println("Seja bem-vindo " + nome + " " + sobreNome);
	}

}
