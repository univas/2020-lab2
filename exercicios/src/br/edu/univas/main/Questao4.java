package br.edu.univas.main;

public class Questao4 {

	public static void main(String[] args) {
		int resultado = verificaAnoBissexto(2020);
		System.out.println(resultado);
	}
	
	public static int verificaAnoBissexto(int ano) {
		//if for ano bissexto retorna 1
		//caso contrario retorna 0
		if ((ano % 4 == 0 && ano % 100 != 0) 
				|| ano % 400 == 0) {
			return 1;
		}
		
		return 0;
	}
	
}
