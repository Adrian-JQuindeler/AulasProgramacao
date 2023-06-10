package PrincípiosJava;

import java.util.Scanner;

public class Enquanto{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = 0;
		int soma = 0;
		while (x != 0) {
			y += 1;
			soma += x;
			x = sc.nextInt();
		}
		System.out.printf("Você digitou %d números\n", y);
		System.out.printf("a soma de todos os números digitados é %d\n", soma);
		sc.close();
	}
}