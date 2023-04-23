package Praticando;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maior = 0;
		System.out.println("Digite 3 numeros");
		for (int i=0; i<3; i++) {
			int a = sc.nextInt();
			if (a > maior) {
				maior = a;
			}
		}
		System.out.println("O maior número digitado foi: "+maior);
		sc.close();
	}
}