package RelacionadosAsEmpresas;

public class Funcionário {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionário(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public static double calcularAumento(double salario, double aumento){
		salario = salario + (salario * aumento / 100);
		return salario;
	}
}