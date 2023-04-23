package Principal;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========");
		System.out.println("PARTE 1");
		System.out.printf("SEPARANDO NÚMEROS POSITIVOS E NEGATIVOS\n");
		System.out.printf("Quantos números serão digitados?");
		int n = sc.nextInt();
		System.out.println("");
		int[] numeros = new int[n];
		for(int i=0; i < n; i++) {
			System.out.printf("\nDigite o %d número: ", i+1);
				numeros[i] = sc.nextInt();
		}
		System.out.printf("\nNúmeros negativos digitados: ");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		System.out.printf("\nNúmeros positivos digitados: ");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > 0) {
				System.out.println(numeros[i]);
			}
		}
		System.out.println("==========");
		
		System.out.println("==================================================");
		System.out.println("PARTE 2");
		System.out.printf("SOMANDO E CALCULANDO A MÉDIA\n");
		System.out.printf("Quantos números serão digitados?");
		int x = sc.nextInt();
		System.out.println("");
		int[] SomaEMedia = new int[x];
		for(int i = 0; i < SomaEMedia.length; i++) {
			System.out.printf("\nDigite o %d número: ", i+1);
			SomaEMedia[i] = sc.nextInt();;
		}
		int soma = 0;
		int media = 0;
		System.out.printf("\nValores Digitados:");
		for(int i = 0; i < SomaEMedia.length; i++) {
			System.out.printf("%d ", SomaEMedia[i]);
			soma += SomaEMedia[i];
		}
		media = soma / x;
		System.out.printf("\nSoma dos valores: %d", soma);
		System.out.printf("\nmedia dos valores: %d", media);
		System.out.println("\n==================================================");
		
		System.out.println("==================================================");
		System.out.println("PARTE 3");
		System.out.printf("NÚMEROS PARES\n");
		System.out.printf("Quantos números serão digitados?");
		int y = sc.nextInt();
		System.out.println("");
		int[] numerosPares = new int[y];
		for(int i=0; i < numerosPares.length; i++) {
			System.out.printf("\nDigite o %d número: ", i+1);
			int numero = sc.nextInt();
			if (numero % 2 == 0) {
				numerosPares[i] = numero;
				}
			}
		System.out.printf("\nNúmeros pares digitados: ");
		for(int i = 0; i < numerosPares.length; i++) {
			if(numerosPares[i] != 0) {
				System.out.printf("%d ", numerosPares[i]);
				}
			}
		System.out.println("\n==================================================");
		sc.close();
	}
}
