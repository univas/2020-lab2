package br.edu.univas.main;

import br.edu.univas.vo.Peca;

public class Questao20 {

	public static void main(String[] args) {	
		Peca peca1 = new Peca();
		peca1.nome = "Peça 1";
		
		Peca peca2 = new Peca();
		peca2.nome = "Peça 2";
		
		Peca peca3 = new Peca();
		peca3.nome = "Peça 3";
		
		Peca[] vetor1 = new Peca[6];
		vetor1[0] = peca1;
		vetor1[1] = peca2;
		vetor1[2] = peca3;
		
		Peca peca4 = new Peca();
		peca4.nome = "Peça 4";
		
		Peca peca5 = new Peca();
		peca5.nome = "Peça 5";
		
		Peca peca6 = new Peca();
		peca6.nome = "Peça 6";
		
		Peca[] vetor2 = new Peca[3];
		vetor2[0] = peca4;
		vetor2[1] = peca5;
		vetor2[2] = peca6;
		
		
		System.out.println("\nANTES::\n");
		imprimeVetor(vetor1);
		System.out.println("\n\n");
		imprimeVetor(vetor2);
		
		
		concatenar(vetor1, vetor2);
		
		
		System.out.println("\nDEPOIS::\n");
		imprimeVetor(vetor1);
		System.out.println("\n\n");
		imprimeVetor(vetor2);
	}
	
	public static void concatenar(Peca[] destino, Peca[] origem) {
		for (int i = 0; i < origem.length; i++) {
			destino[i + 3] = origem[i];
		}
	}
	
	
	public static void imprimeVetor(Peca[] pecas) {
		for (int i = 0; i < pecas.length; i++) {
			if (pecas[i] != null) {
				System.out.println(pecas[i].nome);
			}
		}
	}
	
}
