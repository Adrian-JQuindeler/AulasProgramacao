package PrincípiosJava;

import java.util.Scanner;

public class Enquanto{

	public static void main(String[] args) {
		/*Pi é uma letra grega*/
		Scanner Pi = new Scanner(System.in);
		
		int x = Pi.nextInt();
		int y = 0;
		int soma = 0;
		while (x != 0) {
			y += 1;
			soma += x;
			x = Pi.nextInt();
		}
		System.out.printf("Você digitou %d números\n", y);
		System.out.printf("a soma de todos os números digitados é %d\n", soma);
		Pi.close();
	}
}