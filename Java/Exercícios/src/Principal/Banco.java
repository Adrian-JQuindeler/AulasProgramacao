package Principal;

import java.util.Scanner;
import Entidades.ContaDeBanco;

public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CRIAR CONTA DE BANCO!");
		System.out.println("Para criar sua conta neste banco, primeiro digite:");
		
		System.out.printf("Seu nome:");
		String nome = sc.nextLine();
		
		System.out.printf("\nSeu código:");
		int codigo = sc.nextInt();
		
		System.out.printf("\nValor inicial [Opcional] :");
		Double valor = sc.nextDouble();
		
		ContaDeBanco conta = new ContaDeBanco(nome, codigo, valor);
		
		System.out.println(conta.toString());
		System.out.println("Deseja depositar?");
		String resposta = sc.next().toUpperCase();
		resposta.charAt(0);
		if (resposta.startsWith("S")) {
			System.out.printf("\nValor a ser depositado:");
			double valorDeDeposito = sc.nextDouble();
			conta.depositar(valorDeDeposito);
			System.out.println(conta.toString());
		}
		
		System.out.println("Deseja Retirar?");
		resposta = sc.next().toUpperCase();
		resposta.charAt(0);
		if (resposta.startsWith("S")) {
			System.out.printf("\nValor a ser retirado:");
			double valorDeRetirada = sc.nextDouble();
			if (valorDeRetirada > conta.getSaldo()) {
				System.out.println("O valor inserido é maior que o saldo disponível");
			}
			else {
			conta.retirar(valorDeRetirada);
			System.out.println(conta.toString());
			}
		}
		sc.close();
	}
}