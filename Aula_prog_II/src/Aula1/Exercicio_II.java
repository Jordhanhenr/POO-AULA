package Aula1;

import java.util.Scanner;

public class Exercicio_II {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("quantos anos você tem?");
		int numero = scanner.nextInt(); 
		// vereficar a idade, se for maior que 30 imprime "voce é velho"
		if (numero > 30) {
			System.out.println("Você é velho");
		}
		else if (numero < 15) {
			System.out.println("Você tem menos de 15 anos");
		}
		else {
			System.out.println("Você esta em idade intermediaria");
		}
		System.out.println("fim");
		
	 }
}
