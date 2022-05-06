package desafios.dio.repeticoes;

import java.util.Locale;
import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);  
		Scanner sc = new Scanner(System.in);

		double[] notas = new double[5];
		double maiorNota = 0;
		double menorNota = 11;
		double soma = 0;
		double media;

		System.out.println("Digte as 5 notas: ");
		System.out.println();
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("Digite a " + (i + 1) + "ª nota:");
			notas[i] = sc.nextDouble();
			
			while (notas[i] < 0 | notas[i] > 10) {
				System.out.println("Digite uma nota válida: ");
				notas[i] = sc.nextDouble();
			}
		}
		
		for (int i=0; i<notas.length; i++) {
			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
			} 
			if (notas[i] < menorNota) {
				menorNota = notas[i];
			}
		}
		
		for (int i=0; i<notas.length; i++) {
			soma += notas[i];
		}
		
		media = soma / notas.length;
		
		System.out.println("Média das notas: " + media);
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Menor nota: " + menorNota);
		System.out.println();
		System.out.println("Programa finalizado com sucesso!");

		sc.close();

	}
}
