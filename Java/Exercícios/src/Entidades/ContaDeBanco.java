package Entidades;

public class ContaDeBanco {
	public String nome;
	private int numero;
	public Double valorInicial;
	private double saldo;
	
	public ContaDeBanco(String nome, int numero, Double valorInicial) {
		this.nome = nome;
		this.numero = numero;
		this.valorInicial = valorInicial;
		saldo = valorInicial;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public double depositar (double valor){
		saldo += valor;
		return saldo;
	}
	public double retirar (double valor){
		saldo -= valor;
		return saldo;
	}
	public String toString() {
		return "Nome: "
			+ nome
			+ ", Código: "
			+ getNumero()
			+ ", Saldo: "
			+ getSaldo();
	}
}