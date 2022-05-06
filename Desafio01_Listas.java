package desafios.dio.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Desafio01_Listas {

	/*
	 * Proposta 01 - 
	 * 
	 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
	 * e armazene-as em uma lista.
	 * 
	 * Após isto, calcule a média semestral das temperaturas e mostre todas as
	 * temperaturas acima desta média, e em que mês elas ocorreram (mostrar o mês
	 * por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		
		
		System.out.println("Infome as 6 temperaturas: ");
		
		
		List<Double> temps = new ArrayList<>();
		temps.add(Double.parseDouble(sc.nextLine()));
		temps.add(Double.parseDouble(sc.nextLine()));
		temps.add(Double.parseDouble(sc.nextLine()));
		temps.add(Double.parseDouble(sc.nextLine()));
		temps.add(Double.parseDouble(sc.nextLine()));
		temps.add(Double.parseDouble(sc.nextLine()));
//		temps.add(30.2);
//		temps.add(29.4);
//		temps.add(28.4);
//		temps.add(28.9);
//		temps.add(28.4);
//		temps.add(27.5);
		
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
		
		System.out.println();
		Double soma = 0d;
		for (int i = 0; i < 6; i++) {
			System.out.println(meses[i] + ": " + temps.get(i));
			soma += temps.get(i);
		}
		
		
		System.out.println();
		System.out.println("A média das temperaturas: " + soma / temps.size());
		 
		sc.close();

	}

}
