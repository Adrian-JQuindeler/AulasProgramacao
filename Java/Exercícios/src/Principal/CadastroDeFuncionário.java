package Principal;

import java.util.Scanner;
import Entidades.Contabilidade;

public class CadastroDeFuncionário {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados do funcionário: ");
		System.out.printf("Nome: ");
		String nome = sc.nextLine();
		System.out.printf("Salário: ");
		double salario = sc.nextDouble();
		double imposto = Contabilidade.calcularImposto(salario);
		
		double salarioLiquido = Contabilidade.calcularSalario(salario, imposto);
		
		System.out.println("\nFuncionário 1:");
		System.out.printf("Nome - %s, Salário liquido: R$ %.2f ", nome, salarioLiquido);
		System.out.printf("\nQual a porcentagem de aumento do salário? ");
		int aumento = sc.nextInt();
		double novoSalario = Contabilidade.calcularAumenro(salario, aumento);
		System.out.printf("\nO salário do funcionário agora é: %.2f", novoSalario);
		
		imposto = Contabilidade.calcularImposto(novoSalario);
		salarioLiquido = Contabilidade.calcularSalario(novoSalario, imposto);
		
		System.out.println("\nFuncionário 1 (atualisado):");
		System.out.printf("Nome - %s, Salário liquido: R$ %.2f ", nome, salarioLiquido);
		
		
		sc.close();
	}

}