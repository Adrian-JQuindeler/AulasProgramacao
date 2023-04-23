package PrincípiosJava;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lista {
	public static void main(String[] args) {
	List<String> lista = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	lista.add("Mariana");
	System.out.println("Qual o proximo nome a ser escrito?");
	lista.add(sc.nextLine());
	lista.add("Adrian");
	lista.add("Joaquina");
	lista.add("Ceuza");
	lista.add("Bob");
	lista.add(2, "Marcelo");
	
	System.out.println("Index de Bob: " + lista.indexOf("Bob"));
	System.out.println("Index de Bob: " + lista.indexOf("Maurício"));
	System.out.println("-------------------");

	for(String x : lista) {
		System.out.println(x);
	}
	lista.remove("Joaquina");
	lista.remove(1);
	System.out.println("-------------------");
	
	for(String x : lista) {
		System.out.println(x);
	}
	lista.removeIf(x -> x.charAt(0) == 'M');
	
System.out.println("-------------------");
	
	for(String x : lista) {
		System.out.println(x);
	}
	System.out.println("-------------------");
	List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
	for(String x : resultado) {
		System.out.println(x);
	}
	sc.close();
	}
}