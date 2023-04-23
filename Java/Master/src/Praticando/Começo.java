package Praticando;

import java.util.Scanner;

public class Começo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========");
		System.out.println("PARTE 1");
		System.out.println("");
		System.out.println("Olá, Mundo");
		System.out.println("Bom dia");
		System.out.println("==========");
		
		System.out.println("==================================================");
		System.out.println("PARTE 2");
		System.out.println("");
		String nome;
		System.out.printf("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.printf("Olá, %s. Seja bem vindo(a)!\nQual sua idade? ", nome);
		int idade;
		idade = sc.nextInt();
		System.out.printf("Então você é %s, de %d anos. Prazer em te conhecer!!!\n\n", nome, idade);
		System.out.println("==================================================");
		
		

		System.out.println("==================================================");
		System.out.println("PARTE 3.1");
		System.out.println("");
		System.out.printf("Digite um número [0 para parar]: ");
		int numero = sc.nextInt();
		int d = 0;
		int soma = 0;
		while (numero != 0){
			d += 1;
			soma += numero;
			System.out.printf("Digite um número [0 para parar]: ");
			numero = sc.nextInt();}
		System.out.printf("Você digitou %d números \n", d);
		System.out.printf("a soma de todos os números digitados é %d\n", soma);
		System.out.println("==================================================");

		System.out.println("==================================================");
		System.out.println("PARTE 3.2");
		System.out.println("");
		System.out.printf("Quantos valores quer digitar? ");
		int n = sc.nextInt();
		int soma1 = 0;

		for (int i=0; i<n; i++) {
			System.out.printf("Digite o %d valor: ",i+1);
			int x = sc.nextInt();
			soma1 += x;
			}
		System.out.printf("A soma dos valores é %d\n", soma1);
		System.out.println("==================================================");
		System.out.println("\nVolte Sempre!\n");
		sc.close();
	}
}