package RelacionadosAsEmpresas;

public class Produtos{
	private String nome;
	private double preço;
	private int quantidade;
	
	public Produtos() {}
	public Produtos(String nome, double preço, int quantidade) {
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
	}
	public Produtos(String nome, double preço) {
		this.nome = nome;
		this.preço = preço;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double valorTotalEmEstoque() {
		return preço * quantidade;
	}
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome
			+ ", R$ "
			+ String.format("%.2f", preço)
			+ ", "
			+ quantidade
			+ " Unidades, "
			+ "Total: R$ "
			+ valorTotalEmEstoque();
	}
}