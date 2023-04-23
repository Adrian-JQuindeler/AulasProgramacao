package Praticando;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Digite a quantidade de linhas: ");
		int n = scan.nextInt();
		System.out.printf("Digite a quantidade de colunas: ");
		int m = scan.nextInt();
		int[][] mat = new int[n][m];
		System.out.println("");
		
		for(int l = 0; l < n; l++) {
			for(int c = 0; c < m; c++) {
				System.out.printf("Digite um número para aposição [%d, %d] ", l, c);
				mat[l][c] = scan.nextInt();
				System.out.println("");
			}
		}
		
		System.out.println("Matriz: ");
		for(int l = 0; l < n; l++) {
			for(int c = 0; c<m; c++) {
				System.out.printf("[ %d ] ",mat[l][c]);
			}
			System.out.println("");
		}

		System.out.printf("Digite qual numero deseja conferir: ");
		int num = scan.nextInt();
		for(int l = 0; l < n; l++){
			for(int c = 0; c<m; c++){
				if(mat[l][c] == num){
					System.out.println("O número escolhido é '"+mat[l][c]+"' e está na poção: "+l+","+c);
					if(l != 0) {
						System.out.println("Acima: "+mat[l-1][c]);
					}
					if(c != 0) {
						System.out.println("Esquerda: "+mat[l][c-1]);
					}
					if(c != m-1) {
						System.out.println("Direita: "+mat[l][c+1]);
					}
					if(l != n-1) {
						System.out.println("Abaixo: "+mat[l+1][c]);
					}
				}
			}
		}
		
		scan.close();
	}
}