package br.edu.univas.main;

import br.edu.univas.vo.Peca;

public class Questao21 {

	public static void main(String[] args) {
		Peca[] pecas = new Peca[5];
		
		for (int i = 0; i < 5; i++) {
			Peca peca = new Peca();
			peca.nome = "Peça " + (i + 1);
			pecas[i] = peca;
		}
		
		Peca pecaProcurada = new Peca();
		pecaProcurada.nome = "Peça 3";
		
		int indice = buscaPeca(pecas, pecaProcurada);
		if (indice == -1) {
			System.out.println("Peça não encontrada!");
		} else {
			System.out.println("Peça encontrada na posição: " + indice);
		}
	}
	
	
	public static int buscaPeca(Peca[] vetor, Peca procurado) {
		int indice = -1;
		
		for (int i = 0; i < vetor.length; i++) {
			Peca peca = vetor[i];
			
			if (peca.nome.equals(procurado.nome)) {
				indice = i;
				break;
			}
		}
		
		return indice;
	}

}
