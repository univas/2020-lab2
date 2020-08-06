package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		//tipos primitivos => 8
		//short, byte, long, float, double, boolean, char, int
		//String => n�o � um tipo primitivo, mas acaba sendo considerada
		//boolean = true ou false
		
		int idade = 10;
		System.out.println(idade);
		
		double peso1 = 19.99;
		float peso2 = 19.99f;
		
		String nome = "Rodrigo";
		String sobreNome = "Faria";
		String nomeCompleto = nome + " " + sobreNome;
		System.out.println(nomeCompleto);
		
		double pesoFinal = peso1 * 10;
		
		if (peso1 > 200) {
			System.out.println("A carga est� muito pesada!");
		} else if (peso1 < 1) {
			System.out.println("A carga est� extremamente leve!");
		} else {
			System.out.println("A carga est� com um peso adequado!");
		}
		
		if (peso1 > 200 && peso2 > 200) {
			System.out.println("As cargas est�o pesadas!");
		}
		
		if (peso1 < 1 || peso2 < 1) {
			System.out.println("Ao menos 1 das cargas est� bem leve!");
		}
		
		int nota = 60;
		switch (nota) {
			case 100:
				System.out.println("Voc� foi muito bem!");
				break;
			case 90:
				System.out.println("Voc� foi bem!");
				break;
			case 80:
				System.out.println("Voc� foi bem!");
				break;
			case 70:
				System.out.println("Voc� foi razo�vel!");
				break;
			case 60:
				System.out.println("Voc� foi na m�dia!");
				break;
			case 50:
				System.out.println("Voc� foi n�o foi bem!");
				break;
			case 40:
				System.out.println("Voc� foi p�ssimo!");
				break;
			default:
				System.out.println("Voc� n�o atingiu a nota minima!");	
		}
		
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome2 = leitura.nextLine();
		System.out.println("Seja bem-vindo: " + nome2);
		System.out.println("Digite seu telefone: ");
		int telefone = leitura.nextInt();
		System.out.println("O seu telefone �: " + telefone);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			//break
			//continue
		}
		
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println(i);
			i--;
		} while(i > 0);
		
		
		int[] notas = new int[10];
		//[5, 88, 99, 101, -90, -5, 7, 12, 2131, 199]
		notas[0] = 5;
		notas[1] = 88;
		notas[2] = 99;
		notas[3] = 101;
		notas[4] = -90;
		notas[5] = -5;
		notas[6] = 7;
		notas[7] = 12;
		notas[8] = 2131;
		notas[9] = 199;
		
		System.out.println("A nota do 3� candidato foi: " + notas[2]);
	}
	
}
