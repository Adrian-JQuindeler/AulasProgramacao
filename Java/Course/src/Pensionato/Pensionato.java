package Pensionato;

import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		Scanner alpha = new Scanner(System.in);
		System.out.println("PENSIONATO");
		System.out.printf("\nQuantas pessoas entrarão?");
		int numero = alpha.nextInt();
		
		String nome;
		String email;
		Aluguel[] informacoes = new Aluguel[10];
		
		for(int i=0; i<numero; i++) {
			alpha.nextLine();
			System.out.printf("\nQual seu nome?");
			nome = alpha.nextLine();
			System.out.printf("\nQual seu email?");
			email = alpha.nextLine();
			System.out.printf("\nDigeite o quarto que deseja ficar[0/9]");
			int quarto = alpha.nextInt();
			informacoes[quarto] = new Aluguel(nome, email);
		}
		
		System.out.println("\nQuartos cheios:");
		for(int i=0; i<10; i++) {
			if(informacoes[i] != null) {
				System.out.println(i + ": " + informacoes[i]);
			}
		}
		alpha.close();
	}
}
