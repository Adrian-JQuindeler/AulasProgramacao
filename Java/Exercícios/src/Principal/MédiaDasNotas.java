package Principal;

import java.util.Scanner;
import Entidades.Calculadora;

public class MédiaDasNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite a primeira nota: ");
		double nota1 = sc.nextInt();
		System.out.printf("\nDigite a segunda nota: ");
		double nota2 = sc.nextInt();
		System.out.printf("\nDigite a terceira nota: ");
		double nota3 = sc.nextInt();
		double media = Calculadora.calculoMedia(nota1, nota2, nota3);
		System.out.printf("\nA média do aluno é: %.2f", media);
		if (media > 6) {
			System.out.println("\nO aluno passou de ano");
		}
		else{
			System.out.println("\nO aluno não atingiu a nota");
			double falta = 6 - media;
			System.out.printf("Faltam %.2f pontos para atingir a média.", falta);
		}
		sc.close();
	}

}