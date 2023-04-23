package Empresas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import RelacionadosAsEmpresas.Funcionário;

public class aumentoSalário {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionário> empregados = new ArrayList<>();
        System.out.println("Quantos empregados serão registrados?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Empregado " + (i+1) + ": ");
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            double salario = sc.nextDouble();
            
            Funcionário empregado = new Funcionário(id, nome, salario);
            empregados.add(empregado);
        }
        
        System.out.println("Qual o Id do funcionário que terá aumento no salário? ");
        int numero = sc.nextInt();
        Integer pos = posicao(empregados, numero);
        if(pos == null) {
        	System.out.println("Esse Id não existe!");
        }
        else {
        	System.out.println("Qual a porcentagem de almento? ");
        	int porcento = sc.nextInt();
        	empregados.get(pos);
            empregados.get(pos).setSalario(Funcionário.calcularAumento(empregados.get(pos).getSalario(), porcento));
        }
        for (int i = 0; i < n; i++) {
        System.out.println("Nome: " + empregados.get(i).getNome() + ", Id: " + empregados.get(i).getId() + ", Salário: " + empregados.get(i).getSalario());
        }
        sc.close();
     }
    public static Integer posicao(List<Funcionário> lista, int id) {
   	 for(int i = 0; i < lista.size(); i++) {
   		 if(lista.get(i).getId() == id) {
   			 return i;
   		 }
   	 }
   	 return null;
    }
}

