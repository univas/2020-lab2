package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Carro;

public class StartApp {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao cadastro de veiculos!");
		System.out.println("Digite a quantidade de carros que você quer salvar:");
		int quantidade = leitura.nextInt();
		leitura.nextLine();
		
		Carro[] carros = new Carro[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			Carro carro = new Carro();
			System.out.println("\n\nInforme os dados do carro");
			System.out.println("Informe o modelo:");
			carro.modelo = leitura.nextLine();
			
			System.out.println("Informe o ano de fabricação do veículo:");
			carro.anoFabricacao = leitura.nextInt();
			leitura.nextLine();
			
			System.out.println("Informe o ano modelo do veículo:");
			carro.anoModelo = leitura.nextInt();
			leitura.nextLine();
			
			System.out.println("Informe a placa:");
			carro.placa = leitura.nextLine();
			
			System.out.println("Informe a cor:");
			carro.cor = leitura.nextLine();
			
			System.out.println("Informe o preço:");
			carro.preco = leitura.nextDouble();
			leitura.nextLine();
			
			carros[i] = carro;
		}
		
		System.out.println("\n\nCarros Cadastrados\n\n");
		for (int i = 0; i < quantidade; i++) {
			Carro carro = carros[i];
			System.out.println("Modelo: " + carro.modelo);
			System.out.println("Ano de fabricação: " + carro.anoFabricacao);
			System.out.println("Ano modelo: " + carro.anoModelo);
			System.out.println("Placa: " + carro.placa);
			System.out.println("Cor: " + carro.cor);
			System.out.println("Preço: " + carro.preco);
			System.out.println("\n\n");
		}
		
		leitura.close();
	}
	
}
