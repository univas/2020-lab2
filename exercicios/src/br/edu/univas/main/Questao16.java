package br.edu.univas.main;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite a quantidade de alunos:");
		int quantidadeAlunos = leitura.nextInt();
		
		System.out.println("Por favor, digite a quantidade de notas:");
		int quantidadeNotas = leitura.nextInt();
		
		int[][] notasPorAluno = new int[quantidadeAlunos][quantidadeNotas];
		readStudentData(notasPorAluno, leitura);
		
		int quantityApproved = calcApprovedStudents(notasPorAluno);
		
		System.out.println("Quantidade de alunos com nota maior que 74: " + quantityApproved);
		
		leitura.close();
	}
	
	public static void readStudentData(int[][] data, Scanner leitura) {
		int numberOfScore = data[0].length;
		
		for (int i = 0; i < data.length; i++) { //for por linha (aluno)
			System.out.println("Aluno " + (i + 1));
			
			for (int j = 0; j < numberOfScore; j++) { //for por coluna (notas)
				System.out.println("Digite a " + (j + 1) + "ª nota:");
				data[i][j] = leitura.nextInt();
			}
		}
	}

	public static int calcApprovedStudents(int[][] notasPorAluno) {
		int counter = 0;
		
		for (int i = 0; i < notasPorAluno.length; i++) {
			int sum = 0;
			for (int j = 0; j < notasPorAluno[i].length; j++) {
				sum += notasPorAluno[i][j];
			}
			
			if (sum > 74) {
				counter++;
			}
		}
		
		return counter;
	}
}
