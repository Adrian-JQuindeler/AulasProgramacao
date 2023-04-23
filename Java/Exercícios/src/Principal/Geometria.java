package Principal;

import java.util.Scanner;

import Entidades.Calculadora;

public class Geometria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int B, b, h;
		System.out.println("==================================================");
		System.out.println("PARTE 1: Trapésio\n");

		System.out.printf("Digite o valor da base maior");
		B = sc.nextInt();
		System.out.printf("\nDigite o valor da base menor");
		b = sc.nextInt();
		System.out.printf("\nDigite o valor da altura");
		h = sc.nextInt();
		
		
		System.out.printf("O 'B' vale: %d \n", B);
		System.out.printf("O 'b' vale: %d \n", b);
		System.out.printf("A Altura vale: %d \n", h);
		System.out.printf("A Area vale: %.1f \n", Calculadora.areaTrapesio(B, b, h));
		System.out.println("==================================================\n");
		
		System.out.println("==================================================");
		System.out.println("PARTE 2: Retângulo\n");
		System.out.printf("Digite o valor da base");
		b = sc.nextInt();
		System.out.printf("\nDigite o valor da altura");
		h = sc.nextInt();
		System.out.printf("A base vale: %d \n", b);
		System.out.printf("A Altura vale: %d \n", h);
		System.out.printf("A Area vale: %.1f \n", Calculadora.areaRetangulo(b, h));
		System.out.printf("O oerímetro vale: %.1f \n", Calculadora.perimetroRetangulo(b, h));
		System.out.println("==================================================\n");
		h = sc.nextInt();
		sc.close();
	}
}