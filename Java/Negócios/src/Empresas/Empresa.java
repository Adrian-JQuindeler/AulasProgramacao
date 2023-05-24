package Empresas;

import java.util.Scanner;

import RelacionadosAsEmpresas.Produtos;

public class Empresa {

	public static void main(String[] args) {
		Scanner omega = new Scanner(System.in);
		
		System.out.println("Adicione as características do produto: ");
		System.out.println("Nome: ");
		String nome = omega.nextLine();
		System.out.println("Preço: ");
		double preço = omega.nextDouble();
		int quantidade;
		
		Produtos produto = new Produtos(nome, preço);
		
		System.out.println("Dados do produto: "+ produto);
		System.out.printf("Quantas unidades serão adicionadas ao estoque? ");
		quantidade = omega.nextInt();
		produto.adicionarProdutos(quantidade);
		System.out.println("Dados do produto: "+ produto);
		System.out.println("");
		System.out.printf("Quantas unidades serão removidas do estoque? ");
		quantidade = omega.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println("Dados do produto: "+ produto);
		
		System.out.println("Novo nome: ");
		omega.nextLine();
		nome = omega.nextLine();
		System.out.println("Novo Preço: ");
		preço = omega.nextDouble();
		produto.setNome(nome);
		produto.setPreço(preço);
		
		System.out.println("Dados do produto: "+ produto);
		System.out.printf("Quantas unidades serão adicionadas ao estoque? ");
		quantidade = omega.nextInt();
		produto.adicionarProdutos(quantidade);
		System.out.println("Dados do produto: "+ produto);
		System.out.println("");
		System.out.printf("Quantas unidades serão removidas do estoque? ");
		quantidade = omega.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println("Dados do produto: "+ produto);
		omega.close();
	}
}