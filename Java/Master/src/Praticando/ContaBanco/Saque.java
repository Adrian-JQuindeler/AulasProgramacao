package Praticando.ContaBanco;

import java.util.Scanner;

public class Saque {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite as informações da conta: ");

            System.out.print("número: ");
            int number = sc.nextInt();
            System.out.println("");

            System.out.print("Titular: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.println("");
            
            System.out.print("Saldo: ");
            double balance = sc.nextDouble();
            System.out.println("");

            System.out.print("limite: ");
            double limit = sc.nextDouble();
            System.out.println("");

            PersonalAccount acc = new PersonalAccount(number, holder, balance, limit);

            System.out.print("Quanto deseja retirar? ");
            double amount = sc.nextDouble();
            System.out.println("");
            
            acc.withDraw2(amount);
            System.out.println(amount + " Retirado com sucesso ");
            System.out.println("Sua conta está com: " + acc.getBalance());
            sc.close();
            }
        
        catch(AccExceptions e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
