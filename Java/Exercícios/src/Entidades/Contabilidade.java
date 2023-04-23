package Entidades;

public class Contabilidade {
	
	public static double calcularImposto(double salario){
		double imposto;
		imposto = salario * 10 / 100;
		return imposto;
	}
	
	public static double calcularSalario(double salario, double imposto){
		double salarioLiquido = salario - imposto;
		return salarioLiquido;
	}
	public static double calcularAumenro(double salario, double aumento){
		double novoSalario, aux;
		aux = salario * aumento / 100;
		novoSalario = salario + aux;
		return novoSalario;
	}

}