package br.edu.univas.main;

import br.edu.univas.vo.Aluno;

public class StartApp {

	public static void main(String[] args) {
		System.out.println("Testando");
		
		String[] nomeAlunos = new String[10];
		int[] notaAlunos = new int[10];
		String[] celularAlunos = new String[10];
		
		nomeAlunos[0] = "Fabricio";
		notaAlunos[0] = 10;
		celularAlunos[0] = "99876-2341";
		
		int numero = 10;
		
		Aluno xuxa = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		//xuxa.nome = "Fabricio";
		//xuxa.nota = 10;
		//xuxa.celular = "99876-2341";
		
		Aluno[] listaAlunos = new Aluno[10];
//		listaAlunos[0] = xuxa;
//		listaAlunos[1] = aluno2;
//		listaAlunos[2] = aluno3;
		//a linha abaixo gera um erro! Pois a variavel "numero" não é 
		//do mesmo tipo que a variavel "listaAlunos"
		//listaAlunos[0] = numero;
		
		for (int i = 0; i < 10; i++) {
			Aluno aluno1 = new Aluno();
			aluno1.nome = "Aluno " + (i + 1);
			aluno1.nota = 10 + i;
			aluno1.celular = "99876-987" + i;
			listaAlunos[i] = aluno1;
		}
		
		listaAlunos[3].nome = "Rodrigo";
	}
	
}
