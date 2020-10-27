package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Cliente;
import br.edu.univas.vo.Endereco;
import br.edu.univas.vo.Fornecedor;

public class StartApp {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		
		System.out.println("Cadastro do cliente:::");
		System.out.println("Digite o nome:");
		cliente.nome = leitura.nextLine();
		
		System.out.println("Digite o e-mail:");
		cliente.email = leitura.nextLine();
		
		System.out.println("Digite o nome da rua:");
		cliente.endereco.rua = leitura.nextLine();
		
		System.out.println("Digite o número da casa:");
		cliente.endereco.numero = leitura.nextInt();
		leitura.nextLine();
		
		System.out.println("Digite o bairro:");
		cliente.endereco.bairro = leitura.nextLine();
		
		System.out.println("Digite o cep:");
		cliente.endereco.cep = leitura.nextLine();
		
		System.out.println("Cadastro do fornecedor:::");
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.endereco = new Endereco();
		
		System.out.println("Digite a razão social:");
		fornecedor.razaoSocial = leitura.nextLine();
		
		System.out.println("Digite o e-mail:");
		fornecedor.email = leitura.nextLine();
		
		System.out.println("Digite o nome da rua:");
		fornecedor.endereco.rua = leitura.nextLine();
		
		System.out.println("Digite o número da casa:");
		fornecedor.endereco.numero = leitura.nextInt();
		leitura.nextLine();
		
		System.out.println("Digite o bairro:");
		fornecedor.endereco.bairro = leitura.nextLine();
		
		System.out.println("Digite o cep:");
		fornecedor.endereco.cep = leitura.nextLine();
		
		Fornecedor fornecedor2 = new Fornecedor();
		fornecedor2.endereco = new Endereco();
		
		leitura.close();
	}
}
