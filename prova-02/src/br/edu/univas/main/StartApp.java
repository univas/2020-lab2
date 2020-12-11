package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Conta;

public class StartApp {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Conta[] contas = new Conta[100];
		int index = 0;
		
		int option = 0;
		
		do {
			printMenu();
			option = leitura.nextInt();
			leitura.nextLine();
			
			if (option == 1) {
				if (index == 100) {
					System.out.println("Máximo de contas já cadastradas!");
				} else {					
					contas[index++] = cadastroConta(leitura);
				}
				
			} else if (option == 2) {
				exibeSaldo(contas);
				
			} else if (option != 3) {
				System.out.println("Opção inválida!");
			}
			
			
		} while(option != 3);
		
		leitura.close();
	}
	
	public static void printMenu() {
		System.out.println("****CONTROLE DE CONTAS****");
		System.out.println("1 - Cadastro de Conta");
		System.out.println("2 - Ver Saldo");
		System.out.println("3 - Sair");
	}
	
	public static Conta cadastroConta(Scanner leitura) {
		Conta conta = new Conta();
		
		System.out.println("Por favor, digite a descrição:");
		conta.descricao = leitura.nextLine();
		
		System.out.println("Por favor, digite o valor:");
		conta.valor = leitura.nextFloat();
		leitura.nextLine();
		
		System.out.println("Por favor, digite a data de vencimento:");
		conta.dataVencimento = leitura.nextLine();
		
		System.out.println("Por favor, digite o tipo:");
		conta.tipo = leitura.nextLine();
		
		return conta;
	}
	
	public static void exibeSaldo(Conta[] contas) {
		float saldo = 0.0f;
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = contas[i];
			if (conta == null) {
				break;
			}
			
			if (conta.tipo.equals("Despesa")) {
				saldo -= conta.valor;
			} else {
				saldo += conta.valor;
			}
		}
		
		System.out.println("O saldo é: " + saldo);
	}
	
}
