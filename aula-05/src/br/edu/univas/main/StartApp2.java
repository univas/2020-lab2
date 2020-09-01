package br.edu.univas.main;

public class StartApp2 {

	public static void main(String[] args) {
		String[] alunosAprovados = new String[5];
		
		alunosAprovados[0] = "João";
		alunosAprovados[1] = "José";
		alunosAprovados[2] = "Maria";
		alunosAprovados[3] = "Rodrigo";
		alunosAprovados[4] = "Roberto";
		
		imprimeNome(alunosAprovados, 0);
		
//		for (int i = 0; i < 5; i++) {
//			imprimeNome(alunosAprovados, i);	
//		}
		
//		imprimeNome(alunosAprovados, 0);
//		imprimeNome(alunosAprovados, 1);
//		imprimeNome(alunosAprovados, 2);
//		imprimeNome(alunosAprovados, 3);
//		imprimeNome(alunosAprovados, 4);
	}
	
	public static void imprimeNome(String[] alunos, int indice) {
		System.out.println(alunos[indice]);
		
		if (indice + 1 < alunos.length) {
			imprimeNome(alunos, ++indice);
		}
	}
	
}
