package Principal;

import java.util.Scanner;

public class Menor {

	public static void main(String[] args) {
		/*Commenter*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite três números");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int menor = lower(a, b, c);
		
		mostrarResultado(menor);
		sc.close();
	}
	public static int lower(int x, int y, int z) {
		int aux;
		if (x == y && x == z) {
			aux = 0;
		}
		else if (x < y && x < z) {
			aux = x;
		}
		else if (y < z) {
			aux = y;
		}
		else{
			aux = z;
		}
		return aux;
	}
	public static void mostrarResultado(int x) {
		if (x == 0) {
			System.out.println("========================================");
			System.out.printf("Os valores são todos iguais\n");
			System.out.println("========================================");
		}
		else {
			System.out.println("========================================");
			System.out.printf("O menor valor dentre os digitados é: %d\n", x);
			System.out.println("========================================");
		}
	}
}