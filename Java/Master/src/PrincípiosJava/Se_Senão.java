package PrincípiosJava;

import java.util.Locale;
import java.util.Scanner;

public class Se_Senão {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		if (area >= 500) {
			System.out.printf("A área será bem grande:\n");
			System.out.printf("AREA = %.2f%n", area,"M2");
			System.out.printf("Infelizmente o preço também:\n");
			System.out.printf("PRECO = R$ %.2f%n", preco);
		}
		else {
			System.out.printf("A área será pequena:\n");
			System.out.printf("AREA = %.2f%n", area,"M2");
			System.out.printf("Mas o preço é bem baratinho:\n");
			System.out.printf("PRECO = R$ %.2f%n", preco);
		}
		sc.close();
	}
}