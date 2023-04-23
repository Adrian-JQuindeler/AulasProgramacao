package PrincípiosJava;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataEHora {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		System.out.println("D01 = "+d01);
		System.out.println("D02 = "+d02);
		System.out.println("D03 = "+d03);
		
		System.out.println("--------------------------------------------------");
		
		LocalDate d04 = LocalDate.parse("2023-04-09");
		LocalDateTime d05 = LocalDateTime.parse("2023-04-09T20:30:26");
		Instant d06 = Instant.parse("2023-04-09T01:30:26z");
		Instant d07 = Instant.parse("2023-04-09T20:30:26-03:00");
		
		System.out.println("D04 = "+d04);
		System.out.println("D05 = "+d05);
		System.out.println("D06 = "+d06);
		System.out.println("D07 = "+d07);
		
		System.out.println("--------------------------------------------------");
		
		LocalDate d08 = LocalDate.parse("11/09/2001", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("11/09/2001 20:03", fmt2);
		LocalDate d10 = LocalDate.of(2023, 04, 9);
		LocalDateTime d11 = LocalDateTime.of(2023, 04, 9, 15, 25);
				
		System.out.println("D08 = "+d08);
		System.out.println("D09 = "+d09);
		System.out.println("D10 = "+d10);
		System.out.println("D11 = "+d11);
		
		System.out.println("D04 = "+d04.format(fmt1));
		System.out.println("D04 = "+fmt1.format(d04));
		System.out.println("D04 = "+d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("D05 = "+d05.format(fmt2));
		System.out.println("D05 = "+d05.format(fmt4));
		System.out.println("D06 = "+fmt3.format(d06));
		
		System.out.println("--------------------------------------------------");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("R1 = " + r1);
		System.out.println("R2 = " + r2);
		System.out.println("R3 = " + r3);
		System.out.println("R4 = " + r4);
		
		System.out.println("D04 Dia = " + d04.getDayOfMonth());
		System.out.println("D04 Mês = " + d04.getMonthValue());
		System.out.println("D04 Ano = " + d04.getYear());
		System.out.println("D05 Hora = " + d05.getHour());
		
		System.out.println("--------------------------------------------------");
		
		LocalDate semanaPassada = d04.minusDays(7);
		LocalDate semanaQueVem = d04.plusDays(7);
		
		Instant semanaPasada2 = d06.minus(7, ChronoUnit.DAYS);
		Instant semanaQueVem2 = d06.plus(7, ChronoUnit.DAYS);
		
		Duration diferenca = Duration.between(semanaPasada2, d06);
		Duration diferenca1 = Duration.between(d06, semanaQueVem2);
		
		System.out.println("semanaPassada = " + semanaPassada.format(fmt1));
		System.out.println("semanaQueVem = " + semanaQueVem.format(fmt1));
		System.out.println("semanaPasada2 = " + semanaPasada2);
		System.out.println("semanaQueVem2 = " + semanaQueVem2);
		System.out.println("diferenca = " + diferenca.toDays());
		System.out.println("diferenca1 = " + diferenca1.toDays());
	}

}
