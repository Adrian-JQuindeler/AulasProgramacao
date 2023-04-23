package Principal;

import java.util.Locale;

public class Cadastro {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Office desk";
		
		String nome = "Michael";
		int idade = 30;
		int codigo = 4169;
		String genero = "M";
		
		double preço1 = 2100.00;
		double preço2 = 650.50;
		double medida = 53.234567;
		
		System.out.printf("PRODUTOS:\n%s por apenas %.2f\n"
				+ "%s por apenas %.2f\n\n", produto1, preço1, produto2, preço2);
		System.out.printf("Funcionário: %s, %d anos de idade, "
				+ "código %d e gênero: %s\n\n", nome, idade, codigo, genero);
		System.out.printf("Medida com oito casas decimais: %f\n", medida);
		System.out.printf("Arredondado para 3 casas decimais: %.3f\n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Medida com separação americana: %f\n", medida);
	}
}