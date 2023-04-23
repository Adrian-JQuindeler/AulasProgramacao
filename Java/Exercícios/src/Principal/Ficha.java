package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Entidades.Departamento;
import Entidades.Funcionario;
import Entidades.contrato;
import Entidades.nivel;

public class Ficha {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Departamento: ");
        String departamento = sc.nextLine();
        System.out.println("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.println("Level: ");
        String level = sc.nextLine();
        System.out.println("salario: ");
        Double salario = sc.nextDouble();
        Funcionario funcionario = new Funcionario(nome, nivel.valueOf(level), 
        salario, new Departamento(departamento));
        
        System.out.println("Digite o número de contratos: ");
        int contratos = sc.nextInt();
        for(int i=0; i<contratos; i++){
            System.out.printf("Informações do %d° contrato: \n",i+1);
            System.out.print("Data: ");
            Date dataContrato = fmt1.parse(sc.next());
            System.out.print("Valor por hora: ");
            Double valorHora = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int hora = sc.nextInt();
            contrato novoContrato = new contrato(dataContrato, valorHora, hora);
            funcionario.adicionarContratos(novoContrato);
            }
        System.out.println();
        System.out.println("Entre com mês e ano: ");
        String mesEano = sc.next();
        int mes = Integer.parseInt(mesEano.substring(0, 2));
        int ano = Integer.parseInt(mesEano.substring(3));
        System.out.println("|-----------------------------|");
        System.out.println("Nome: " + nome + ",");
        System.out.println("Departamento: " + funcionario.getDepartamento().getNome() + ",");
        System.out.println("Salário de " + mesEano + ":" + String.format("%.2f", funcionario.pagamento(ano, mes)));
        
        sc.close();
    }
}
