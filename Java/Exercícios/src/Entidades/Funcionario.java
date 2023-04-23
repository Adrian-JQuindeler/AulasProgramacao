package Entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
    private String nome;
    private  nivel level;
    private Double salario;
    private Departamento departamento;

    private List<contrato> contratos = new ArrayList<>();

    public Funcionario(String nome, nivel level, Double salario, Departamento departamento){
        this.nome = nome;
        this.level = nivel.intermediário;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public nivel getLevel() {
        return level;
    }

    public void setLevel(nivel level) {
        this.level = level;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void adicionarContratos(contrato novoContrato){
        contratos.add(novoContrato);
    }
    public void removerContratos(contrato contratoExpirado){
        contratos.remove(contratoExpirado);
    }
    public List<contrato> getContratos() {
        return contratos;
    }
    public Double pagamento(int ano, int mes){
        Double soma = salario;
        Calendar call = Calendar.getInstance();
        for(contrato c : contratos){
            call.setTime(c.getData());
            int c_ano = call.get(Calendar.YEAR);
            int c_mes = 1 + call.get(Calendar.MONTH);;
            if(ano == c_ano && mes == c_mes){
                soma += c.valortotal();
            }
        }
        return soma;
    }
}