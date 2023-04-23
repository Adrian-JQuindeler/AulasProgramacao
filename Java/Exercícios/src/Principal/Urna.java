package Principal;

import java.util.Scanner;

public class Urna {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int votosThomas = 0;
    int votosJacinto = 0;
    int votosMia = 0;
    int votosChu = 0;
    int horario = 0;
    
    while (true) {
        System.out.printf("\n\nQual o horario?");
        horario = sc.nextInt();
        if (horario > 18){
            break;
            }
        System.out.println("\n\n---------------");
        System.out.println("URNA ELETRÔNICA");
        System.out.println("---------------\n");
        System.out.println("Candidatos: \n[13] Thomas Turbando \n[22] Jacinto Pinto Aquino Rego \n[44] Mia Regaça \n[12] Chu Passeios");
        System.out.printf("Seu voto: ");
        int resposta = sc.nextInt();
            if (resposta == 13){
                System.out.println("Confirmar voto para 'Thomas Turbando?' [S/N]");
                String confirmar = sc.next().toUpperCase();
                confirmar.charAt(0);
                if (confirmar.startsWith("S")){
                    System.out.println("\n--------------------------------------");
                    System.out.println("Voto confirmado para 'Thomas Turbando'");
                    System.out.println("--------------------------------------");
                    votosThomas += 1;
                }
                else{
                    System.out.println("Voto cancelado");
                    }
                }
            else if (resposta == 22){
                    System.out.println("Confirmar voto para 'Jacinto Pinto?' [S/N]");
                    String confirmar = sc.next().toUpperCase();
                    confirmar.charAt(0);
                    if (confirmar.startsWith("S")){
                        System.out.println("\n------------------------------------");
                        System.out.println("Voto confirmado para 'Jacinto Pinto'");
                        System.out.println("------------------------------------");
                        votosJacinto += 1;
                    }
                    else{
                        System.out.println("Voto cancelado");
                    }
                }
            else if (resposta == 44){
                    System.out.println("Confirmar voto para 'Mia Regaça?' [S/N]");
                    String confirmar = sc.next().toUpperCase();
                    confirmar.charAt(0);
                    if (confirmar.startsWith("S")){
                        System.out.println("\n---------------------------------");
                        System.out.println("Voto confirmado para 'Mia Regaça'");
                        System.out.println("---------------------------------");
                        votosMia += 1;
                    }
                    else{
                        System.out.println("Voto cancelado");
                    }
                }
            else if (resposta == 12){
                    System.out.println("Confirmar voto para 'Chu Passeios?' [S/N]");
                    String confirmar = sc.next().toUpperCase();
                    confirmar.charAt(0);
                    if (confirmar.startsWith("S")){
                        System.out.println("\n-----------------------------------");
                        System.out.println("Voto confirmado para 'Chu passeios'");
                        System.out.println("-----------------------------------");
                        votosChu += 1;
                    }
                    else{
                        System.out.println("Voto cancelado");
                    }
                }
            else{
                System.out.println("\n-------------");
                System.out.println("Voto Inválido");
                System.out.println("-------------");
                }
            }
    System.out.println("\n-----------");
    System.out.println("RESULTADOS: ");
    System.out.println("-----------");
    System.out.println("Thomas Turbando = " + votosThomas);
    System.out.println("Jacinto Pinto Aquino Rego = " + votosJacinto);
    System.out.println("Mia Regaça = " + votosMia);
    System.out.println("Chu Passeios = " + votosChu);
    sc.close();
    }
}