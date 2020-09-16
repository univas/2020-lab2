package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite uma palavra:");
		String palavra = leitura.nextLine();
		
		boolean palindrome = isPalindrome(palavra);
		
		if (palindrome) {
			System.out.println("A palavra é um palindrome!");
		} else {
			System.out.println("A palavra não é um palindrome!");
		}
		
		leitura.close();
	}
	
	public static boolean isPalindrome(String palavra) {
		if (palavra.length() == 0 && palavra.length() == 1) {
			return true;
		}
		
		if (palavra.charAt(0) == palavra.charAt(palavra.length() - 1)) {
			return isPalindrome(palavra.substring(1, palavra.length() - 1));
		}

		return false;
	}
}
