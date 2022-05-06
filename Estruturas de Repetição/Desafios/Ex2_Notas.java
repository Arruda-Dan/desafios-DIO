package desafios.dio.repeticoes;

import java.util.Scanner;

public class Ex2_Notas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota;
		String pare = " ";

		while (!pare.equals("n")) {
			System.out.println("Digite uma nota de 0 a 10: ");
			nota = sc.nextDouble();
			
			if (nota < 0 || nota > 10) {
				System.out.println("Digite uma nota válida");
				nota = sc.nextDouble();
			}
			
			System.out.println("Deseja continuar?");
			System.out.println("Para continuar digite s, caso contrário digite n");
			pare = sc.next();

		}
		
		System.out.println("Programa finalizado com sucesso!");

		sc.close();

	}
}
