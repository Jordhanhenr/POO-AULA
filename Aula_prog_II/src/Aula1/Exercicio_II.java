package Aula1;

import java.util.Scanner;

public class Exercicio_II {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("quantos anos voc� tem?");
		int numero = scanner.nextInt(); 
		// vereficar a idade, se for maior que 30 imprime "voce � velho"
		if (numero > 30) {
			System.out.println("Voc� � velho");
		}
		else if (numero < 15) {
			System.out.println("Voc� tem menos de 15 anos");
		}
		else {
			System.out.println("Voc� esta em idade intermediaria");
		}
		System.out.println("fim");
		
	 }
}
