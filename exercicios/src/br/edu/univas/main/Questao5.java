package br.edu.univas.main;

public class Questao5 {

	public static void main(String[] args) {
		calculaDiaSeguinte(31, 07, 2020);
		calculaDiaSeguinte(1, 07, 2020);
		calculaDiaSeguinte(27, 02, 2020);
		calculaDiaSeguinte(31, 12, 2020);
		calculaDiaSeguinte(30, 06, 2020);
		calculaDiaSeguinte(17, 8, 2020);
		calculaDiaSeguinte(29, 02, 2016);
		calculaDiaSeguinte(29, 9, 1995);
		calculaDiaSeguinte(29, 02, 2007);
		calculaDiaSeguinte(31, 01, 2020);
		calculaDiaSeguinte(29, 02, 2020);
		calculaDiaSeguinte(31, 03, 2020);
		calculaDiaSeguinte(30, 04, 2020);
		calculaDiaSeguinte(31, 05, 2020);
		calculaDiaSeguinte(30, 06, 2020);
		calculaDiaSeguinte(31, 07, 2020);
		calculaDiaSeguinte(31, 8, 2020);
		calculaDiaSeguinte(30, 9, 2020);
		calculaDiaSeguinte(31, 10, 2020);
		calculaDiaSeguinte(30, 11, 2020);
		calculaDiaSeguinte(31, 12, 2020);
		
	}
	
	/**
	 * Execute the calc about the next day
	 * @param dia interger that represents a day
	 * @param mes interger that represents a month
	 * @param ano integer that represents a year 
	 * @return String the next day in the format: dd/MM/YYYY
	 */
	public static String calculaDiaSeguinte(int dia, int mes, int ano) {
		dia++;
		
		boolean mesDe31Dias = mesTem31Dias(mes);
		boolean mesDe30Dias = mesTem30Dias(mes);
		
		if (mesDe31Dias && dia == 32) {
			dia = 1;
			mes++;
			if (mes == 13) {
				mes = 1;
				ano++;
			}
			
		} else if (mesDe30Dias && dia == 31) {
			dia = 1;
			mes++;
			
		} else {
			boolean isAnoBissexto = verificaAnoBissexto(ano);
			if ((dia == 29 && !isAnoBissexto) || dia == 30) {
				dia = 1;
				mes++;
			}
		}
		
		String result = dia + "/" + mes + "/" + ano;
		System.out.println(result);
		return result;
	}
	
	public static boolean verificaAnoBissexto(int ano) {
		if ((ano % 4 == 0 && ano % 100 != 0) 
				|| ano % 400 == 0) {
			return true;
		}
		
		return false;
	}
	
	public static boolean mesTem31Dias(int mes) {
		return mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
				mes == 8 || mes == 10 || mes == 12;
	}
	
	public static boolean mesTem30Dias(int mes) {
		return mes == 4 || mes == 6 || mes == 9 || mes == 11;
	}
	
}
