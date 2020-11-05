package br.edu.univas.main;

import br.edu.univas.vo.Peca;

public class Questao19 {

	public static void main(String[] args) {	
		Peca[] vetor1 = new Peca[3];
		vetor1[0] = new Peca();
		vetor1[1] = new Peca();
		vetor1[2] = new Peca();
		
		Peca[] vetor2 = new Peca[3];
		vetor2[0] = new Peca();
		vetor2[1] = new Peca();
		vetor2[2] = new Peca();
		
		copiarVetor(vetor1, vetor2);
		
		
	}
	
	public static void copiarVetor(Peca[] destino, Peca[] origem) {
		for (int i = 0; i < destino.length; i++) {
			destino[i] = origem[i];
		}
	}
	
}
